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

//Implementation of method selectWinners
@Service
public class WinnerServiceImpl implements WinnerService {

    private final WinnerRepository winnerRepository;
    private final EventRepository eventRepository;

    public WinnerServiceImpl(WinnerRepository winnerRepository, EventRepository eventRepository) {
        this.winnerRepository = winnerRepository;
        this.eventRepository = eventRepository;
    }

    //Retrieve participants for a specific event and create lists to store winners and substitute winners
    @Override
    public List<Winner> selectWinners(Long eventHsvId) {
        List<Winner> participants = winnerRepository.findByEventHsvId(eventHsvId); //Get participants
        List<Winner> winners = new ArrayList<>(); //List to save the winners
        List<Winner> substituteWinners = new ArrayList<>(); //List to save substitute winners

        //Instance of random class
        Random randomNumberGenerator = new Random();

        //Retrieve event object using eventRepository and get the ticketAmount
        Event event = eventRepository.findEvent(eventHsvId);
        int ticketAmount = event.getTicketAmount();

        //Choose predefined amount of random authorized winners
        for (int i = 0; i < ticketAmount ; i++) {
            List<Winner> authorizedParticipants = participants.stream()
                    .filter(p -> p.getBlacklistCounter() == 0) //Only authorized participants whose blacklist counter is 0
                    .collect(Collectors.toList());

            //Stop if no more authorized participants available
            if (authorizedParticipants.isEmpty()) {
                break;
            }

            int index = randomNumberGenerator.nextInt(authorizedParticipants.size()); //Random Index
            Winner winner = authorizedParticipants.get(index); //Choose Winner
            winners.add(winner);//Add winner to winner list
            winner.setWinner(true); //Set boolean "winner" true
            winnerRepository.saveToAttendance(winner); //Adapting attendance table
            participants.remove(winner); //Remove winner from Participants list
            winnerRepository.maximizeBlacklistCounter(winner); //Set winner´s blacklist counter to 3
        }

        //Decrease blacklist counter for all non-winning participants by 1
        for (Winner participant : participants) {
            winnerRepository.decreaseBlacklistCounter(participant);
        }

        //Draw five substitute winners without increasing blacklist counter
        for (int i = 0; i < 5; i++) {
            List<Winner> authorizedParticipants = participants.stream()
                    .filter(p -> p.getBlacklistCounter() == 0)
                    .collect(Collectors.toList());

            //Stop if no more authorized participants available
            if (authorizedParticipants.isEmpty()) {
                break;
            }

            int index = randomNumberGenerator.nextInt(authorizedParticipants.size()); // Random Index
            Winner substituteWinner = authorizedParticipants.get(index); //Choose substitute winners
            substituteWinner.setSubstituteWinner(true); //Set boolean "substituteWinner" true
            substituteWinners.add(substituteWinner); //Add a single substitute winner to the substitute winners list
            participants.remove(substituteWinner); //Remove substitute winners from participant list
        }

        //Add all elements from substitute winner list to winner list
        winners.addAll(substituteWinners);

        return winners;
    }
}
