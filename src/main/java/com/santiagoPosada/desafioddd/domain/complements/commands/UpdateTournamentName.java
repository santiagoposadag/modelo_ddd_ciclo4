package com.santiagoPosada.desafioddd.domain.complements.commands;

import co.com.sofka.domain.generic.Command;
import com.santiagoPosada.desafioddd.domain.complements.values.ComplementID;
import com.santiagoPosada.desafioddd.domain.generics.TournamentName;

public class UpdateTournamentName extends Command {
    private final ComplementID complementID;
    private final TournamentName tournamentName;


    public UpdateTournamentName(ComplementID complementID, TournamentName tournamentName) {
        this.complementID = complementID;
        this.tournamentName = tournamentName;
    }

    public ComplementID getComplementID() {
        return complementID;
    }

    public TournamentName getTournamentName() {
        return tournamentName;
    }
}
