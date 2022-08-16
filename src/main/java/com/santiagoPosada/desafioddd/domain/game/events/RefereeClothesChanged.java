package com.santiagoPosada.desafioddd.domain.game.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.santiagoPosada.desafioddd.domain.game.values.Clothes;
import com.santiagoPosada.desafioddd.domain.game.values.RefereeID;

public class RefereeClothesChanged extends DomainEvent {
    private final RefereeID refereeID;
    private final Clothes clothes;

    public RefereeClothesChanged(RefereeID refereeID, Clothes clothes) {
        super("SantaigoPosada.Game.RefereeClothesChanged");
        this.clothes = clothes;
        this.refereeID = refereeID;
    }

    public RefereeID getRefereeID() {
        return refereeID;
    }

    public Clothes getClothes() {
        return clothes;
    }
}
