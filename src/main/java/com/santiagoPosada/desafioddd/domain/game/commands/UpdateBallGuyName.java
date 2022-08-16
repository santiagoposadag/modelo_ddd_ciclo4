package com.santiagoPosada.desafioddd.domain.game.commands;

import co.com.sofka.domain.generic.Command;
import com.santiagoPosada.desafioddd.domain.game.values.BallGuyID;
import com.santiagoPosada.desafioddd.domain.game.values.GameID;
import com.santiagoPosada.desafioddd.domain.game.values.Name;

public class UpdateBallGuyName extends Command {
    private final GameID gameID;
    private final BallGuyID ballGuyID;
    private final Name name;


    public UpdateBallGuyName(GameID gameID, BallGuyID ballGuyID, Name name) {
        this.gameID = gameID;
        this.ballGuyID = ballGuyID;
        this.name = name;
    }

    public GameID getGameID() {
        return gameID;
    }

    public BallGuyID getBallGuyID() {
        return ballGuyID;
    }

    public Name getName() {
        return name;
    }
}
