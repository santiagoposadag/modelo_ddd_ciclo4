package com.santiagoPosada.desafioddd.domain.complements.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.santiagoPosada.desafioddd.domain.complements.values.GripColor;
import com.santiagoPosada.desafioddd.domain.complements.values.RacketID;

public class RacketGripColorChanged extends DomainEvent {
    private final RacketID racketID;
    private final GripColor gripColor;

    public RacketGripColorChanged(RacketID racketID, GripColor color) {
        super("SantiagoPosada.complements.RacketGripColorChanged");
        this.gripColor = color;
        this.racketID = racketID;
    }

    public RacketID getRacketID() {
        return racketID;
    }

    public GripColor getGripColor() {
        return gripColor;
    }
}
