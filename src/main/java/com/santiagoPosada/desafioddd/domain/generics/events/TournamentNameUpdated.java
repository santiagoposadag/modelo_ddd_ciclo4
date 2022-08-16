package com.santiagoPosada.desafioddd.domain.generics.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.santiagoPosada.desafioddd.domain.generics.TournamentName;

public class TournamentNameUpdated extends DomainEvent {
    private final TournamentName tournamentName;

    public TournamentNameUpdated(TournamentName tournamentName) {
        super("SantiagoPosada.TournamentNameUpdated");
        this.tournamentName = tournamentName;
    }

    public TournamentName getTournamentName() {
        return tournamentName;
    }
}
