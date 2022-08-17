package com.santiagoPosada.desafioddd.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import com.santiagoPosada.desafioddd.domain.game.Game;
import com.santiagoPosada.desafioddd.domain.game.events.GameCreated;
import com.santiagoPosada.desafioddd.domain.game.values.GameID;

public class NotifyPublicityUseCase extends UseCase<TriggeredEvent<GameCreated>, ResponseEvents> {

    @Override
    public void executeUseCase(TriggeredEvent<GameCreated> gameCreatedTriggeredEvent) {
        var event = gameCreatedTriggeredEvent.getDomainEvent();
        var game = Game.from(GameID.of(event.aggregateRootId()), this.retrieveEvents());
        game.notifyPublicty("The game has been created, please start publicity");

        emit().onResponse(new ResponseEvents(game.getUncommittedChanges()));
    }
}
