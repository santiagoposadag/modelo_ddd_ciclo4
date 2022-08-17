package com.santiagoPosada.desafioddd.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.santiagoPosada.desafioddd.domain.game.Game;
import com.santiagoPosada.desafioddd.domain.game.commands.ChangeRefereeClothes;
import com.santiagoPosada.desafioddd.domain.game.values.Clothes;
import com.santiagoPosada.desafioddd.domain.game.values.Name;
import com.santiagoPosada.desafioddd.domain.game.values.RefereeType;

public class ChangeRefereeClothesUseCase extends UseCase<RequestCommand<ChangeRefereeClothes>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ChangeRefereeClothes> changeRefereeClothesRequestCommand) {
        var command = changeRefereeClothesRequestCommand.getCommand();
        var game = Game.from(command.getGameID(), retrieveEvents(command.getGameID().value()));
        game.changeRefereeClothes(command.getRefereeID(), command.getClothes());

        emit().onResponse(new ResponseEvents(game.getUncommittedChanges()));
    }
}
