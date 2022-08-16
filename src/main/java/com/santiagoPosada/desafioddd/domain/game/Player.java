package com.santiagoPosada.desafioddd.domain.game;

import co.com.sofka.domain.generic.Entity;
import com.santiagoPosada.desafioddd.domain.game.values.ExperienceTestimony;
import com.santiagoPosada.desafioddd.domain.game.values.GamesWon;
import com.santiagoPosada.desafioddd.domain.game.values.Name;
import com.santiagoPosada.desafioddd.domain.generics.PlayerID;

import java.util.Objects;

public class Player extends Entity<PlayerID> {
    private Name name;
    private GamesWon gamesWon;
    private ExperienceTestimony experienceTestimony;

    public Player(PlayerID entityId, Name name) {
        super(entityId);
        this.name = name;
    }

    public void updateGamesWon(GamesWon gamesWon){
        this.gamesWon = Objects.requireNonNull(gamesWon);
    }

    public void updateName(Name name){
        this.name = Objects.requireNonNull(name);
    }

    public void addExperienceTestimony(ExperienceTestimony experienceTestimony){
        this.experienceTestimony = Objects.requireNonNull(experienceTestimony);
    }

    public Name name() {
        return name;
    }

    public GamesWon gamesWon() {
        return gamesWon;
    }

    public ExperienceTestimony experienceTestimony() {
        return experienceTestimony;
    }
}
