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
        float zipcode;
        try {
             zipcode = Float.parseFloat(zipCode);
        } catch (NumberFormatException e) {
            throw new AddressZipCodeNotANumberException();
        }
        if(zipCode.length() != 5)
            throw new AddressZipCodeNotFiveDigitsException();

        this.street = street;
        this.city = city;
        this.zipCode = String.valueOf(zipcode);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(street, address.street) && Objects.equals(city, address.city) && Objects.equals(zipCode, address.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, city, zipCode);
    }
}
