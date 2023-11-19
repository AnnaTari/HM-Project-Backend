package com.hansemerkur.lotteryappbackend.service;

import com.hansemerkur.lotteryappbackend.model.Winner;
import com.hansemerkur.lotteryappbackend.repository.WinnerRepository;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class WinnerServiceImpl implements WinnerService {

    private final WinnerRepository winnerRepository;

    //instance of random-class
    Random randomNumberGenerator = new Random();

    public WinnerServiceImpl(WinnerRepository winnerRepository) {
        this.winnerRepository = winnerRepository;
    }


    //Choosing winners with randomnumbergenerator
    @Override
    public List<Winner> selectWinners(Long eventHsvId) {
        List<Winner> participants = winnerRepository.findByEventHsvId(eventHsvId); //get participants
        List<Winner> winners = new ArrayList<>(); //List to save the winners
        List<Winner> substituteWinners = new ArrayList<>(); //List to save substitute winners


        //Choose ten random authorized winners
        for (int i = 0; i < 10; i++) {
            List<Winner> authorizedParticipants = participants.stream()
                    .filter(p -> p.getBlacklistCounter() == 0) //Only authorized participants whose blacklist counter is 0
                    .collect(Collectors.toList());

            //stop when no more authorized participants available
            if (authorizedParticipants.isEmpty()) {
                break;
            }

            int index = randomNumberGenerator.nextInt(authorizedParticipants.size()); //Random Index
            Winner winner = authorizedParticipants.get(index); //Choose Winner
            winners.add(winner);//Add winner to winner list
            winner.setBlacklistCounter(3);//set winner´s blacklist counter to 3
            winnerRepository.saveToAttendance(winner); //adapting attendance table
            participants.remove(winner); //Remove winner from Participants list
        }

        //Decreasing blacklist counter for all non-winning participants by 1
        for (Winner participant : participants) {
            if (participant.getBlacklistCounter() > 0) {
                participant.setBlacklistCounter(participant.getBlacklistCounter() - 1);
                winnerRepository.saveToAttendance(participant);
            }
        }

        //Draw five substitute winners without increasing blacklist counter
        for (int i = 0; i < 5; i++) {
            List<Winner> authorizedParticipants = participants.stream()
                    .filter(p -> p.getBlacklistCounter() == 0)
                    .collect(Collectors.toList());

            //stop when no more authorized participants available
            if (authorizedParticipants.isEmpty()) {
                break;
            }

            int index = randomNumberGenerator.nextInt(authorizedParticipants.size()); // Random Index
            Winner substituteWinner = authorizedParticipants.get(index); //Choose substitute winners
            substituteWinners.add(substituteWinner); //Add substitute winners to the winner list
            participants.remove(substituteWinner); //Remove substitute winners from participant list
        }


        winners.addAll(substituteWinners);

        return winners;
    }
}
