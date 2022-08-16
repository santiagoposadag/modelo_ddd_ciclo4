package com.santiagoPosada.desafioddd.domain.complements.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.santiagoPosada.desafioddd.domain.complements.values.RacketID;
import com.santiagoPosada.desafioddd.domain.generics.PlayerID;

public class RacketPlayerIdAdded extends DomainEvent {

    private final PlayerID playerID;
    private final RacketID racketID;

    public RacketPlayerIdAdded(PlayerID playerID, RacketID racketID) {
        super("SantiagoPosad.Complements.RacketPlayerIdAdded");
        this.playerID = playerID;
        this.racketID = racketID;
    }

    public PlayerID getPlayerID() {
        return playerID;
    }

    public RacketID getRacketID() {
        return racketID;
    }
}
