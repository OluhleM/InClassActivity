package za.co.shinysneakers.repository;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.co.shinysneakers.domain.Customer;
import za.co.shinysneakers.factory.CustomerFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CustomerRepositoryTest {

       @Autowired
        private CustomerRepository customerRepository;

        private static Customer customer = CustomerFactory.createCustomer("Gareth","Matt"
            ,(short)32,"Armor","Sea Point","Cape Town", "Kwa-Zulu Natal"
            ,(short)3610,"South Africa","gbale@mycput.ac.za","0768895435");

    @Test
    @Order(1)
    void create(){
        //System.out.println("***" + customer.toString());
        Customer created = customerRepository.save(customer);
        assertNotNull(created);
        System.out.println(created);
    }

    @Test
    @Order(2)
    void read(){
        Customer read = customerRepository.findByFirstName(customer.getFirstName()).orElse(null);
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    @Order(3)
    void update(){
        Customer newCustomer = new Customer.Builder()
                .copy(customer)
                .setFirstName("Sasha")
                .build();
        Customer updated = customerRepository.save(newCustomer);
       // System.out.println(updated);
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    @Disabled
    @Order(4)
    void delete(){
        customerRepository.deleteById(customer.getCustomerID());
        System.out.println("Deleted: " + customer.getCustomerID());
    }

    @Test
    @Order(5)
    void getAll(){
        System.out.println("All Customers: ");
        for (Customer customer : customerRepository.findAll()) {
            System.out.println(customer);
        }
    }


}
