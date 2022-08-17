package com.santiagoPosada.desafioddd.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.santiagoPosada.desafioddd.domain.complements.Complement;
import com.santiagoPosada.desafioddd.domain.complements.commands.AddRacket;

public class AddRacketUseCase extends UseCase<RequestCommand<AddRacket>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<AddRacket> addRacketRequestCommand) {
        var command = addRacketRequestCommand.getCommand();
        var complement = Complement.from(
                command.getComplementID(),
                retrieveEvents(command.getComplementID().value())
        );

        complement.addRacket(
                command.getEntityId(),
                command.getBrand(),
                command.getGripColor()
        );

        emit().onResponse(new ResponseEvents(complement.getUncommittedChanges()));
    }
}
