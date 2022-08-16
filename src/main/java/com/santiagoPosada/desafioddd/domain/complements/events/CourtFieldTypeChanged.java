package com.santiagoPosada.desafioddd.domain.complements.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.santiagoPosada.desafioddd.domain.complements.values.CourtID;
import com.santiagoPosada.desafioddd.domain.complements.values.FieldType;

public class CourtFieldTypeChanged extends DomainEvent {
    private final CourtID courtID;
    private final FieldType fieldType;

    public CourtFieldTypeChanged(CourtID courtID, FieldType fieldType) {
        super("SantiagoPosada.Complements.CourtFieldTypeChanged");
        this.courtID = courtID;
        this.fieldType = fieldType;
    }

    public CourtID getCourtID() {
        return courtID;
    }

    public FieldType getFieldType() {
        return fieldType;
    }
}
