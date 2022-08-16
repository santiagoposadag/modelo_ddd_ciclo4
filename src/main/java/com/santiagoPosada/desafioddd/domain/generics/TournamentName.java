package com.santiagoPosada.desafioddd.domain.generics;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TournamentName implements ValueObject<String> {


    private final String value;

    public TournamentName(String value) {
        if(value.isBlank()){
            throw new IllegalArgumentException("The VO tournament name cant be blank");
        }
        if(value.length() < 3){
            throw new IllegalArgumentException("The VO tournament name cant have less than 3 letters");
        }
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TournamentName that = (TournamentName) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
