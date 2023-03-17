package model.player;

import model.address.Address;
import model.tournament.Tournament;

import java.util.Objects;


//TODO : rendre la classe RICHE
public class Player {

    private PlayerId id;
    private String name;
    private String licenceNumber;

    private Address address;

    public PlayerId getId() {
        return id;
    }

    public Player setId(PlayerId id) {
        this.id = id;
        return this;
    }

    public void joinTournament(Tournament tournament){
        tournament.addPlayerToTournament(this);
    }

    public String getName() {
        return name;
    }

    public Player setName(String name) {
        this.name = name;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public Player setAddress(Address address) {
        this.address = address;
        return this;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public Player setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && Objects.equals(name, player.name) && Objects.equals(licenceNumber, player.licenceNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, licenceNumber);
    }
}
