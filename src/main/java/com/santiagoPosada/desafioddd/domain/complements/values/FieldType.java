package com.santiagoPosada.desafioddd.domain.complements.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class FieldType implements ValueObject<String> {

    private final String value;

    public FieldType(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The VO field type cant be blank");
        }
        if(this.value.length() < 3){
            throw new IllegalArgumentException("The VO field type cant have less than 3 letters");
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
        FieldType fieldType = (FieldType) o;
        return Objects.equals(value, fieldType.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
