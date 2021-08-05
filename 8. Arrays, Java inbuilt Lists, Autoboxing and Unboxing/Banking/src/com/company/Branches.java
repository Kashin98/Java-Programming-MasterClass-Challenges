package com.company;

import java.util.ArrayList;

public class Branches {
    private String name;
    private ArrayList<Customers> customers;

    public Branches(String name) {
        this.name = name;
        customers = new ArrayList<Customers>();
    }

    public String getName() {
        return name;
    }

    private int findCustomer(String name){
        for(int i = 0; i < customers.size(); i++){
            if(customers.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public Customers queryCustomer(String name){
        int index = findCustomer(name);
        if(index >= 0){
            return customers.get(index);
        }
        return null;
    }

    public void addCustomer(Customers newCustomer){
        customers.add(newCustomer);
        newCustomer.getTransactions();
    }

    public void getBranchCustomers(){
        System.out.println("Customers List for Branch " + name);
        for (int i = 0; i < customers.size(); i++){
            System.out.println("Customers - " + customers.get(i).getName());
        }
    }
}

