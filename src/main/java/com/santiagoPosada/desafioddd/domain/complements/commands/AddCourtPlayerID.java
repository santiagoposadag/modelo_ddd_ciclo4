package com.santiagoPosada.desafioddd.domain.complements.commands;

import co.com.sofka.domain.generic.Command;
import com.santiagoPosada.desafioddd.domain.complements.values.ComplementID;
import com.santiagoPosada.desafioddd.domain.complements.values.CourtID;
import com.santiagoPosada.desafioddd.domain.generics.PlayerID;

public class AddCourtPlayerID extends Command {
    private final ComplementID complementID;
    private final PlayerID playerID;
    private final CourtID courtID;


    public AddCourtPlayerID(ComplementID complementID, PlayerID playerID, CourtID courtID) {
        this.complementID = complementID;
        this.playerID = playerID;
        this.courtID = courtID;
    }

    public ComplementID getComplementID() {
        return complementID;
    }

    public PlayerID getPlayerID() {
        return playerID;
    }

    public CourtID getCourtID() {
        return courtID;
    }
}
