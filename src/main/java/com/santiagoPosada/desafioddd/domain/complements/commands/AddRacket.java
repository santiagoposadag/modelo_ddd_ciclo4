package com.santiagoPosada.desafioddd.domain.complements.commands;

import co.com.sofka.domain.generic.Command;
import com.santiagoPosada.desafioddd.domain.complements.values.Brand;
import com.santiagoPosada.desafioddd.domain.complements.values.ComplementID;
import com.santiagoPosada.desafioddd.domain.complements.values.GripColor;
import com.santiagoPosada.desafioddd.domain.complements.values.RacketID;

public class AddRacket extends Command {
    private final ComplementID complementID;
    private final RacketID entityId;
    private final Brand brand;
    private final GripColor gripColor;

    public AddRacket(ComplementID complementID, RacketID entityId, Brand brand, GripColor gripColor) {
        this.complementID = complementID;
        this.entityId = entityId;
        this.brand = brand;
        this.gripColor = gripColor;
    }

    public ComplementID getComplementID() {
        return complementID;
    }

    public RacketID getEntityId() {
        return entityId;
    }

    public Brand getBrand() {
        return brand;
    }

    public GripColor getGripColor() {
        return gripColor;
    }
}
