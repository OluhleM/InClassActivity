package za.co.shinysneakers.repository;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.co.shinysneakers.domain.HomeAddress;
import za.co.shinysneakers.factory.HomeAddressFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class HomeAddressRepositoryTest {

    @Autowired
    private HomeAddressRepository homeAddressRepository;

    private static HomeAddress homeAddress = HomeAddressFactory.createHomeAddress((short)12
            ,"Gabriel","Milnerton", "Cape Town", (short)8001
            , "Western Cape", "Mzansi");

    @Test
    @Order(1)
    void create(){
        HomeAddress created = homeAddressRepository.save(homeAddress);
        assertNotNull(created);
        System.out.println(created);
    }

    @Test
    @Order(2)
    void read(){
        HomeAddress read = homeAddressRepository.findBySuburb(homeAddress.getSuburb()).orElse(null);
        assertNotNull(read);
        System.out.println(read);
    }

    @Test
    @Order(3)
    void update(){
        HomeAddress newHomeAddress = new HomeAddress.Builder()
                .copy(homeAddress)
                .setSuburb("Gardens")
                .build();
        HomeAddress updated = homeAddressRepository.save(newHomeAddress);
        //System.out.println(updated);
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    @Disabled
    @Order(4)
    void delete(){
        homeAddressRepository.deleteById(homeAddress.getAddressID());
        System.out.println("Deleted: " + homeAddress.getAddressID());
    }

    @Test
    @Order(5)
    void getAll(){
        System.out.println("All HomeAddresses: ");
        for (HomeAddress homeAddress : homeAddressRepository.findAll()) {
            System.out.println(homeAddress);
        }
    }
}
