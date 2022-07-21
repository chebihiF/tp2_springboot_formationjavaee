package com.supemir.tp2.customer;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService{

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getAll() throws Exception {
        return customerRepository.findAll();
    }

    @Override
    public Customer addCustomer(Customer customer) throws Exception {
        if(customer.getName().isEmpty()) throw new Exception("the name must be set");
        return customerRepository.save(customer);
    }
}
