package com.hansemerkur.lotteryappbackend.service;

import com.hansemerkur.lotteryappbackend.model.Winner;
import com.hansemerkur.lotteryappbackend.repository.EventRepository;
import com.hansemerkur.lotteryappbackend.repository.WinnerRepository;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class WinnerServiceImpl implements WinnerService {

    private final WinnerRepository winnerRepository;
    Random randomNumberGenerator = new Random(); //instance of random-class

    public WinnerServiceImpl(WinnerRepository winnerRepository) {
        this.winnerRepository = winnerRepository;
    }


    //Logic of generating winners with randomnumbergenerator
    @Override
    public List<Winner> selectWinners(Long eventHsvId) {
        List<Winner> participants = winnerRepository.findByEventHsvId(eventHsvId); //get participants
        List<Winner> winners = new ArrayList<>(); //List to save the winners
        List<Winner> substituteWinners = new ArrayList<>(); //List to save substitute winners


        //Choose ten random authorized winners
        for (int i = 0; i < 10; i++) {
            List<Winner> authorizedParticipants = participants.stream()
                    .filter(p -> p.getBlacklistCounter() == 0) // Only authorized participants
                    .collect(Collectors.toList());

            if (authorizedParticipants.isEmpty()) {
                break; //stop when no more authorized participants available
            }

            int index = randomNumberGenerator.nextInt(authorizedParticipants.size()); //Random Index
            Winner winner = authorizedParticipants.get(index); //Choose Winner
            winners.add(winner);//Add winner to winner list
            winner.setBlacklistCounter(3);
            winnerRepository.save(winner);
            participants.remove(winner); //Remove winner from Participants list
        }

        //Decreasing blacklist counter for all non-winning participants
        for (Winner participant : participants) {
            if (participant.getBlacklistCounter() > 0) {
                participant.setBlacklistCounter(participant.getBlacklistCounter() - 1);
                winnerRepository.save(participant);
            }
        }

        //Draw five substitute winners without increasing blacklist counter

        for (int i = 0; i < 5; i++) {
            List<Winner> authorizedParticipants = participants.stream()
                    .filter(p -> p.getBlacklistCounter() == 0)
                    .collect(Collectors.toList());
            if (authorizedParticipants.isEmpty()) {
                break;
            }

            int index = randomNumberGenerator.nextInt(authorizedParticipants.size()); // Random Index
            Winner substituteWinner = authorizedParticipants.get(index); //Choose substitute winners
            substituteWinners.add(substituteWinner); //Add substitute winners to the winner list
            participants.remove(substituteWinner); //Remove substitute winners from participant list
        }

        // Add substitute winners to the main winners list
        winners.addAll(substituteWinners);

        return winners;
    }
}
