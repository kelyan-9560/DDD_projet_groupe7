package model.address;

import java.util.Objects;

public class Address {
    public String street;
    public String city;
    public String zipCode;

    public Address(String street, String city, String zipCode) {
        if (Objects.equals(city, ""))
            throw new AddressCityMissingException();

        if (Objects.equals(street, ""))
            throw new AddressStreetMissingException();

        if (Objects.equals(zipCode, ""))
            throw new AddressZipCodeMissingException();

        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }


}
