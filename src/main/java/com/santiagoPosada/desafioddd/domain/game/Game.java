package com.santiagoPosada.desafioddd.domain.game;



import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.santiagoPosada.desafioddd.domain.complements.events.ComplementCreated;
import com.santiagoPosada.desafioddd.domain.complements.values.ComplementID;
import com.santiagoPosada.desafioddd.domain.game.events.*;
import com.santiagoPosada.desafioddd.domain.game.values.*;
import com.santiagoPosada.desafioddd.domain.generics.PlayerID;
import com.santiagoPosada.desafioddd.domain.generics.TournamentName;
import com.santiagoPosada.desafioddd.domain.generics.events.NotificationSent;
import com.santiagoPosada.desafioddd.domain.generics.events.TournamentNameUpdated;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;


public class Game extends AggregateEvent<GameID> {

    protected TournamentName tournamentName;
    protected DateOfGame dateOfGame;
    protected Set<Player> players;
    protected Set<Referee> referees;
    protected Set<BallGuy> BallGuys;


    public Game(GameID entityId, TournamentName tournamentName, DateOfGame dateOfGame) {
        super(entityId);
        appendChange(new GameCreated(tournamentName, dateOfGame)).apply();
    }

    private Game(GameID gameID){
        super(gameID);
        subscribe(new GameChange(this));
    }

    public static Game from(GameID gameID, List<DomainEvent> events){
        var game = new Game(gameID);
        events.forEach(game::applyEvent);
        return game;
    }

    public void updateTournamentName(TournamentName tournamentName){
        Objects.requireNonNull(tournamentName);
        appendChange(new TournamentNameUpdated(tournamentName)).apply();
    }
    //-------
    public void notifyPublicty(String message){
        Objects.requireNonNull(message);
        appendChange(new NotificationSent(message)).apply();
    }

    public void changeDateOfGame(DateOfGame dateOfGame){
        Objects.requireNonNull(dateOfGame);
        appendChange(new DateOfGameChanged(dateOfGame)).apply();
    }

    public void addReferee(RefereeID entityId, Name name, RefereeType refereeType, Clothes clothes){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(name);
        Objects.requireNonNull(refereeType);
        Objects.requireNonNull(clothes);
        appendChange(new RefereeAdded(entityId, name, refereeType, clothes)).apply();
    }

    public void addPlayer(PlayerID entityId, Name name){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(name);
        appendChange(new PlayerAdded(entityId, name)).apply();
    }

    public void addBallGuy(BallGuyID entityId, Name name, Clothes clothes){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(name);
        Objects.requireNonNull(clothes);
        appendChange(new BallGuyAdded(entityId, name, clothes)).apply();
    }

    public void updatePlayerName(PlayerID playerID, Name name){
        Objects.requireNonNull(playerID);
        Objects.requireNonNull(name);
        appendChange(new PlayerNameUpdated(playerID, name)).apply();
    }

    public void updatePlayerGamesWon(PlayerID playerID, GamesWon gamesWon){
        Objects.requireNonNull(playerID);
        Objects.requireNonNull(gamesWon);
        appendChange(new PlayerGamesWonUpdated(playerID, gamesWon)).apply();
    }

    public void addPlayerTestimony(PlayerID playerID, ExperienceTestimony experienceTestimony){
        Objects.requireNonNull(playerID);
        Objects.requireNonNull(experienceTestimony);
        appendChange(new PlayerTestimonyAdded(playerID, experienceTestimony)).apply();
    }

    public void updateBallGuyName(BallGuyID ballGuyID, Name name){
        Objects.requireNonNull(ballGuyID);
        Objects.requireNonNull(name);
        appendChange(new BallGuyNameUpdated(ballGuyID, name)).apply();
    }

    public void changeBallGuyClothes(BallGuyID ballGuyID, Clothes clothes){
        Objects.requireNonNull(ballGuyID);
        Objects.requireNonNull(clothes);
        appendChange(new BallGuyClothesChanged(ballGuyID, clothes)).apply();
    }


    public void updateRefereeName(RefereeID refereeID, Name name){
        Objects.requireNonNull(refereeID);
        Objects.requireNonNull(name);
        appendChange(new RefereeNameUpdated(refereeID, name)).apply();
    }

    public void changeRefereeClothes(RefereeID refereeID, Clothes clothes){
        Objects.requireNonNull(refereeID);
        Objects.requireNonNull(clothes);
        appendChange(new RefereeClothesChanged(refereeID, clothes)).apply();
    }

    public void changeRefereeType(RefereeID refereeID, RefereeType refereeType){
        Objects.requireNonNull(refereeID);
        Objects.requireNonNull(refereeID);
        appendChange(new RefereeTypeChanged(refereeID, refereeType)).apply();
    }

    public Optional<Referee> getRefereeById(RefereeID refereeID){
        return referees().stream().filter((referee -> referee.identity().equals(refereeID))).findFirst();
    }

    public Optional<Player> getPlayerById(PlayerID playerID){
        return players().stream().filter((player -> player.identity().equals(playerID))).findFirst();
    }
    public Optional<BallGuy> getBallGuyById(BallGuyID ballGuyID){
        return ballGuys().stream().filter((ballGuy -> ballGuy.identity().equals(ballGuyID))).findFirst();
    }

    public TournamentName tournamentName() {
        return tournamentName;
    }

    public DateOfGame dateOfGame() {
        return dateOfGame;
    }

    public Set<Player> players() {
        return players;
    }

    public Set<Referee> referees() {
        return referees;
    }

    public Set<BallGuy> ballGuys() {
        return BallGuys;
    }
}
