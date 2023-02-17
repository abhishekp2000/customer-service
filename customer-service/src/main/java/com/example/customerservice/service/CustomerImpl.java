package com.example.customerservice.service;

import com.example.customerservice.entity.Customer;
import org.springframework.stereotype.Service;

import java.lang.*;

import java.util.ArrayList;
import java.util.List;
@Service
public class CustomerImpl implements CustomerService{

   /* List<Customer> clist= List.of(
            new Customer(1224L,"Abhishek",973000),
            new Customer(1236L,"Rahul",975690),
            new Customer(1248L,"Aniket",996000)

    );*/
    List<Customer> clist=new ArrayList<>();

    @Override
    public Customer addCustomer(Customer customer) {
         clist.add(customer);
         return customer;
    }

    @Override
    public Customer getCustomer(long id) {
       return this.clist.stream().filter(customer -> customer.getCustomerId()==(id)).findAny().orElse(null);
      /* Customer c1=null;
        for (Customer empObj : clist) {
            if (empObj.getCustomerId() == id) {
                c1 = empObj;
                break;
            }
        }
        return c1;*/
    }

    @Override
    public String deletebyId(long id) {
        Customer customer=null;
        for (Customer custObj : clist) {
            if (custObj.getCustomerId() == id) {
                customer = custObj;
                clist.remove(custObj);
                break;
            }

        }
        return "Customer deleted with id";
    }


}
