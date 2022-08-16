package com.santiagoPosada.desafioddd.domain.game.commands;

import co.com.sofka.domain.generic.Command;
import com.santiagoPosada.desafioddd.domain.game.values.GameID;
import com.santiagoPosada.desafioddd.domain.game.values.RefereeID;
import com.santiagoPosada.desafioddd.domain.game.values.RefereeType;

public class ChangeRefereeType extends Command {
    private final GameID gameID;
    private final RefereeID refereeID;
    private final RefereeType refereeType;


    public ChangeRefereeType(GameID gameID, RefereeID refereeID, RefereeType refereeType) {
        this.gameID = gameID;
        this.refereeID = refereeID;
        this.refereeType = refereeType;
    }

    public GameID getGameID() {
        return gameID;
    }

    public RefereeID getRefereeID() {
        return refereeID;
    }

    public RefereeType getRefereeType() {
        return refereeType;
    }
}
