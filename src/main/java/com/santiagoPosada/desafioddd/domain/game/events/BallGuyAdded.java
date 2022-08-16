package com.santiagoPosada.desafioddd.domain.game.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.santiagoPosada.desafioddd.domain.game.values.BallGuyID;
import com.santiagoPosada.desafioddd.domain.game.values.Clothes;
import com.santiagoPosada.desafioddd.domain.game.values.Name;

public class BallGuyAdded extends DomainEvent {

    private final BallGuyID entityId;
    private final Name name;
    private final Clothes clothes;

    public BallGuyAdded(BallGuyID entityId, Name name, Clothes clothes) {
        super("SantiagoPosada.Game.BallGuyAdded");
        this.entityId = entityId;
        this.name = name;
        this.clothes = clothes;
    }

    public BallGuyID getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }

    public Clothes getClothes() {
        return clothes;
    }
}
