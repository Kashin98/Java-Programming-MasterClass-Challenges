package com.company;

// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
// Create getters and setters for each field
// Create two additional methods
// 1.  To allow the customer to deposit funds (this should increment the balance field).
// 2.  To allow the customer to withdraw funds.  This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this("00000", 0.55, "Default Name", "default email", "123456");
        System.out.println("Empty Constructor called");
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("00000", 0.55, customerName,email,phoneNumber);
        System.out.println("Constructor with 3 params called");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        System.out.println("Constructor with 5 params called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //    Setters
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

//    Getters
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public String getEmail(){
        return this.email;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public double getBalance(){
        return this.balance;
    }

//    Class methods
    public void depositFunds(double funds){
        this.balance += funds;
        System.out.println("Your balance after depositing " + funds + " is " + this.balance);
    }

    public void withdrawFunds(double withdrawalFund){
        if(withdrawalFund > this.balance){
            System.out.println("Insufficient Funds");
            System.out.println("Can't withdraw "+ withdrawalFund+ ", Your balance is " + this.balance);

        }
        else{
            this.balance -= withdrawalFund;
            System.out.println("Your balance after withdrawing " + withdrawalFund + " is " + this.balance);
        }
    }
}
