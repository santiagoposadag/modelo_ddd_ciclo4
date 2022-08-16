package com.santiagoPosada.desafioddd.domain.game.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ExperienceTestimony implements ValueObject<String> {


    private final String value;

    public ExperienceTestimony(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The VO experience testimony cant be blank");
        }
        if(this.value.length() < 10){
            throw new IllegalArgumentException("The VO experience testimony cant have less than 3 letters");
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
        ExperienceTestimony that = (ExperienceTestimony) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
