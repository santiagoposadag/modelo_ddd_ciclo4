package com.santiagoPosada.desafioddd.domain.complements;

import co.com.sofka.domain.generic.Entity;
import com.santiagoPosada.desafioddd.domain.complements.values.CourtID;
import com.santiagoPosada.desafioddd.domain.complements.values.FieldType;
import com.santiagoPosada.desafioddd.domain.complements.values.Location;
import com.santiagoPosada.desafioddd.domain.generics.PlayerID;

import java.util.Objects;
import java.util.Set;

public class Court extends Entity<CourtID> {
    private FieldType fieldType;
    private Location location;
    private Set<PlayerID> playersIds;

    public Court(CourtID entityId, FieldType fieldType, Location location) {
        super(entityId);
        this.fieldType = fieldType;
        this.location = location;
    }

    public void addPlayerID(PlayerID playerID){
        var player = Objects.requireNonNull(playerID);
        this.playersIds.add(player);
    }

    public void changeFieldType(FieldType fieldType){
        this.fieldType = Objects.requireNonNull(fieldType);
    }

    public void changeLocation(Location location){
        this.location = Objects.requireNonNull(location);
    }

    public FieldType fieldType() {
        return fieldType;
    }

    public Location location() {
        return location;
    }

    public Set<PlayerID> playersIds() {
        return playersIds;
    }
}
