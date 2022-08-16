package com.santiagoPosada.desafioddd.domain.complements;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.santiagoPosada.desafioddd.domain.complements.events.*;
import com.santiagoPosada.desafioddd.domain.complements.values.*;
import com.santiagoPosada.desafioddd.domain.game.values.GameID;
import com.santiagoPosada.desafioddd.domain.generics.PlayerID;
import com.santiagoPosada.desafioddd.domain.generics.TournamentName;
import com.santiagoPosada.desafioddd.domain.generics.events.NotificationSent;
import com.santiagoPosada.desafioddd.domain.generics.events.TournamentNameUpdated;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Complement extends AggregateEvent<ComplementID> {
    protected TournamentName tournamentName;
    protected GameID gameID;
    protected Set<Ball> balls;
    protected Set<Racket> rackets;
    protected Set<Court> courts;


    public Complement(ComplementID entityId, TournamentName tournamentName, GameID gameID) {
        super(entityId);
        appendChange(new ComplementCreated(tournamentName, gameID)).apply();
    }

    private Complement(ComplementID entityId){
        super(entityId);
        subscribe(new ComplementChange(this));
    }

    public static Complement from(ComplementID complementID, List<DomainEvent> events){
        var complement = new Complement(complementID);
        events.forEach(complement::applyEvent);
        return complement;
    }

    //----------

    public void notifyProviders(String message){
        Objects.requireNonNull(message);
        appendChange(new NotificationSent(message)).apply();
    }

    public void updateTournamentName(TournamentName tournamentName){
        Objects.requireNonNull(tournamentName);
        appendChange(new TournamentNameUpdated(tournamentName)).apply();
    }

    public void addRacket(RacketID entityId, Brand brand, GripColor gripColor){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(brand);
        Objects.requireNonNull(gripColor);
        appendChange(new RacketAdded(entityId, brand, gripColor)).apply();
    }

    public void addBall(BallID entityId, Color color, Brand brand){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(brand);
        Objects.requireNonNull(color);
        appendChange(new BallAdded(entityId, color, brand)).apply();
    }

    public void addCourt(CourtID entityId, FieldType fieldType, Location location){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(fieldType);
        Objects.requireNonNull(location);
        appendChange(new CourtAdded(entityId, fieldType, location)).apply();
    }

    public void changeBallBrand(BallID ballID, Brand brand){
        Objects.requireNonNull(ballID);
        Objects.requireNonNull(brand);
        appendChange(new BallBrandChanged(ballID, brand)).apply();
    }

    public void changeBallColor(BallID ballID, Color color){
        Objects.requireNonNull(ballID);
        Objects.requireNonNull(color);
        appendChange(new BallColorChanged(ballID, color)).apply();
    }

    public void changeRacketBrand(RacketID racketID, Brand brand){
        Objects.requireNonNull(racketID);
        Objects.requireNonNull(brand);
        appendChange(new RackedBrandChanged(racketID, brand)).apply();
    }

    public void changeRacketGripColor(RacketID racketID, GripColor gripColor){
        Objects.requireNonNull(racketID);
        Objects.requireNonNull(gripColor);
        appendChange(new RacketGripColorChanged(racketID, gripColor)).apply();
    }

    public void changeCourtFieldType(CourtID courtID, FieldType fieldType){
        Objects.requireNonNull(courtID);
        Objects.requireNonNull(fieldType);
        appendChange(new CourtFieldTypeChanged(courtID, fieldType)).apply();
    }

    public void changeCourtLocation(CourtID courtID, Location location){
        Objects.requireNonNull(courtID);
        Objects.requireNonNull(location);
        appendChange(new CourtLocationChanged(courtID, location)).apply();
    }

    public void addRacketPlayerID(PlayerID playerID, RacketID racketID){
        Objects.requireNonNull(playerID);
        Objects.requireNonNull(racketID);
        appendChange(new RacketPlayerIdAdded(playerID, racketID)).apply();
    }

    public void addCourtPlayerID(PlayerID playerID, CourtID courtID){
        Objects.requireNonNull(playerID);
        Objects.requireNonNull(courtID);
        appendChange(new CourtPlayerIdAdded(playerID, courtID)).apply();
    }

    public Optional<Ball> getBallById(BallID ballID){
        return balls().stream().filter(ball -> ball.identity().equals(ballID)).findFirst();
    }

    public Optional<Racket> getRacketById(RacketID racketID){
        return rackets().stream().filter(racket -> racket.identity().equals(racketID)).findFirst();
    }

    public Optional<Court> getCourtById(CourtID courtID){
        return courts().stream().filter(court -> court.identity().equals(courtID)).findFirst();
    }

    public TournamentName tournamentName() {
        return tournamentName;
    }

    public Set<Ball> balls() {
        return balls;
    }

    public Set<Racket> rackets() {
        return rackets;
    }

    public Set<Court> courts() {
        return courts;
    }
}
