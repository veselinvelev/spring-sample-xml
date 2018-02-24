package com.pluralsight.repository;


import com.pluralsight.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibarnateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();
        customer.setFirstname("Veselin");
        customer.setLastname("Velev");

        customers.add(customer);

        return customers;
    }

}
