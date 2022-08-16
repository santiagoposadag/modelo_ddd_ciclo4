package com.santiagoPosada.desafioddd.domain.complements.commands;

import co.com.sofka.domain.generic.Command;
import com.santiagoPosada.desafioddd.domain.complements.values.BallID;
import com.santiagoPosada.desafioddd.domain.complements.values.Brand;
import com.santiagoPosada.desafioddd.domain.complements.values.Color;
import com.santiagoPosada.desafioddd.domain.complements.values.ComplementID;

public class AddBall extends Command {
    private final ComplementID complementID;
    private final BallID entityId;
    private final Color color;
    private final Brand brand;

    public AddBall(ComplementID complementID, BallID entityId, Color color, Brand brand) {
        this.complementID = complementID;
        this.entityId = entityId;
        this.color = color;
        this.brand = brand;
    }

    public ComplementID getComplementID() {
        return complementID;
    }

    public BallID getEntityId() {
        return entityId;
    }

    public Color getColor() {
        return color;
    }

    public Brand getBrand() {
        return brand;
    }
}
