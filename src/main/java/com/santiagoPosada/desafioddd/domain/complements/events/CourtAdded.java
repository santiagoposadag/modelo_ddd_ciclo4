package com.santiagoPosada.desafioddd.domain.complements.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.santiagoPosada.desafioddd.domain.complements.values.CourtID;
import com.santiagoPosada.desafioddd.domain.complements.values.FieldType;
import com.santiagoPosada.desafioddd.domain.complements.values.Location;

public class CourtAdded extends DomainEvent {
    private final CourtID courtID;
    private final FieldType fieldType;
    private final Location location;

    public CourtAdded(CourtID entityId, FieldType fieldType, Location location) {
        super("SantiagoPosada.complements.CourtAdded");
        this.courtID = entityId;
        this.fieldType = fieldType;
        this.location = location;
    }

    public CourtID getCourtID() {
        return courtID;
    }

    public FieldType getFieldType() {
        return fieldType;
    }

    public Location getLocation() {
        return location;
    }
}
