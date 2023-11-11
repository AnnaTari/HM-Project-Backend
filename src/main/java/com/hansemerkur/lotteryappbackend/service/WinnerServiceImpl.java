package com.hansemerkur.lotteryappbackend.service;

import com.hansemerkur.lotteryappbackend.model.Winner;
import com.hansemerkur.lotteryappbackend.repository.EventRepository;
import com.hansemerkur.lotteryappbackend.repository.WinnerRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Random;

@Service
public class WinnerServiceImpl implements WinnerService {

    private final WinnerRepository winnerRepository;


    public WinnerServiceImpl(WinnerRepository winnerRepository) {
        this.winnerRepository = winnerRepository;
    }


//Logic of generating winners with randomnumbergenerator

    //fetching participants
    @Override
    public List<Winner> selectWinners(Long eventHsvId) {
        List<Winner> participants = null;
        return participants;
    }

    //Random number generator is instance of random-class
        Random randomNumberGenerator = new Random();

        //List to save the winners
        List<Winner> winners = new ArrayList<>();

        //Choose ten random authorized winners
        for (int i = 0; i < 10; i++) {
            List<Winner> authorizedParticipants = participants.stream()
                    .filter(p -> p.getBlacklistCounter() == 0) // Only authorized participants
                    .collect(Collectors.toList());

            if (authorizedParticipants.isEmpty()) {
                break; // No more authorized participants available
            }
        }
        int index = randomNumberGenerator.nextInt(authorizedParticipants.size()); //Random Index
        Winner winner = authorizedParticipants.get(index); //Choose Winner
        winners.add(winner);//Add winner to winner list
        winner.setBlacklistCounter(3);
        winnerRepository.save(winner);
        participants.remove(winner); //Remove winner from list


    // Decrement blacklist counter for all non-winning participants
        for(
     Winner participant : participants)

    {
        if (participant.getBlacklistCounter() > 0) {
            participant.setBlacklistCounter(participant.getBlacklistCounter() - 1);
            winnerRepository.save(participant);
        }
    }
        return winners;



    //Draw five substitute winners without increasing blacklist counter
    List<String> substituteWinners = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      List<String> authorizedParticipants = new ArrayList<>(participants);
      authorizedParticipants.removeAll(winners); //Remove previous winners from the list

      int index = randomNumberGenerator.nextInt(authorizedParticipants.size()); // Random Index
      String substituteWinnerName = authorizedParticipants.get(index); //Choose substitute winners
      substituteWinners.add(substituteWinnerName); //Add substitute winners to the winner list
      participants.remove(index); //Remove substitute winners from participant list
    }

  }
