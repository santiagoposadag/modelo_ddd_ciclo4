package com.santiagoPosada.desafioddd.domain.game;

import co.com.sofka.domain.generic.Entity;
import com.santiagoPosada.desafioddd.domain.game.values.Clothes;
import com.santiagoPosada.desafioddd.domain.game.values.Name;
import com.santiagoPosada.desafioddd.domain.game.values.RefereeID;
import com.santiagoPosada.desafioddd.domain.game.values.RefereeType;

import java.util.Objects;

public class Referee extends Entity<RefereeID> {
    private Name name;
    private RefereeType refereeType;
    private Clothes clothes;


    public Referee(RefereeID entityId, Name name, RefereeType refereeType, Clothes clothes) {
        super(entityId);
        this.name = name;
        this.refereeType = refereeType;
        this.clothes = clothes;
    }

    public void updateName(Name name){
        this.name = Objects.requireNonNull(name);
    }

    public void changeType(RefereeType refereeType){
        this.refereeType = Objects.requireNonNull(refereeType);
    }

    public void changeClothes(Clothes clothes){
        this.clothes = Objects.requireNonNull(clothes);
    }

    public Name name() {
        return name;
    }

    public RefereeType refereeType() {
        return refereeType;
    }

    public Clothes clothes() {
        return clothes;
    }
}
