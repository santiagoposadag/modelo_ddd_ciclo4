package com.santiagoPosada.desafioddd.domain.game.commands;

import co.com.sofka.domain.generic.Command;
import com.santiagoPosada.desafioddd.domain.game.values.BallGuyID;
import com.santiagoPosada.desafioddd.domain.game.values.Clothes;
import com.santiagoPosada.desafioddd.domain.game.values.GameID;
import com.santiagoPosada.desafioddd.domain.game.values.Name;

public class AddBallGuy extends Command {
    private final GameID gameID;
    private final BallGuyID entityId;
    private final Name name;
    private final Clothes clothes;


    public AddBallGuy(GameID gameID, BallGuyID entityId, Name name, Clothes clothes) {
        this.gameID = gameID;
        this.entityId = entityId;
        this.name = name;
        this.clothes = clothes;
    }

    public GameID getGameID() {
        return gameID;
    }

    public BallGuyID getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }

    public Clothes getClothes() {
        return clothes;
    }
}
