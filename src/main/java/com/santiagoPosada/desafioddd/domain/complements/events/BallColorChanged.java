package com.santiagoPosada.desafioddd.domain.complements.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.santiagoPosada.desafioddd.domain.complements.values.BallID;
import com.santiagoPosada.desafioddd.domain.complements.values.Color;

public class BallColorChanged extends DomainEvent {

    private final BallID ballID;
    private final Color color;

    public BallColorChanged(BallID ballID, Color color) {
        super("SantiagoPosada.complements.BallColorChanged");
        this.ballID = ballID;
        this.color = color;
    }

    public BallID getBallID() {
        return ballID;
    }

    public Color getColor() {
        return color;
    }
}
