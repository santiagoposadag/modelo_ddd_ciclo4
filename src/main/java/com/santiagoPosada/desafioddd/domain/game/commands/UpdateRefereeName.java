package com.santiagoPosada.desafioddd.domain.game.commands;

import co.com.sofka.domain.generic.Command;
import com.santiagoPosada.desafioddd.domain.game.values.GameID;
import com.santiagoPosada.desafioddd.domain.game.values.Name;
import com.santiagoPosada.desafioddd.domain.game.values.RefereeID;

public class UpdateRefereeName extends Command {
    private final GameID gameID;
    private final RefereeID refereeID;
    private final Name name;


    public UpdateRefereeName(GameID gameID, RefereeID refereeID, Name name) {
        this.gameID = gameID;
        this.refereeID = refereeID;
        this.name = name;
    }

    public GameID getGameID() {
        return gameID;
    }

    public RefereeID getRefereeID() {
        return refereeID;
    }

    public Name getName() {
        return name;
    }
}
