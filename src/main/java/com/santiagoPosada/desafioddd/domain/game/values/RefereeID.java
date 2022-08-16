package com.santiagoPosada.desafioddd.domain.game.values;

import co.com.sofka.domain.generic.Identity;

public class RefereeID extends Identity {
    public RefereeID() {

    }

    private RefereeID(String id){
        super(id);
    }

    public static RefereeID of(String id) {
        return new RefereeID(id);
    }
}
