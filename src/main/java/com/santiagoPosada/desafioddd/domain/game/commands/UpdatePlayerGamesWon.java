package com.santiagoPosada.desafioddd.domain.game.commands;

import co.com.sofka.domain.generic.Command;
import com.santiagoPosada.desafioddd.domain.game.values.GameID;
import com.santiagoPosada.desafioddd.domain.game.values.GamesWon;
import com.santiagoPosada.desafioddd.domain.generics.PlayerID;

public class UpdatePlayerGamesWon extends Command {
    private final GameID gameID;
    private final PlayerID playerID;
    private final GamesWon gamesWon;

    public UpdatePlayerGamesWon(GameID gameID, PlayerID playerID, GamesWon gamesWon) {
        this.gameID = gameID;
        this.playerID = playerID;
        this.gamesWon = gamesWon;
    }

    public GameID getGameID() {
        return gameID;
    }

    public PlayerID getPlayerID() {
        return playerID;
    }

    public GamesWon getGamesWon() {
        return gamesWon;
    }
}
