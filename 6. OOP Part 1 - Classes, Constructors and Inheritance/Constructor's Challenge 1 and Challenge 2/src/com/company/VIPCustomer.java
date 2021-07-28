package com.company;

// Create a new class VipCustomer
// it should have 3 fields name, credit limit, and email address.
// create 3 constructors
// 1st constructor empty should call the constructor with 3 parameters with default values
// 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
// 3rd constructor should save all fields.
// create getters only for this using code generation of intellij as setters wont be needed
// test and confirm it works.

public class VIPCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VIPCustomer() {
        this("Unknown VIP User",50000,"default@email.com");
        System.out.println("Empty Constructor call");
    }

    public VIPCustomer(String name, double creditLimit) {
        this(name, creditLimit, "default@email.com");
        System.out.println("Constructor call with 2 params");
    }

    public VIPCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
