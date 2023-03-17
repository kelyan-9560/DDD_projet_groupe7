package model.tournament;

import model.address.Address;
import model.player.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Tournament {

    //TODO : Value Object TournamentID

    private int id;
    private String name;
    private TournamentType type;
    private Address address;

    private List<Player> subscriber = new ArrayList<>();

    public void addPlayerToTournament(Player player){
        this.subscriber.add(player);
    }

    public int getId() {
        return id;
    }

    public Tournament setId(int id) {
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
