package za.co.shinysneakers.factory;

import za.co.shinysneakers.domain.HomeAddress;
import za.co.shinysneakers.util.Helper;

import java.util.Random;

public class HomeAddressFactory {
    public static HomeAddress createHomeAddress(short streetNumber, String streetName, String suburb, String city, Short postalCode, String province, String country) {

        if (!Helper.isValidPostalCode(postalCode))
            return null;

        if (!Helper.isValidStreetNumber(streetNumber)) return null;

        Long addressID = new Random().nextLong();

        return new HomeAddress.Builder()
                .setAddressID(addressID)
                .setStreetNumber(streetNumber)
                .setStreetName(streetName)
                .setSuburb(suburb)
                .setCity(city)
                .setPostalCode(postalCode)
                .setCountry(country)
                .setProvince(province)
                .build();

    }
}
