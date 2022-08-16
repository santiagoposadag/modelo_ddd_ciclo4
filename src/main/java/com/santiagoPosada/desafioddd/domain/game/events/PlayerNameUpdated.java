package com.santiagoPosada.desafioddd.domain.game.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.santiagoPosada.desafioddd.domain.game.values.Name;
import com.santiagoPosada.desafioddd.domain.generics.PlayerID;

public class PlayerNameUpdated extends DomainEvent {

    private final PlayerID playerID;
    private final Name name;

    public PlayerNameUpdated(PlayerID playerID, Name name) {
        super("SantiagoPosada.Game.PlayerNameUpdated");
        this.playerID = playerID;
        this.name = name;
    }

    public PlayerID getPlayerID() {
        return playerID;
    }

    public Name getName() {
        return name;
    }
}
