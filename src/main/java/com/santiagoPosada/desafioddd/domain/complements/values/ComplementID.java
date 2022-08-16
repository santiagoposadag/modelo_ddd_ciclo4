package com.santiagoPosada.desafioddd.domain.complements.values;

import co.com.sofka.domain.generic.Identity;

public class ComplementID extends Identity {
    public ComplementID() {

    }

    private ComplementID(String id){
        super(id);
    }

    public static ComplementID of(String id){
        return new ComplementID(id);
    }

}
