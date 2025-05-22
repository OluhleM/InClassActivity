package za.co.shinysneakers.factory;

import za.co.shinysneakers.domain.Customer;
import za.co.shinysneakers.domain.HomeAddress;
import za.co.shinysneakers.util.Helper;

import java.util.Random;

public class CustomerFactory {
    public static Customer createCustomer(String firstName, String lastName,short streetNumber,String streetName,
                                          String suburb, String city, String province, Short postalCode, String country ,  String email, String mobile) {
        int customerID = Helper.generateID();

        if (Helper.isNullOrEmpty(firstName) || Helper.isNullOrEmpty(lastName)) return null;
        if (!Helper.isValidEmail(email)) return null;
        if (!Helper.isValidPostalCode(postalCode)) return null;


        Long addressID = new Random().nextLong();

        HomeAddress homeAddress = new HomeAddress.Builder()
                .setAddressID(addressID)
                .setStreetNumber(streetNumber)
                .setStreetName(streetName)
                .setSuburb(suburb)
                .setProvince(province)
                .setCity(city)
                .setCountry(country)
                .setPostalCode(postalCode)
                .build();

        return new Customer.Builder()
                .setCustomerID(customerID)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setMobile(mobile)
                .setHomeAddress(homeAddress)
                .build();
    }

//    public static Customer createCustomer1(String firstName, String lastName, String email, String mobile, HomeAddress homeAddress) {
//        String customerID = Helper.generateID();
//
//        return new Customer.Builder()
//                .setCustomerID(customerID)
//                .setFirstName(firstName)
//                .setLastName(lastName)
//                .setEmail(email)
//                .setMobile(mobile)
//                .setHomeAddress(homeAddress)
//                .build();
//    }

}
