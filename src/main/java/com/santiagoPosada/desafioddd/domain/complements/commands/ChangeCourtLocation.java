package com.santiagoPosada.desafioddd.domain.complements.commands;

import co.com.sofka.domain.generic.Command;
import com.santiagoPosada.desafioddd.domain.complements.values.ComplementID;
import com.santiagoPosada.desafioddd.domain.complements.values.CourtID;
import com.santiagoPosada.desafioddd.domain.complements.values.Location;

public class ChangeCourtLocation extends Command {
    private final ComplementID complementID;
    private final CourtID courtID;
    private final Location location;


    public ChangeCourtLocation(ComplementID complementID, CourtID courtID, Location location) {
        this.complementID = complementID;
        this.courtID = courtID;
        this.location = location;
    }

    public ComplementID getComplementID() {
        return complementID;
    }

    public CourtID getCourtID() {
        return courtID;
    }

    public Location getLocation() {
        return location;
    }
}
