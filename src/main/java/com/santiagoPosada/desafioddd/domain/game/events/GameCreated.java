package com.santiagoPosada.desafioddd.domain.game.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.santiagoPosada.desafioddd.domain.game.values.DateOfGame;
import com.santiagoPosada.desafioddd.domain.generics.TournamentName;

public class GameCreated extends DomainEvent {
    private final TournamentName tournamentName;
    private final DateOfGame dateOfGame;

    public GameCreated(TournamentName tournamentName, DateOfGame dateOfGame) {
        super("SantiagoPosada.Game.GameCreated");
        this.tournamentName = tournamentName;
        this.dateOfGame = dateOfGame;
    }

    public TournamentName getTournamentName() {
        return tournamentName;
    }

    public DateOfGame getDateOfGame() {
        return dateOfGame;
    }
}
