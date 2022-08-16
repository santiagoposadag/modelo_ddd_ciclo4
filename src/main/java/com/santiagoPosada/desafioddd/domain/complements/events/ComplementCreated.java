package com.santiagoPosada.desafioddd.domain.complements.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.santiagoPosada.desafioddd.domain.game.values.GameID;
import com.santiagoPosada.desafioddd.domain.generics.TournamentName;

public class ComplementCreated extends DomainEvent {
    private final TournamentName tournamentName;
    private final GameID gameID;

    public ComplementCreated(TournamentName tournamentName, GameID gameID) {
        super("SantiagoPosada.Complement.ComplementCreated");
        this.tournamentName = tournamentName;
        this.gameID = gameID;
    }

    public GameID getGameID() {
        return gameID;
    }

    public TournamentName getTournamentName() {
        return tournamentName;
    }
}
