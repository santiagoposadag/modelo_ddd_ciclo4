package com.santiagoPosada.desafioddd.domain.game.commands;

import co.com.sofka.domain.generic.Command;
import com.santiagoPosada.desafioddd.domain.game.values.*;

public class AddReferee extends Command {
    private final GameID gameID;
    private final RefereeID entityId;
    private final Name name;
    private final RefereeType refereeType;
    private final Clothes clothes;

    public AddReferee(GameID gameID, RefereeID entityId, Name name, RefereeType refereeType, Clothes clothes) {
        this.gameID = gameID;
        this.entityId = entityId;
        this.name = name;
        this.refereeType = refereeType;
        this.clothes = clothes;
    }

    public GameID getGameID() {
        return gameID;
    }

    public RefereeID getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }

    public RefereeType getRefereeType() {
        return refereeType;
    }

    public Clothes getClothes() {
        return clothes;
    }
}
