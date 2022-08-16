package com.santiagoPosada.desafioddd.domain.complements;

import co.com.sofka.domain.generic.Entity;
import com.santiagoPosada.desafioddd.domain.complements.values.Brand;
import com.santiagoPosada.desafioddd.domain.complements.values.GripColor;
import com.santiagoPosada.desafioddd.domain.complements.values.RacketID;
import com.santiagoPosada.desafioddd.domain.generics.PlayerID;

import java.util.Objects;

public class Racket extends Entity<RacketID> {
    private Brand brand;
    private PlayerID racketPlayerid;
    private GripColor gripColor;

    public Racket(RacketID entityId, Brand brand, GripColor gripColor) {
        super(entityId);
        this.brand = brand;
        this.gripColor = gripColor;
    }

    public void addOwnerPlayerID(PlayerID playerID){
        this.racketPlayerid = Objects.requireNonNull(playerID);
    }

    public void changeBrand(Brand brand){
        this.brand = Objects.requireNonNull(brand);
    }

    public void changeGripColor(GripColor gripColor){
        this.gripColor = Objects.requireNonNull(gripColor);
    }

    public Brand brand() {
        return brand;
    }

    public PlayerID racketPlayerid() {
        return racketPlayerid;
    }

    public GripColor gripColor() {
        return gripColor;
    }
}
