package za.co.shinysneakers.factory;

import org.junit.jupiter.api.Test;
import za.co.shinysneakers.domain.Customer;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CustomerFactoryTest {
   private static Customer validCustomer = CustomerFactory.createCustomer("Andy", "Kenblock"
           ,(short)12,"Sendon","Woodstock", "Cape Town"
            , "Western Cape",(short)8001, "South Africa"
           , "kenandy@mycput.ac.za", "0897765432");

    private static Customer inValidCustomer = CustomerFactory.createCustomer("Andy", "Kenblock"
            ,(short)12,"Sendon","Woodstock", "Cape Town"
            , "Western Cape",(short)8001, "South Africa"
            , "kenandy7mycput.ac.za", "0897765432");

    @Test
    void testCreateCustomer() {
        assertNotNull(validCustomer);
        System.out.println(validCustomer);
    }

    @Test
    void testCreateInvalidCustomer() {
        assertNull(inValidCustomer);
        System.out.println(inValidCustomer);
    }

}
