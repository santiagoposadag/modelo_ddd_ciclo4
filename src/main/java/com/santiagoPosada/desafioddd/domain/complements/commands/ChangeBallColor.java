package com.santiagoPosada.desafioddd.domain.complements.commands;

import co.com.sofka.domain.generic.Command;
import com.santiagoPosada.desafioddd.domain.complements.values.BallID;
import com.santiagoPosada.desafioddd.domain.complements.values.Color;
import com.santiagoPosada.desafioddd.domain.complements.values.ComplementID;

public class ChangeBallColor extends Command {
    private final ComplementID complementID;
    private final BallID ballID;
    private final Color color;


    public ChangeBallColor(ComplementID complementID, BallID ballID, Color color) {
        this.complementID = complementID;
        this.ballID = ballID;
        this.color = color;
    }

    public ComplementID getComplementID() {
        return complementID;
    }

    public BallID getBallID() {
        return ballID;
    }

    public Color getColor() {
        return color;
    }
}
