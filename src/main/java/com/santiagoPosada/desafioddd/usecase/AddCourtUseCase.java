package com.santiagoPosada.desafioddd.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.santiagoPosada.desafioddd.domain.complements.Complement;
import com.santiagoPosada.desafioddd.domain.complements.commands.AddCourt;

public class AddCourtUseCase extends UseCase<RequestCommand<AddCourt>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddCourt> addCourtRequestCommand) {
        var command = addCourtRequestCommand.getCommand();
        var complement = Complement.from(
                command.getComplementID(),
                retrieveEvents(command.getComplementID().value())
        );

        complement.addCourt(
                command.getEntityId(),
                command.getFieldType(),
                command.getLocation()
        );

        emit().onResponse(new ResponseEvents(complement.getUncommittedChanges()));
    }
}
