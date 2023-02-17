package com.example.customerservice.controller;

import com.example.customerservice.entity.Customer;
import com.example.customerservice.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping
public class Controller {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private RestTemplate restTemplate;
    Logger log= LoggerFactory.getLogger(Controller.class);
  @Value("${productApi}")
  String productService;
  //String billService;
    @PostMapping("/customer/addcustomer")
    public Customer addCustomer(@RequestBody Customer customer1) {
        Customer customer = customerService.addCustomer(customer1);

        return customer;
    }
  @DeleteMapping("/customer/{custId}")

    public void deleteEmployee(@PathVariable long custId) {

      Customer customer= this.customerService.getCustomer(custId);
         this.restTemplate.delete(productService);
         log.info("Deleted");

         //return "product with cust id deleted";
    }
     @GetMapping("/customer/{customerId}")

    public Customer  getCustomer(@PathVariable  long customerId){


         Customer customer= this.customerService.getCustomer(customerId);
      // List product =this.restTemplate.getForObject(productService+customer.getCustomerId(), List.class);
      List product =this.restTemplate.getForObject("http://localhost:9091/product/customer/"+customer.getCustomerId(), List.class);

       // List bill =this.restTemplate.getForObject("http://localhost:9092/bill/customer/"+customer.getCustomerId(), List.class);
         // for bill service
         //List bill =this.restTemplate.getForObject(billService+customer.getCustomerId(), List.class);
      // customer.setBillList(bill);
         customer.setProductList(product);
        return customer;

     }

}
