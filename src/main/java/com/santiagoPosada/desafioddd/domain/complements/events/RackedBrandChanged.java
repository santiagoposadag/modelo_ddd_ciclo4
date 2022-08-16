package com.santiagoPosada.desafioddd.domain.complements.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.santiagoPosada.desafioddd.domain.complements.values.Brand;
import com.santiagoPosada.desafioddd.domain.complements.values.RacketID;

public class RackedBrandChanged extends DomainEvent {
    private final RacketID racketID;
    private final Brand brand;

    public RackedBrandChanged(RacketID racketID, Brand brand) {
        super("SantiagoPosada.complments.RackedBrandChanged");
        this.brand = brand;
        this.racketID = racketID;
    }

    public RacketID getRacketID() {
        return racketID;
    }

    public Brand getBrand() {
        return brand;
    }
}
