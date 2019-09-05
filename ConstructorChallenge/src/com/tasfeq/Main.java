package com.tasfeq;

public class Main {

    public static void main(String[] args) {

        VipCustomer sourav = new VipCustomer();
        System.out.println(sourav.getName());

        VipCustomer eshtiak = new VipCustomer("Eshtiak","12345");
        System.out.println(eshtiak.getEmailAddress());

        VipCustomer biplob = new VipCustomer("biplob","45000","biplob@gmail.com");
        System.out.println(biplob.getCreditLimit());
    }
}
