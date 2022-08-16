package com.santiagoPosada.desafioddd.domain.complements.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.santiagoPosada.desafioddd.domain.complements.values.Brand;
import com.santiagoPosada.desafioddd.domain.complements.values.GripColor;
import com.santiagoPosada.desafioddd.domain.complements.values.RacketID;

public class RacketAdded extends DomainEvent {
    private final RacketID racketID;
    private final Brand brand;
    private final GripColor gripColor;

    public RacketAdded(RacketID entityId, Brand brand, GripColor gripColor) {
        super("SantaigoPosada.Complement.RacketAdded");
        this.racketID = entityId;
        this.brand = brand;
        this.gripColor = gripColor;
    }

    public RacketID getRacketID() {
        return racketID;
    }

    public Brand getBrand() {
        return brand;
    }

    public GripColor getGripColor() {
        return gripColor;
    }
}
