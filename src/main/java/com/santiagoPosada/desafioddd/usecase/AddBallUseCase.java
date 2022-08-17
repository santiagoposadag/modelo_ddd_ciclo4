package com.santiagoPosada.desafioddd.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.santiagoPosada.desafioddd.domain.complements.Complement;
import com.santiagoPosada.desafioddd.domain.complements.commands.AddBall;

public class AddBallUseCase extends UseCase<RequestCommand<AddBall>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AddBall> addBallRequestCommand) {
        var command = addBallRequestCommand.getCommand();
        var complement = Complement.from(command.getComplementID(), retrieveEvents(command.getComplementID().value()));
        complement.addBall(
                command.getEntityId(),
                command.getColor(),
                command.getBrand()
        );

        emit().onResponse(new ResponseEvents(complement.getUncommittedChanges()));
    }
}
