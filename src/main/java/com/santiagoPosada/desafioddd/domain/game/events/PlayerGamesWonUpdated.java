package com.santiagoPosada.desafioddd.domain.game.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.santiagoPosada.desafioddd.domain.game.values.GamesWon;
import com.santiagoPosada.desafioddd.domain.generics.PlayerID;

public class PlayerGamesWonUpdated extends DomainEvent {

    private final PlayerID playerID;
    private final GamesWon gamesWon;

    public PlayerGamesWonUpdated(PlayerID playerID, GamesWon gamesWon) {
        super("SantaigoPosada.game.PlayerGamesWonUpdated");
        this.playerID = playerID;
        this.gamesWon = gamesWon;
    }

    public PlayerID getPlayerID() {
        return playerID;
    }

    public GamesWon getGamesWon() {
        return gamesWon;
    }
}
