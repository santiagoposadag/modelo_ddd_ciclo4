package com.santiagoPosada.desafioddd.domain.game.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.santiagoPosada.desafioddd.domain.game.values.BallGuyID;
import com.santiagoPosada.desafioddd.domain.game.values.Clothes;

public class BallGuyClothesChanged extends DomainEvent {

    private final BallGuyID ballGuyID;
    private final Clothes clothes;

    public BallGuyClothesChanged(BallGuyID ballGuyID, Clothes clothes) {
        super("SantiagoPosada.game.BallGuyClothesChanged");
        this.ballGuyID = ballGuyID;
        this.clothes = clothes;
    }

    public BallGuyID getBallGuyID() {
        return ballGuyID;
    }

    public Clothes getClothes() {
        return clothes;
    }
}
