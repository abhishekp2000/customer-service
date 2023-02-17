package com.example.customerservice.entity;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private long customerId;
    private String customerName;
    private int phoneNo;

   List<Product> productList = new ArrayList<>();
   List<Bill> billList=new ArrayList<>();

//    public Customer(long customerId, String customerName, int phoneNo, List<Product> productList, List<Bill> billList) {
//        this.customerId = customerId;
//        this.customerName = customerName;
//        this.phoneNo = phoneNo;
//        this.productList = productList;
//        this.billList=billList;
//    }

        public Customer(long customerId, String customerName, int phoneNo) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.phoneNo = phoneNo;
    }
    public Customer(){

    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

   public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
    public List<Bill> getBillList() {
        return billList;
    }
    public void setBillList(List<Bill> billList) {
        this.billList = billList;
    }

}
