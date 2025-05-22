package za.co.shinysneakers.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.shinysneakers.domain.Customer;
import za.co.shinysneakers.repository.CustomerRepository;
import za.co.shinysneakers.service.ICustomerService;
import za.co.shinysneakers.service.IHomeAddressService;

import java.util.List;
import java.util.Optional;

@Service
public abstract class CustomerService implements ICustomerService {

    @Autowired
    private static ICustomerService customerService;

    @Autowired
    private CustomerRepository repository;

    @Override
    public Customer create(Customer customer) {
        return repository.save(customer);
    }

    public Customer read(Integer id) {
        return this.repository.findByCustomerID(customerID);
    }

    @Override
    public Customer update(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public List<Customer> getAll() {
        return repository.findAll();
    }

    public Customer findByCustomerID(String customerID){
        Optional<Customer> customer = repository.findById(customerID);
        return customer.orElse(null);
    }

}
