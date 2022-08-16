package com.santiagoPosada.desafioddd.domain.game.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.santiagoPosada.desafioddd.domain.game.values.RefereeID;
import com.santiagoPosada.desafioddd.domain.game.values.RefereeType;

public class RefereeTypeChanged extends DomainEvent {
    private final RefereeID refereeID;
    private final RefereeType refereeType;


    public RefereeTypeChanged(RefereeID refereeID, RefereeType refereeType) {
        super("SantiagoPosada.game.RefereeTypeChanged");
        this.refereeID = refereeID;
        this.refereeType = refereeType;
    }

    public RefereeID getRefereeID() {
        return refereeID;
    }

    public RefereeType getRefereeType() {
        return refereeType;
    }
}
