package com.hansemerkur.lotteryappbackend.service;

import com.hansemerkur.lotteryappbackend.model.Event;
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

    public WinnerServicelmpl(WinnerRepository winnerRepository) {
        this.winnerRepository = winnerRepository;
    }

//Logic of generating winners with randomnumbergenerator

    //fetching participants
    public List<Winner> selectWinners(Long eventHsvId) {
        List<Winner> participants = winnerRepository.findByEventHsvId(eventHsvId);

//    List<String> participants = new ArrayList<>();
//    participants.add("Teilnehmer 1");
//    participants.add("Teilnehmer 2");
//    participants.add("Teilnehmer 3");
//    participants.add("Teilnehmer 4");
//    participants.add("Teilnehmer 5");
//    participants.add("Teilnehmer 6");
//    participants.add("Teilnehmer 7");
//    participants.add("Teilnehmer 8");
//    participants.add("Teilnehmer 9");
//    participants.add("Teilnehmer 10");
//    participants.add("Teilnehmer 11");
//    participants.add("Teilnehmer 12");
//    participants.add("Teilnehmer 13");
//    participants.add("Teilnehmer 14");
//    participants.add("Teilnehmer 15");
//    participants.add("Teilnehmer 16");

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
                break; // No more authorized participants
            }
        }
        int index = randomNumberGenerator.nextInt(authorizedParticipants.size()); //Random Index
        Winner winner = authorizedParticipants.get(index); //Choose Winner
        winners.add(winner);//Add winner to winner list
        winner.setBlacklistCounter(3);
        winnerRepository.save(winner);
        participants.remove(winner); //Remove winner from list
    }

    // Decrement blacklist counter for all non-winning participants
        for(
    Winner participant :participants)

    {
        if (participant.getBlacklistCounter() > 0) {
            participant.setBlacklistCounter(participant.getBlacklistCounter() - 1);
            winnerRepository.save(participant);
        }
    }
        return winners;
}

//
//    //Print out the ten random winners
//    System.out.println("Die Gewinner sind:");
//    for (String winnerName : winners) {
//      System.out.println(winnerName);
//    }
//
//
//
//    //Draw five substitute winners without adding them to the blacklist
//    List<String> substituteWinners = new ArrayList<>();
//    for (int i = 0; i < 5; i++) {
//      List<String> authorizedParticipants = new ArrayList<>(participants);
//      authorizedParticipants.removeAll(winners); //Remove previous winners from the list
//
//      int index = randomNumberGenerator.nextInt(authorizedParticipants.size()); // Random Index
//      String substituteWinnerName = authorizedParticipants.get(index); //Choose substitute winners
//      substituteWinners.add(substituteWinnerName); //Add substitute winners to the winner list
//      participants.remove(index); //Remove substitute winners from participant list
//    }
//
//    //Print out the five random substitute winners
//    System.out.println("Die Ersatzgewinner sind:");
//    for (String substituteWinnerName : substituteWinners) {
//      System.out.println(substituteWinnerName);
//    }
//  }
//}