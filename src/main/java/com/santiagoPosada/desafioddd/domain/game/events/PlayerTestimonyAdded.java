package com.santiagoPosada.desafioddd.domain.game.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.santiagoPosada.desafioddd.domain.game.values.ExperienceTestimony;
import com.santiagoPosada.desafioddd.domain.generics.PlayerID;

public class PlayerTestimonyAdded extends DomainEvent {

    private final PlayerID playerID;
    private final ExperienceTestimony experienceTestimony;

    public PlayerTestimonyAdded(PlayerID playerID, ExperienceTestimony experienceTestimony) {
        super("santaigoPosada.game.PlayerTestimonyAdded");
        this.playerID = playerID;
        this.experienceTestimony = experienceTestimony;
    }

    public PlayerID getPlayerID() {
        return playerID;
    }

    public ExperienceTestimony getExperienceTestimony() {
        return experienceTestimony;
    }
}
