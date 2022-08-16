package com.santiagoPosada.desafioddd.domain.game.commands;

import co.com.sofka.domain.generic.Command;
import com.santiagoPosada.desafioddd.domain.game.values.ExperienceTestimony;
import com.santiagoPosada.desafioddd.domain.game.values.GameID;
import com.santiagoPosada.desafioddd.domain.generics.PlayerID;

public class AddPlayerTestimony extends Command {
    private final GameID gameID;
    private final PlayerID playerID;
    private final ExperienceTestimony experienceTestimony;


    public AddPlayerTestimony(GameID gameID, PlayerID playerID, ExperienceTestimony experienceTestimony) {
        this.gameID = gameID;
        this.playerID = playerID;
        this.experienceTestimony = experienceTestimony;
    }

    public GameID getGameID() {
        return gameID;
    }

    public PlayerID getPlayerID() {
        return playerID;
    }

    public ExperienceTestimony getExperienceTestimony() {
        return experienceTestimony;
    }
}
