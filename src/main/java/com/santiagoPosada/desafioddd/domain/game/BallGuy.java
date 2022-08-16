package com.santiagoPosada.desafioddd.domain.game;

import co.com.sofka.domain.generic.Entity;
import com.santiagoPosada.desafioddd.domain.game.values.BallGuyID;
import com.santiagoPosada.desafioddd.domain.game.values.Clothes;
import com.santiagoPosada.desafioddd.domain.game.values.Name;

import java.util.Objects;

public class BallGuy extends Entity<BallGuyID> {
    private Name name;
    private Clothes clothes;

    public BallGuy(BallGuyID entityId, Name name, Clothes clothes) {
        super(entityId);
        this.clothes = clothes;
        this.name = name;
    }

    public void updateName(Name name){
        this.name = Objects.requireNonNull(name);
    }

    public void updateClothes(Clothes clothes){
        this.clothes = Objects.requireNonNull(clothes);
    }

    public Name name() {
        return name;
    }

    public Clothes clothes() {
        return clothes;
    }
}
