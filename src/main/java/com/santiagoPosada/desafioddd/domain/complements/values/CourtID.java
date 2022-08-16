package com.santiagoPosada.desafioddd.domain.complements.values;

import co.com.sofka.domain.generic.Identity;

public class CourtID extends Identity {
    public CourtID() {

    }

    private CourtID(String id){
        super(id);
    }

    public static CourtID of(String id) {
        return new CourtID(id);
    }
}
