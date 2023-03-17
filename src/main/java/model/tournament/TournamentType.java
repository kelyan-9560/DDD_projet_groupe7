package model.tournament;

import model.tournament.exception.TournamentTypeNameMissingException;

import java.util.Objects;

public class TournamentType {

    private String value;


    public String getValue() {
        return value;
    }

    public TournamentType setValue(String value) {
        this.value = value;
        return this;
    }

    public void check(){
        if(Objects.equals(value, "")){
            throw new TournamentTypeNameMissingException();
        }
    }
}
