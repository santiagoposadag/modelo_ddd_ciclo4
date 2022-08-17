package com.santiagoPosada.desafioddd.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.santiagoPosada.desafioddd.domain.complements.Complement;
import com.santiagoPosada.desafioddd.domain.complements.commands.CreateComplement;

public class CreateComplementUseCase extends UseCase<RequestCommand<CreateComplement>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<CreateComplement> createComplementRequestCommand) {
        var command = createComplementRequestCommand.getCommand();
        var complement = new Complement(
                command.getComplementID(),
                command.getTournamentName(),
                command.getGameID()
        );

        emit().onResponse(new ResponseEvents(complement.getUncommittedChanges()));
    }
}
