package com.santiagoPosada.desafioddd.domain.game;

import co.com.sofka.domain.generic.EventChange;
import com.santiagoPosada.desafioddd.domain.game.events.*;
import com.santiagoPosada.desafioddd.domain.generics.events.TournamentNameUpdated;

import java.util.HashSet;

public class GameChange extends EventChange {
    public GameChange(Game game){
        apply((GameCreated event)->{
            game.tournamentName = event.getTournamentName();
            game.dateOfGame = event.getDateOfGame();
            game.BallGuys = new HashSet<>();
            game.players = new HashSet<>();
            game.referees = new HashSet<>();
        });

        apply((BallGuyAdded event)->{
            var numberOfBallGuys = game.ballGuys().size();
            if(numberOfBallGuys == 6){
                throw new IllegalArgumentException("You cant add more ball guys to the game");
            }
            game.BallGuys.add(new BallGuy(
                    event.getEntityId(),
                    event.getName(),
                    event.getClothes()
            ));
        });

        apply((TournamentNameUpdated event)->{
            game.tournamentName =event.getTournamentName();
        });

        apply((BallGuyClothesChanged event)->{
            var ballGuy = game.getBallGuyById(event.getBallGuyID()).orElseThrow(()->new IllegalArgumentException("Invalid id to reacj the ball guy"));
            ballGuy.updateClothes(event.getClothes());
        });

        apply((BallGuyNameUpdated event)->{
            var ballGuy = game.getBallGuyById(event.getBallGuyID()).orElseThrow(()->new IllegalArgumentException("Invalid id to reach the ball buy"));
            ballGuy.updateName(event.getName());
        });

        apply((DateOfGameChanged event)->{
            game.dateOfGame = event.getDateOfGame();
        });

        apply((PlayerAdded event)->{
           var numOfPlayersInGame = game.players().size();
           if (numOfPlayersInGame == 2){
               throw new IllegalArgumentException("Maximum amount of player reached, you cant add more");
           }
           game.players.add(new Player(
                   event.getPlayerID(),
                   event.getName()
           ));
        });

        apply((PlayerGamesWonUpdated event)->{
            var player = game.getPlayerById(event.getPlayerID()).orElseThrow(()->new IllegalArgumentException("We couldnt reach theplayer with the id provided"));
            player.updateGamesWon(event.getGamesWon());
        });

        apply((PlayerNameUpdated event)->{
            var player = game.getPlayerById(event.getPlayerID()).orElseThrow(()->new IllegalArgumentException("We couldnt reach theplayer with the id provided"));
            player.updateName(event.getName());
        });

        apply((PlayerTestimonyAdded event)->{
            var player = game.getPlayerById(event.getPlayerID()).orElseThrow(()->new IllegalArgumentException("We couldnt reach theplayer with the id provided"));
            player.addExperienceTestimony(event.getExperienceTestimony());
        });

        apply((RefereeAdded event)->{
            var numberOfReferees = game.referees().size();
            if (numberOfReferees >= 4){
                throw new IllegalArgumentException("You have reached the maximum amount of referees per game");
            }
            game.referees.add(new Referee(event.getEntityId(), event.getName(), event.getRefereeType(), event.getClothes()));
        });

        apply((RefereeClothesChanged event)->{
            var referee = game.getRefereeById(event.getRefereeID()).orElseThrow(()->new IllegalArgumentException("Wrong id to reach the referee"));
            referee.changeClothes(event.getClothes());
        });

        apply((RefereeNameUpdated event)->{
            var referee = game.getRefereeById(event.getRefereeID()).orElseThrow(()->new IllegalArgumentException("Wrong id to reach the referee"));
            referee.updateName(event.getName());
        });

        apply((RefereeTypeChanged event)->{
            var referee = game.getRefereeById(event.getRefereeID()).orElseThrow(()->new IllegalArgumentException("Wrong id to reach the referee"));
            referee.changeType(event.getRefereeType());
        });
    }
}
