package com.santiagoPosada.desafioddd.domain.game.commands;

import co.com.sofka.domain.generic.Command;
import com.santiagoPosada.desafioddd.domain.game.values.DateOfGame;
import com.santiagoPosada.desafioddd.domain.game.values.GameID;

public class ChangeDateOfGame extends Command {
    private final GameID gameID;
    private final DateOfGame dateOfGame;

    public ChangeDateOfGame(GameID gameID, DateOfGame dateOfGame) {
        this.gameID = gameID;
        this.dateOfGame = dateOfGame;
    }

    public GameID getGameID() {
        return gameID;
    }

    public DateOfGame getDateOfGame() {
        return dateOfGame;
    }
}
