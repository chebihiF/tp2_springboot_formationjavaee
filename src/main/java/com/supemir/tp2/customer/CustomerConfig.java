package com.supemir.tp2.customer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {

    private final CustomerRepository customerRepository;

    public CustomerConfig(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Bean
    public CommandLineRunner initCustomer(){
        return args -> {
            customerRepository.save(new Customer(null,"chebihi","chebihi@gmail.com",20));
            customerRepository.save(new Customer(null,"saad","saad@gmail.com",30));
            customerRepository.save(new Customer(null,"amal","amal@gmail.com",25));
        };
    }
}
