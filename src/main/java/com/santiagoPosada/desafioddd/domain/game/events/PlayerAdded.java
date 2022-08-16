package com.santiagoPosada.desafioddd.domain.game.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.santiagoPosada.desafioddd.domain.game.values.Name;
import com.santiagoPosada.desafioddd.domain.generics.PlayerID;

public class PlayerAdded extends DomainEvent {

    private final PlayerID playerID;
    private final Name name;
    public PlayerAdded(PlayerID entityId, Name name) {
        super("SantiagoPosada.Game.PlayerAdded");
        this.name = name;
        this.playerID = entityId;
    }

    public PlayerID getPlayerID() {
        return playerID;
    }

    public Name getName() {
        return name;
    }
}
