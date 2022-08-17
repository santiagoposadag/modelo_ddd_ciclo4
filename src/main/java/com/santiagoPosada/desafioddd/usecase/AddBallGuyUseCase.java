package com.santiagoPosada.desafioddd.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.santiagoPosada.desafioddd.domain.game.Game;
import com.santiagoPosada.desafioddd.domain.game.commands.AddBallGuy;
import com.santiagoPosada.desafioddd.domain.game.commands.AddPlayer;

public class AddBallGuyUseCase extends UseCase<RequestCommand<AddBallGuy>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<AddBallGuy> addBallGuyRequestCommand) {
        var command = addBallGuyRequestCommand.getCommand();
        var game = Game.from(command.getGameID(), retrieveEvents(command.getGameID().value()));
        game.addBallGuy(command.getEntityId(), command.getName(), command.getClothes());


        emit().onResponse(new ResponseEvents(game.getUncommittedChanges()));
    }
}
