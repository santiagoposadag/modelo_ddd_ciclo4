package com.santiagoPosada.desafioddd.domain.complements.commands;

import co.com.sofka.domain.generic.Command;
import com.santiagoPosada.desafioddd.domain.complements.values.ComplementID;
import com.santiagoPosada.desafioddd.domain.complements.values.RacketID;
import com.santiagoPosada.desafioddd.domain.generics.PlayerID;

public class AddRacketPlayerID extends Command {
    private final ComplementID complementID;
    private final PlayerID playerID;
    private final RacketID racketID;


    public AddRacketPlayerID(ComplementID complementID, PlayerID playerID, RacketID racketID) {
        this.complementID = complementID;
        this.playerID = playerID;
        this.racketID = racketID;
    }

    public ComplementID getComplementID() {
        return complementID;
    }

    public PlayerID getPlayerID() {
        return playerID;
    }

    public RacketID getRacketID() {
        return racketID;
    }
}
