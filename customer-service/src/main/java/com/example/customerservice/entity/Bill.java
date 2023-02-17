package com.example.customerservice.entity;

public class Bill {
    private int billNo;
    private int billAmount;
    private int customerId;

    public Bill(int billNo, int billAmount, int customerId) {
        this.billNo = billNo;
        this.billAmount = billAmount;
        this.customerId = customerId;
    }
    public Bill(){

    }

    public int getBillNo() {
        return billNo;
    }

    public void setBillNo(int billNo) {
        this.billNo = billNo;
    }

    public int getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(int billAmount) {
        this.billAmount = billAmount;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
