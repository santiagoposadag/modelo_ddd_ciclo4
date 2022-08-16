package com.santiagoPosada.desafioddd.domain.complements.commands;

import co.com.sofka.domain.generic.Command;
import com.santiagoPosada.desafioddd.domain.complements.values.ComplementID;
import com.santiagoPosada.desafioddd.domain.game.values.GameID;
import com.santiagoPosada.desafioddd.domain.generics.TournamentName;

public class CreateComplement extends Command {
    private final ComplementID complementID;
    private final TournamentName tournamentName;
    private final GameID gameID;

    public CreateComplement(ComplementID complementID, TournamentName tournamentName, GameID gameID) {
        this.complementID = complementID;
        this.tournamentName = tournamentName;
        this.gameID = gameID;
    }

    public GameID getGameID() {
        return gameID;
    }

    public ComplementID getComplementID() {
        return complementID;
    }

    public TournamentName getTournamentName() {
        return tournamentName;
    }
}
