package com.santiagoPosada.desafioddd.domain.complements.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.santiagoPosada.desafioddd.domain.complements.values.BallID;
import com.santiagoPosada.desafioddd.domain.complements.values.Brand;
import com.santiagoPosada.desafioddd.domain.complements.values.Color;

public class BallAdded extends DomainEvent {
    private final BallID ballID;
    private final Color color;
    private final Brand brand;

    public BallAdded(BallID entityId, Color color, Brand brand) {
        super("SantiagoPosada.Complements.BallAdded");
        this.ballID = entityId;
        this.color = color;
        this.brand = brand;
    }

    public BallID getBallID() {
        return ballID;
    }

    public Color getColor() {
        return color;
    }

    public Brand getBrand() {
        return brand;
    }
}
