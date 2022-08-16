package com.santiagoPosada.desafioddd.domain.complements.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.santiagoPosada.desafioddd.domain.complements.values.CourtID;
import com.santiagoPosada.desafioddd.domain.generics.PlayerID;

public class CourtPlayerIdAdded extends DomainEvent {

    private final PlayerID playerID;
    private final CourtID courtID;

    public CourtPlayerIdAdded(PlayerID playerID, CourtID courtID) {
        super("SantiagoPosada.complements.CourtPlayerIdAdded");
        this.courtID = courtID;
        this.playerID = playerID;
    }

    public PlayerID getPlayerID() {
        return playerID;
    }

    public CourtID getCourtID() {
        return courtID;
    }
}
