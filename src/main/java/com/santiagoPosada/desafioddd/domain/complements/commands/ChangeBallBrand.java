package com.santiagoPosada.desafioddd.domain.complements.commands;

import co.com.sofka.domain.generic.Command;
import com.santiagoPosada.desafioddd.domain.complements.values.BallID;
import com.santiagoPosada.desafioddd.domain.complements.values.Brand;
import com.santiagoPosada.desafioddd.domain.complements.values.ComplementID;

public class ChangeBallBrand extends Command {
    private final ComplementID complementID;
    private final BallID ballID;
    private final Brand brand;

    public ChangeBallBrand(ComplementID complementID, BallID ballID, Brand brand) {
        this.complementID = complementID;
        this.ballID = ballID;
        this.brand = brand;
    }

    public ComplementID getComplementID() {
        return complementID;
    }

    public BallID getBallID() {
        return ballID;
    }

    public Brand getBrand() {
        return brand;
    }
}
