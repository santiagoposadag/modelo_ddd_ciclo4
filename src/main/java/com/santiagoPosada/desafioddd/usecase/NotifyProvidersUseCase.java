package com.santiagoPosada.desafioddd.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import com.santiagoPosada.desafioddd.domain.complements.Complement;
import com.santiagoPosada.desafioddd.domain.complements.events.ComplementCreated;
import com.santiagoPosada.desafioddd.domain.complements.values.ComplementID;

public class NotifyProvidersUseCase extends UseCase<TriggeredEvent<ComplementCreated>, ResponseEvents> {
    @Override
    public void executeUseCase(TriggeredEvent<ComplementCreated> complementCreatedTriggeredEvent) {
        var event = complementCreatedTriggeredEvent.getDomainEvent();
        var complement = Complement.from(ComplementID.of(event.aggregateRootId()), this.retrieveEvents());
        complement.notifyProviders("Please bring us the utils for the game associated");

        emit().onResponse(new ResponseEvents(complement.getUncommittedChanges()));
    }
}
