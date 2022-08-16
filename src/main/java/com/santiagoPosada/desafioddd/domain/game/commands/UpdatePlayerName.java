package com.santiagoPosada.desafioddd.domain.game.commands;

import co.com.sofka.domain.generic.Command;
import com.santiagoPosada.desafioddd.domain.game.values.GameID;
import com.santiagoPosada.desafioddd.domain.game.values.Name;
import com.santiagoPosada.desafioddd.domain.generics.PlayerID;

public class UpdatePlayerName extends Command {
    private final GameID gameID;
    private final PlayerID playerID;
    private final Name name;


    public UpdatePlayerName(GameID gameID, PlayerID playerID, Name name) {
        this.gameID = gameID;
        this.playerID = playerID;
        this.name = name;
    }

    public GameID getGameID() {
        return gameID;
    }

    public PlayerID getPlayerID() {
        return playerID;
    }

    public Name getName() {
        return name;
    }
}
