package com.hansemerkur.lotteryappbackend.service;

import com.hansemerkur.lotteryappbackend.model.Event;
import com.hansemerkur.lotteryappbackend.model.Winner;
import com.hansemerkur.lotteryappbackend.repository.EventRepository;
import com.hansemerkur.lotteryappbackend.repository.WinnerRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class WinnerServiceImpl implements WinnerService {

    private final WinnerRepository winnerRepository;

    public WinnerServicelmpl(WinnerRepository winnerRepository) {
        this.winnerRepository = winnerRepository;
    }

    @Override
    public List<Winner> getAllWinners() {
        return winnerRepository.getAllWinners();
    }

    @Override
    public List<Winner> nameWinner(Winner winner) {
        return winnerRepository.nameWinner(winner);
    }
}

//Logic of generating winners with randomnumbergenerator
//public class LotteryProcedure {
//
//  //Create participant list
//  public static void main(String[] args) {
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
//
//    //Random number generator is instance of random-class
//    Random randomNumberGenerator = new Random();
//
//    //List to save the winners
//    List<String> winners = new ArrayList<>();
//
//    //Blacklist for already chosen winners
//    List<String> blacklist = new ArrayList<>();
//
//    //Choose ten random authorized winners
//    for (int i = 0; i < 10; i++) {
//      List<String> authorizedParticipants  = new ArrayList<>(participants);
//      authorizedParticipants.removeAll(blacklist); //Remove participants which are on the blacklist
//
//      int index = randomNumberGenerator.nextInt(authorizedParticipants.size()); //Random Index
//      String winnerName = authorizedParticipants.get(index); //Choose Winner
//      winners.add(winnerName); //Add winner to winner list
//      participants.remove(index); //Remove winner from list
//      blacklist.add(winnerName); //Add winner to blacklist
//    }
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