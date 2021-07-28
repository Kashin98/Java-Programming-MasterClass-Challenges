package com.company;

public class Main {

    public static void main(String[] args) {

//        Challenge 1 - Bank Account
//        Setting user details
        BankAccount kashinAcc = new BankAccount("746OAB199B",23000,"Kashin 98",
                "kashin98@github.com","+1-1256751798");

//        Getting user details
        System.out.println(kashinAcc.getAccountNumber());
        System.out.println(kashinAcc.getCustomerName());
        System.out.println(kashinAcc.getEmail());
        System.out.println(kashinAcc.getPhoneNumber());
        System.out.println(kashinAcc.getBalance());

//        Using methods
        kashinAcc.depositFunds(4000);
        kashinAcc.withdrawFunds(20000);
        kashinAcc.withdrawFunds(50000);



//        Challenge 2 - VIP Customer
//        Setting Up details using params
        VIPCustomer kashinVIP = new VIPCustomer("Kashin", 75000.50, "Kashin@email.com");
        VIPCustomer noEmailVIP = new VIPCustomer("Kashin", 25000);
        VIPCustomer unknownVIP = new VIPCustomer();

//        Getters
        System.out.println(kashinVIP.getCreditLimit());
        System.out.println(noEmailVIP.getCreditLimit());
        System.out.println(unknownVIP.getCreditLimit());

        System.out.println(noEmailVIP.getEmail());
        System.out.println(unknownVIP.getName());
    }



}
