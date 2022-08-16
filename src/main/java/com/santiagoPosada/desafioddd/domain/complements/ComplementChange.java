package com.santiagoPosada.desafioddd.domain.complements;

import co.com.sofka.domain.generic.EventChange;
import com.santiagoPosada.desafioddd.domain.complements.events.*;
import com.santiagoPosada.desafioddd.domain.generics.events.TournamentNameUpdated;

import java.util.HashSet;

public class ComplementChange extends EventChange {

    public ComplementChange(Complement complement){
        apply((ComplementCreated event)->{
           complement.tournamentName = event.getTournamentName();
           complement.courts = new HashSet<>();
           complement.balls = new HashSet<>();
           complement.rackets = new HashSet<>();
        });

        apply((TournamentNameUpdated event)->{
           complement.tournamentName = event.getTournamentName();
        });

        apply((BallAdded event)->{
            var numberOfBallsAssignedPerGame = complement.balls().size();
            if (numberOfBallsAssignedPerGame == 50){
                throw new IllegalArgumentException("You have reached the maximum amount of balls assigned pér game");
            }

            complement.balls.add(new Ball(event.getBallID(), event.getColor(), event.getBrand()));
        });

        apply((BallBrandChanged event)->{
            var ball = complement.getBallById(event.getBallID()).orElseThrow(()->new IllegalArgumentException("Wrong ball id"));
            ball.updateBrand(event.getBrand());
        });

        apply((BallColorChanged event)->{
            var ball = complement.getBallById(event.getBallID()).orElseThrow(()->new IllegalArgumentException("Wrong ball id"));
            ball.updateColor(event.getColor());
        });

        apply((CourtAdded event)->{
            var numberOfCourts = complement.courts().size();
            if(numberOfCourts == 1){
                throw new IllegalArgumentException("Maximum amount of courts reched");
            }
            complement.courts.add(new Court(event.getCourtID(), event.getFieldType(), event.getLocation()));
        });

        apply((CourtFieldTypeChanged event)->{
            var court = complement.getCourtById(event.getCourtID()).orElseThrow(()->new IllegalArgumentException("WrongId to get the court"));
            court.changeFieldType(event.getFieldType());
        });

        apply((CourtLocationChanged event)->{
            var court = complement.getCourtById(event.getCourtID()).orElseThrow(()->new IllegalArgumentException("WrongId to get the court"));
            court.changeLocation(event.getLocation());
        });

        apply((CourtPlayerIdAdded event)->{
            var court = complement.getCourtById(event.getCourtID()).orElseThrow(()->new IllegalArgumentException("WrongId to get the court"));
            var numberOfPlayersInCourt = court.playersIds().size();
            if (numberOfPlayersInCourt == 2){
                throw new IllegalArgumentException("Maximum amount of player in court reached");
            }
            court.addPlayerID(event.getPlayerID());
        });

        apply((RacketAdded event)->{
            var numberOfRackets = complement.rackets().size();
            if(numberOfRackets == 6){
                throw new IllegalArgumentException("Maximum amount of rackets reached");
            }
            complement.rackets.add(new Racket(event.getRacketID(), event.getBrand(), event.getGripColor()));
        });

        apply((RackedBrandChanged event)->{
            var racket = complement.getRacketById(event.getRacketID()).orElseThrow(()->new IllegalArgumentException("Couldnt reacj the racket with the id provided"));
            racket.changeBrand(event.getBrand());
        });

        apply((RacketGripColorChanged event)->{
            var racket = complement.getRacketById(event.getRacketID()).orElseThrow(()->new IllegalArgumentException("Couldnt reacj the racket with the id provided"));
            racket.changeGripColor(event.getGripColor());
        });

        apply((RacketPlayerIdAdded event)->{
            var racket = complement.getRacketById(event.getRacketID()).orElseThrow(()->new IllegalArgumentException("Couldnt reacj the racket with the id provided"));
            racket.addOwnerPlayerID(event.getPlayerID());
        });
    }
}
