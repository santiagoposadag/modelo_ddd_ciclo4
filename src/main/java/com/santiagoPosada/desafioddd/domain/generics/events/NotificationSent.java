package com.santiagoPosada.desafioddd.domain.generics.events;

import co.com.sofka.domain.generic.DomainEvent;

public class NotificationSent extends DomainEvent {
    private final String message;

    public NotificationSent(String message) {
        super("SantiagoPosada.Generic.notificationSent");
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
