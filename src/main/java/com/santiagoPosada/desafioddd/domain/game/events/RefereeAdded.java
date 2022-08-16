package com.santiagoPosada.desafioddd.domain.game.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.santiagoPosada.desafioddd.domain.game.values.Clothes;
import com.santiagoPosada.desafioddd.domain.game.values.Name;
import com.santiagoPosada.desafioddd.domain.game.values.RefereeID;
import com.santiagoPosada.desafioddd.domain.game.values.RefereeType;

public class RefereeAdded extends DomainEvent {
    private final RefereeID entityId;
    private final Name name;
    private final RefereeType refereeType;
    private final Clothes clothes;


    public RefereeAdded(RefereeID entityId, Name name, RefereeType refereeType, Clothes clothes) {
        super("SantiagoPosada.game.RefereeAdded");
        this.entityId = entityId;
        this.name = name;
        this.refereeType = refereeType;
        this.clothes= clothes;
    }

    public RefereeID getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }

    public RefereeType getRefereeType() {
        return refereeType;
    }

    public Clothes getClothes() {
        return clothes;
    }
}
