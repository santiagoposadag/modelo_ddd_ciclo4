package com.santiagoPosada.desafioddd.domain.complements.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.santiagoPosada.desafioddd.domain.complements.values.CourtID;
import com.santiagoPosada.desafioddd.domain.complements.values.Location;

public class CourtLocationChanged extends DomainEvent {

    private final CourtID courtID;
    private final Location location;

    public CourtLocationChanged(CourtID courtID, Location location) {
        super("SantiagoPosada.complements.CourtLocationChanged");
        this.location = location;
        this.courtID = courtID;
    }

    public CourtID getCourtID() {
        return courtID;
    }

    public Location getLocation() {
        return location;
    }
}
