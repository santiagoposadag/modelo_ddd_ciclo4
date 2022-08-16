package com.santiagoPosada.desafioddd.domain.game.values;

import co.com.sofka.domain.generic.Identity;

public class GameID extends Identity {
    public GameID() {

    }

    private GameID(String id){
        super(id);
    }

    public static GameID of(String id) {
        return new GameID(id);
    }
}
