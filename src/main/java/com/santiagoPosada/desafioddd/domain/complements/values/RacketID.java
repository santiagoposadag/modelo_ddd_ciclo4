package com.santiagoPosada.desafioddd.domain.complements.values;

import co.com.sofka.domain.generic.Identity;

public class RacketID extends Identity {
    public RacketID() {

    }

    private RacketID(String id){
        super(id);
    }

    public static RacketID of(String id) {
        return new RacketID(id);
    }
}
