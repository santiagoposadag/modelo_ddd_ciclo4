package com.santiagoPosada.desafioddd.domain.complements;

import co.com.sofka.domain.generic.Entity;
import com.santiagoPosada.desafioddd.domain.complements.values.BallID;
import com.santiagoPosada.desafioddd.domain.complements.values.Brand;
import com.santiagoPosada.desafioddd.domain.complements.values.Color;

import java.util.Objects;

public class Ball extends Entity<BallID> {
    private Brand brand;
    private Color color;


    public Ball(BallID entityId, Color color, Brand brand) {
        super(entityId);
        this.brand = brand;
        this.color = color;
    }

    public void updateBrand(Brand brand){
        this.brand = Objects.requireNonNull(brand);
    }

    public void updateColor(Color color){
        this.color = Objects.requireNonNull(color);
    }

    public Brand brand() {
        return brand;
    }

    public Color color() {
        return color;
    }
}
