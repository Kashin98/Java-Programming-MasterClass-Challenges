package com.company;

import java.util.ArrayList;

public class Customers {
    private String name;
    private ArrayList<Double> transactions;

    public Customers(String name) {
        this.name = name;
        transactions = new ArrayList<Double>();
    }

    public String getName() {
        return name;
    }

    public void addTransaction(double transactionValue){
        transactions.add(transactionValue);
    }

//    This will show a reversed arrayList allowing us to see latest transaction first.
    public void getTransactions() {
        System.out.println("Customer: " + name + " - Transaction list");
        for (int i = transactions.size()-1 ; i >=0 ; i--){
            System.out.println( i+1 + ". User has done a transaction of " + transactions.get(i));
        }
    }
}
