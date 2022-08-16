package com.santiagoPosada.desafioddd.domain.complements.commands;

import co.com.sofka.domain.generic.Command;
import com.santiagoPosada.desafioddd.domain.complements.values.ComplementID;
import com.santiagoPosada.desafioddd.domain.complements.values.CourtID;
import com.santiagoPosada.desafioddd.domain.complements.values.FieldType;
import com.santiagoPosada.desafioddd.domain.complements.values.Location;

public class AddCourt extends Command {
    private final ComplementID complementID;
    private final CourtID entityId;
    private final FieldType fieldType;
    private final Location location;

    public AddCourt(ComplementID complementID, CourtID entityId, FieldType fieldType, Location location) {
        this.complementID = complementID;
        this.entityId = entityId;
        this.fieldType = fieldType;
        this.location = location;
    }

    public ComplementID getComplementID() {
        return complementID;
    }

    public CourtID getEntityId() {
        return entityId;
    }

    public FieldType getFieldType() {
        return fieldType;
    }

    public Location getLocation() {
        return location;
    }
}
