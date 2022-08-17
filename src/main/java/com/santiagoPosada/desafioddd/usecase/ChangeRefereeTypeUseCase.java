package com.santiagoPosada.desafioddd.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;;
import com.santiagoPosada.desafioddd.domain.game.Game;
import com.santiagoPosada.desafioddd.domain.game.commands.ChangeRefereeType;

public class ChangeRefereeTypeUseCase extends UseCase<RequestCommand<ChangeRefereeType>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ChangeRefereeType> changeRefereeTypeRequestCommand) {
        var command = changeRefereeTypeRequestCommand.getCommand();
        var game = Game.from(command.getGameID(), retrieveEvents(command.getGameID().value()));
        game.changeRefereeType(command.getRefereeID(), command.getRefereeType());

        emit().onResponse(new ResponseEvents(game.getUncommittedChanges()));
    }
}
