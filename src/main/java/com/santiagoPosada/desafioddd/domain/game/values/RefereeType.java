package com.santiagoPosada.desafioddd.domain.game.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class RefereeType implements ValueObject<String> {


    private final String value;

    public RefereeType(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The VO referee type cant be blank");
        }
        if(this.value.length() < 3){
            throw new IllegalArgumentException("The VO referee type cant have less than 3 letters");
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
        RefereeType that = (RefereeType) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
