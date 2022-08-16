package com.santiagoPosada.desafioddd.domain.complements.values;

import co.com.sofka.domain.generic.Identity;

public class BallID extends Identity {

    public BallID() {

    }

    private BallID(String id){
        super(id);
    }

    public static BallID of(String id){
        return new BallID(id);
    }

}
