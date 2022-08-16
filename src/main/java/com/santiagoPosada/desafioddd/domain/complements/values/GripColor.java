package com.santiagoPosada.desafioddd.domain.complements.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class GripColor implements ValueObject<String> {

    private final String value;

    public GripColor(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The VO grip color cant be blank");
        }
        if(this.value.length() < 3){
            throw new IllegalArgumentException("The VO grip color cant have less than 3 letters");
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
        GripColor gripColor = (GripColor) o;
        return Objects.equals(value, gripColor.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
