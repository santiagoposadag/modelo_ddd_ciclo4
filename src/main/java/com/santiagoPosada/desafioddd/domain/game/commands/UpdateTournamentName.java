package com.santiagoPosada.desafioddd.domain.game.commands;

import co.com.sofka.domain.generic.Command;
import com.santiagoPosada.desafioddd.domain.game.values.GameID;
import com.santiagoPosada.desafioddd.domain.generics.TournamentName;

public class UpdateTournamentName extends Command {

    private final GameID gameID;
    private final TournamentName tournamentName;

    public UpdateTournamentName(GameID gameID, TournamentName tournamentName){
        this.gameID = gameID;
        this.tournamentName = tournamentName;
    }

    public GameID getGameID() {
        return gameID;
    }

    public TournamentName getTournamentName() {
        return tournamentName;
    }
}
