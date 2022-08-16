package com.santiagoPosada.desafioddd.domain.game.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.santiagoPosada.desafioddd.domain.game.values.BallGuyID;
import com.santiagoPosada.desafioddd.domain.game.values.Name;

public class BallGuyNameUpdated extends DomainEvent {

    private final BallGuyID ballGuyID;
    private final Name name;

    public BallGuyNameUpdated(BallGuyID ballGuyID, Name name) {
        super("SantiagoPosada.game.BallGuyNameUpdated");
        this.ballGuyID = ballGuyID;
        this.name = name;
    }

    public BallGuyID getBallGuyID() {
        return ballGuyID;
    }

    public Name getName() {
        return name;
    }
}
