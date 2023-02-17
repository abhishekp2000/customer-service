package com.example.customerservice.service;

import com.example.customerservice.entity.Customer;

public interface CustomerService {
    Customer addCustomer(Customer customer);
    public Customer getCustomer(long id);
    public String deletebyId(long id);

}
