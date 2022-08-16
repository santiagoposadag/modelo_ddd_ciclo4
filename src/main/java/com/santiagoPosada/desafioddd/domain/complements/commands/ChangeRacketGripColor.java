package com.santiagoPosada.desafioddd.domain.complements.commands;

import co.com.sofka.domain.generic.Command;
import com.santiagoPosada.desafioddd.domain.complements.values.ComplementID;
import com.santiagoPosada.desafioddd.domain.complements.values.GripColor;
import com.santiagoPosada.desafioddd.domain.complements.values.RacketID;

public class ChangeRacketGripColor extends Command {
    private final ComplementID complementID;
    private final RacketID racketID;
    private final GripColor gripColor;


    public ChangeRacketGripColor(ComplementID complementID, RacketID racketID, GripColor gripColor) {
        this.complementID = complementID;
        this.racketID = racketID;
        this.gripColor = gripColor;
    }

    public ComplementID getComplementID() {
        return complementID;
    }

    public RacketID getRacketID() {
        return racketID;
    }

    public GripColor getGripColor() {
        return gripColor;
    }
}
