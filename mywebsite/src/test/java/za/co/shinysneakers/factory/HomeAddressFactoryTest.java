package za.co.shinysneakers.factory;

import org.junit.jupiter.api.Test;
import za.co.shinysneakers.domain.HomeAddress;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HomeAddressFactoryTest {
    private static HomeAddress validHomeAddress = HomeAddressFactory.createHomeAddress((short)12
            ,"Gabriel","Milnerton", "Cape Town", (short)8001
            , "Western Cape", "Mzansi");

    @Test
    void testCreateCustomer() {
        assertNotNull(validHomeAddress);
        System.out.println(validHomeAddress);
    }
}
