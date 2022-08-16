package com.santiagoPosada.desafioddd.domain.game.commands;

import co.com.sofka.domain.generic.Command;
import com.santiagoPosada.desafioddd.domain.game.values.GameID;
import com.santiagoPosada.desafioddd.domain.game.values.Name;
import com.santiagoPosada.desafioddd.domain.generics.PlayerID;

public class AddPlayer extends Command {
    private final GameID gameID;
    private final PlayerID entityId;
    private final Name name;


    public AddPlayer(GameID gameID, PlayerID entityId, Name name) {
        this.gameID = gameID;
        this.entityId = entityId;
        this.name = name;
    }

    public GameID getGameID() {
        return gameID;
    }

    public PlayerID getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }
}
