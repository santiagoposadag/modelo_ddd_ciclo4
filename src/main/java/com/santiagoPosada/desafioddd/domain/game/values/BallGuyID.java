package com.santiagoPosada.desafioddd.domain.game.values;

import co.com.sofka.domain.generic.Identity;

public class BallGuyID extends Identity {
    public BallGuyID() {

    }

    private BallGuyID(String id){
        super(id);
    }

    public static BallGuyID of(String id) {
        return new BallGuyID(id);
    }
}
