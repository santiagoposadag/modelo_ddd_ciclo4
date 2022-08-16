package com.santiagoPosada.desafioddd.domain.complements.commands;

import co.com.sofka.domain.generic.Command;
import com.santiagoPosada.desafioddd.domain.complements.values.ComplementID;
import com.santiagoPosada.desafioddd.domain.complements.values.CourtID;
import com.santiagoPosada.desafioddd.domain.complements.values.FieldType;

public class ChangeCourtFieldType extends Command {
    private final ComplementID complementID;
    private final CourtID courtID;
    private final FieldType fieldType;


    public ChangeCourtFieldType(ComplementID complementID, CourtID courtID, FieldType fieldType) {
        this.complementID = complementID;
        this.courtID = courtID;
        this.fieldType = fieldType;
    }

    public ComplementID getComplementID() {
        return complementID;
    }

    public CourtID getCourtID() {
        return courtID;
    }

    public FieldType getFieldType() {
        return fieldType;
    }
}
