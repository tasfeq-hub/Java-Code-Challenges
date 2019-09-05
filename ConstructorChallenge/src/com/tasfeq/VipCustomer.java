package com.tasfeq;

public class VipCustomer {

    private String name;
    private String creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("Nuzhat","20000","nuzhat@gmail.com");
    }

    public VipCustomer(String name, String creditLimit) {
        this(name,creditLimit,"tasfeq@yahoo.com");
    }

    public VipCustomer(String name, String creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return this.name;
    }

    public String getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }
}
