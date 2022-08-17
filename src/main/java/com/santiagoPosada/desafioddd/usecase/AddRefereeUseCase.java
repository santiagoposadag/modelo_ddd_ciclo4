package com.santiagoPosada.desafioddd.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.santiagoPosada.desafioddd.domain.game.Game;
import com.santiagoPosada.desafioddd.domain.game.commands.AddReferee;

public class AddRefereeUseCase extends UseCase<RequestCommand<AddReferee>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<AddReferee> addRefereeRequestCommand) {
        var command = addRefereeRequestCommand.getCommand();
        var game = Game.from(command.getGameID(), retrieveEvents(command.getGameID().value()));
        game.addReferee(command.getEntityId(), command.getName(), command.getRefereeType(), command.getClothes());

        emit().onResponse(new ResponseEvents(game.getUncommittedChanges()));
    }
}
