package com.example.customerservice.entity;

public class Product {
    private int pId;
    private String pName;
    private int pPrice;
    private int customerId;

    public Product(int pId, String pName, int pPrice, int customerId) {
        this.pId = pId;
        this.pName = pName;
        this.pPrice = pPrice;
        this.customerId = customerId;
    }
    public Product(){

    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;

    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getpPrice() {
        return pPrice;
    }

    public void setpPrice(int pPrice) {
        this.pPrice = pPrice;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
