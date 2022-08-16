package com.santiagoPosada.desafioddd.domain.game.commands;

import co.com.sofka.domain.generic.Command;
import com.santiagoPosada.desafioddd.domain.game.values.Clothes;
import com.santiagoPosada.desafioddd.domain.game.values.GameID;
import com.santiagoPosada.desafioddd.domain.game.values.RefereeID;

public class ChangeRefereeClothes extends Command {
    private final GameID gameID;
    private final RefereeID refereeID;
    private final Clothes clothes;


    public ChangeRefereeClothes(GameID gameID, RefereeID refereeID, Clothes clothes) {
        this.gameID = gameID;
        this.refereeID = refereeID;
        this.clothes = clothes;
    }

    public GameID getGameID() {
        return gameID;
    }

    public RefereeID getRefereeID() {
        return refereeID;
    }

    public Clothes getClothes() {
        return clothes;
    }
}
