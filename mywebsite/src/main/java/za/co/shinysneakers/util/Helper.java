package za.co.shinysneakers.util;

import java.util.UUID;

public class Helper {
    public static boolean isNullOrEmpty(String str) { return str == null || str.isEmpty(); }
    public static String generateID( ) { return UUID.randomUUID().toString(); }

    public static boolean isValidEmail(String email) {
        if (isNullOrEmpty(email)) {
        return false;
        }
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(emailRegex);
    }

    public static boolean isValidPostalCode(Short postalCode) {
        if (postalCode < 1000 || postalCode > 9999) {
            return false;
        }
        return true;
    }

    public static boolean isValidStreetNumber(short streetNumber) {
        if (streetNumber < 1 || streetNumber > 99999){
            return false;
        }
        return true;
    }

}
