package com.supemir.tp2.customer;

import java.util.List;

public interface ICustomerService {
    // cahier de charge
    List<Customer> getAll() throws Exception;
    Customer addCustomer(Customer customer) throws Exception;
}
