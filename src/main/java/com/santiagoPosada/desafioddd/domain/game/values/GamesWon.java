package com.santiagoPosada.desafioddd.domain.game.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class GamesWon implements ValueObject<String> {


    private final String value;

    public GamesWon(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The VO games won cant be blank");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GamesWon gamesWon = (GamesWon) o;
        return Objects.equals(value, gamesWon.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
