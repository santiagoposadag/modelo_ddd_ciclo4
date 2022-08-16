package com.santiagoPosada.desafioddd.domain.game.commands;

import co.com.sofka.domain.generic.Command;
import com.santiagoPosada.desafioddd.domain.game.values.DateOfGame;
import com.santiagoPosada.desafioddd.domain.game.values.GameID;
import com.santiagoPosada.desafioddd.domain.generics.TournamentName;

public class CreateGame extends Command {
    private final GameID gameID;
    private final TournamentName tournamentName;
    private final DateOfGame dateOfGame;

    public CreateGame(GameID gameID, TournamentName tournamentName, DateOfGame dateOfGame) {
        this.gameID = gameID;
        this.tournamentName = tournamentName;
        this.dateOfGame = dateOfGame;
    }

    public GameID getGameID() {
        return gameID;
    }

    public TournamentName getTournamentName() {
        return tournamentName;
    }

    public DateOfGame getDateOfGame() {
        return dateOfGame;
    }
}
