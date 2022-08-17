package com.santiagoPosada.desafioddd.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.santiagoPosada.desafioddd.domain.game.Game;
import com.santiagoPosada.desafioddd.domain.game.commands.CreateGame;

public class CreateGameUseCase extends UseCase<RequestCommand<CreateGame>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<CreateGame> createGameRequestCommand) {
        var command = createGameRequestCommand.getCommand();
        var game = new Game(
                command.getGameID(),
                command.getTournamentName(),
                command.getDateOfGame()
        );

        emit().onResponse(new ResponseEvents(game.getUncommittedChanges()));
    }
}
