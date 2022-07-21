package com.supemir.tp2.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

//@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer,Long> {

    List<Customer> findCustomerByEmailContains(String email);
    List<Customer> findCustomerByAgeGreaterThan(int age);
    List<Customer> findCustomerByNameStartingWith(String ch);

    @Query("from Customer c where c.name like 'Mr.%'")
    List<Customer> getAllCustomerByName();
}
