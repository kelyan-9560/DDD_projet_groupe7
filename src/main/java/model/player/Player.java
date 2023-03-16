package model.player;

import java.util.Objects;

public class Player {

    private int id;
    private String name;
    private String licenceNumber;


    public int getId() {
        return id;
    }

    public Player setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Player setName(String name) {
        this.name = name;
        return this;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public Player setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
        return this;
    }

    public void check(){
        if(this.name == "")
            throw new PlayerNameMissingException();
        if(this.licenceNumber == "")
            throw new PlayerLicenseNumberMissingException();
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
