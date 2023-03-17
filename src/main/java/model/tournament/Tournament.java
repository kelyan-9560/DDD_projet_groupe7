package model.tournament;

import model.address.Address;

import java.util.Objects;

public class Tournament {

    //TODO : Value Object TournamentID

    private TournamentId id;
    private String name;
    private TournamentType type;
    private Address address;

    public TournamentId getId() {
        return id;
    }

    public Tournament setId(TournamentId id) {
        this.id = id;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public Tournament setAddress(Address address) {
        this.address = address;
        return this;
    }

    public String getName() {
        return name;
    }

    public Tournament setName(String name) {
        this.name = name;
        return this;
    }

    public TournamentType getType() {
        return type;
    }

    public Tournament setType(TournamentType type) {
        this.type = type;
        return this;
    }

}
