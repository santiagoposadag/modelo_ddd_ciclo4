package com.santiagoPosada.desafioddd.domain.game.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.santiagoPosada.desafioddd.domain.game.values.DateOfGame;

public class DateOfGameChanged extends DomainEvent {
    private final DateOfGame dateOfGame;

    public DateOfGameChanged(DateOfGame dateOfGame) {
        super("SantiagoPosada.Game.DateOfGameChanged");
        this.dateOfGame = dateOfGame;
    }

    public DateOfGame getDateOfGame() {
        return dateOfGame;
    }
}
