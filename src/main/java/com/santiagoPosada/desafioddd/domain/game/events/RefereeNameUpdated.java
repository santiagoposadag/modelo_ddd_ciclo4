package com.santiagoPosada.desafioddd.domain.game.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.santiagoPosada.desafioddd.domain.game.values.Name;
import com.santiagoPosada.desafioddd.domain.game.values.RefereeID;

public class RefereeNameUpdated extends DomainEvent {

    private final RefereeID refereeID;
    private final Name name;

    public RefereeNameUpdated(RefereeID refereeID, Name name) {
        super("SantaigoPosada.game.RefereeNameUpdated");
        this.refereeID = refereeID;
        this.name = name;
    }

    public RefereeID getRefereeID() {
        return refereeID;
    }

    public Name getName() {
        return name;
    }
}
