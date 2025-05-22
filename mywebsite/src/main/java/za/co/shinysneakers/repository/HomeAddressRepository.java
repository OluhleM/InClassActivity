package za.co.shinysneakers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.shinysneakers.domain.Customer;
import za.co.shinysneakers.domain.HomeAddress;

import java.util.Optional;

@Repository
public interface HomeAddressRepository extends JpaRepository<HomeAddress, Long> {
    //custom queries with springframework

    Optional<HomeAddress> findBySuburb(String suburb);
    HomeAddressRepository findByCity(String city);
}
