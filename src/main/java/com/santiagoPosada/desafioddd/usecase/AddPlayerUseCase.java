package com.santiagoPosada.desafioddd.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.santiagoPosada.desafioddd.domain.game.Game;
import com.santiagoPosada.desafioddd.domain.game.commands.AddPlayer;

public class AddPlayerUseCase extends UseCase<RequestCommand<AddPlayer>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AddPlayer> addPlayerRequestCommand) {
        var command = addPlayerRequestCommand.getCommand();
        var game = Game.from(command.getGameID(), retrieveEvents(command.getGameID().value()));
        game.addPlayer(command.getEntityId(), command.getName());


        emit().onResponse(new ResponseEvents(game.getUncommittedChanges()));
    }
}
