package com.santiagoPosada.desafioddd.domain.complements.commands;

import co.com.sofka.domain.generic.Command;
import com.santiagoPosada.desafioddd.domain.complements.values.Brand;
import com.santiagoPosada.desafioddd.domain.complements.values.ComplementID;
import com.santiagoPosada.desafioddd.domain.complements.values.RacketID;

public class ChangeRacketBrand extends Command {
    private final ComplementID complementID;
    private final RacketID racketID;
    private final Brand brand;


    public ChangeRacketBrand(ComplementID complementID, RacketID racketID, Brand brand) {
        this.complementID = complementID;
        this.racketID = racketID;
        this.brand = brand;
    }

    public ComplementID getComplementID() {
        return complementID;
    }

    public RacketID getRacketID() {
        return racketID;
    }

    public Brand getBrand() {
        return brand;
    }
}
