package com.santiagoPosada.desafioddd.domain.game.commands;

import co.com.sofka.domain.generic.Command;
import com.santiagoPosada.desafioddd.domain.game.values.BallGuyID;
import com.santiagoPosada.desafioddd.domain.game.values.Clothes;
import com.santiagoPosada.desafioddd.domain.game.values.GameID;

public class ChangeBallGuyClothes extends Command {
    private final GameID gameID;
    private final BallGuyID ballGuyID;
    private final Clothes clothes;


    public ChangeBallGuyClothes(GameID gameID, BallGuyID ballGuyID, Clothes clothes) {
        this.gameID = gameID;
        this.ballGuyID = ballGuyID;
        this.clothes = clothes;
    }

    public GameID getGameID() {
        return gameID;
    }

    public BallGuyID getBallGuyID() {
        return ballGuyID;
    }

    public Clothes getClothes() {
        return clothes;
    }
}
