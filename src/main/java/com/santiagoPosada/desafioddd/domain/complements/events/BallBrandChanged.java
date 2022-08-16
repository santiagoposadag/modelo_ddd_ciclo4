package com.santiagoPosada.desafioddd.domain.complements.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.santiagoPosada.desafioddd.domain.complements.values.BallID;
import com.santiagoPosada.desafioddd.domain.complements.values.Brand;

public class BallBrandChanged extends DomainEvent {

    private final BallID ballID;
    private final Brand brand;

    public BallBrandChanged(BallID ballID, Brand brand) {
        super("SantiagoPosada.Complements.BallBrandChanged");
        this.ballID = ballID;
        this.brand = brand;
    }

    public BallID getBallID() {
        return ballID;
    }

    public Brand getBrand() {
        return brand;
    }
}
