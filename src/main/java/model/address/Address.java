package model.address;

public class Address {
    public String street;
    public String city;
    public String zipCode;

    public Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    //TODO : Ajouter les vérifications
    //      - street non vide
    //      - city non vide
    //      - zipCode non vide
    //      - zipCode est un nombre
    //      - zipCode est un nombre de 4 chiffres
}
