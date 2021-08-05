package com.company;

/*Your job is to create a simple banking application.
 There should be a Bank class
 It should have an arraylist of Branches
 Each Branch should have an arraylist of Customers
 The Customer class should have an arraylist of Doubles (transactions)
 Customer:
 Name, and the ArrayList of doubles.
 Branch:
 Need to be able to add a new customer and initial transaction amount.
 Also needs to add additional transactions for that customer/branch
 Bank:
 Add a new branch
 Add a customer to that branch with initial transaction
 Add a transaction for an existing customer for that branch
 Show a list of customers for a particular branch and optionally a list
 of their transactions
 Demonstration autoboxing and unboxing in your code

 Hint: Transactions
 Add data validation.
 e.g. check if exists, or does not exist, etc.
 Think about where you are adding the code to perform certain actions*/



//----------------------------------------------UDEMY QUESTION-----------------------------------------
/*

Banking
        Your job is to create a simple banking application.

        Implement the following classes:

        1.  Bank

        -  It has two fields, A String called name and an ArrayList that holds objects of type Branch called branches.
        -  A constructor that takes a String (name of the bank). It initialises name and instantiates branches.
        -  And five methods, they are (their functions are in their names):
        -  addBranch(), has one parameter of type String (name of the branch) and returns a boolean. It returns true
        if the branch was added successfully or false otherwise.
        -  addCustomer(), has three parameters of type String (name of the branch), String (name of the customer),
        double (initial transaction) and returns a boolean. It returns true if the customer was added successfully or
        false otherwise.
        -  addCustomerTransaction(), has three parameters of type String (name of the branch), String (name of the
        customer), double (transaction) and returns a boolean. It returns true if the customers transaction was added
        successfully or false otherwise.
        -  findBranch(), has one parameter of type String (name of the Branch) and returns a Branch. Return the Branch
        if it exists or null otherwise.
        -  listCustomers(), has two parameters of type String (name of the Branch), boolean (print transactions) and
        returns a boolean. Return true if the branch exists or false otherwise. This method prints out a list of customers.

        → TEST CODE

        Bank bank = new Bank("National Australia Bank");
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);
        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);
        bank.listCustomers("Adelaide", true);

        → OUTPUT

        The list of customers should be printed out in the following format if boolean parameter is true:

        Customer details for branch Adelaide
        Customer: Tim[1]
        Transactions
        [1]  Amount 50.05
        [2]  Amount 44.22
        [3]  Amount 12.44
        Customer: Mike[2]
        Transactions
        [1]  Amount 175.34
        [2]  Amount 1.65
        Customer: Percy[3]
        Transactions
        [1]  Amount 220.12
        and if false, only the customers - no transactions:

        bank.listCustomers("Adelaide", false);
        Customer details for branch Adelaide
        Customer: Tim[1]
        Customer: Mike[2]
        Customer: Percy[3]


        2.  Branch

        -  It has two fields, A String called name and an ArrayList that holds objects of type Customer called customers.
        -  A constructor that takes a String (name of the branch). It initialises name and instantiates customers.
        -  And five methods, they are (their functions are in their names):
        -  getName(), getter for name.
        -  getCustomers(), getter for customers.
        -  newCustomer(), has two parameters of type String (name of customer), double (initial transaction) and returns
         a boolean. Returns true if the customer was added successfully or false otherwise.
        -  addCustomerTransaction(), has two parameters of type String (name of customer), double (transaction) and
        returns a boolean. Returns true if the customers transaction was added successfully or false otherwise.
        -  findCustomer(), has one parameter of type String (name of customer) and returns a Customer. Return the
         Customer if they exist, null otherwise.



        3.  Customer

        -  It has two fields, A String called name and an ArrayList that holds objects of type Double called transactions.
        -  A constructor that takes a  String (name of customer) and a double (initial transaction). It initialises
        name and instantiates transactions.
        -  And three methods, they are (their functions are in their names):
        -  getName(), getter for name.
        -  getTransactions(), getter for transactions.
        -  addTransaction(), has one parameter of type double (transaction) and doesn't return anything.



        TIP:  In Bank, use the findBranch() method in each of the other four methods to validate a branch. Do the same
        thing in Branch with findCustomer() - except for the two getters.
        TIP:  In Customer, think about what else you need to do in the constructor when you instantiate a Customer object.
        TIP:  Think about what methods you need to call from another class when implementing a method.
        TIP:  Be extremely careful with the spelling of the names of the fields, constructors and methods.
        TIP:  Be extremely careful about spaces and spelling in the printed output.


        NOTE:  All transactions are deposits (no withdraws/balances).
        NOTE:  All fields are private.
        NOTE:  All constructors are public.
        NOTE:  All methods are public (except for findBranch() and findCustomer() which are private).
        NOTE:  There are no static members.
        NOTE:  Do not add a main method to the solution code.
        NOTE:  If you get an error from the Evaluate class, it's most likely the constructor. Check if you've added a
         constructor or if the constructor has the right arguments.

*/



// Much More Sophisticated Banking app

// REMINDER - THIS SOLUTION USES THE SAME CONCEPTS OF THE QUESTION BUT DOES IT DIFFERENTLY.

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    private static Bank bank = new Bank();

    public static void main(String[] args) {
        System.out.println("Welcome to Kashin Bank");
        printInstructions();
        boolean flag = true;

        while (flag){
            System.out.println("Choose an Option");
            int option = scanner.nextInt();

            scanner.nextLine();
            switch (option){
                case 1:
                    System.out.println("Create New Branch");
                    System.out.println("Provide Name for New Branch (Keep it simple A, B etc.)");
                    bank.createBranch(scanner.nextLine());
                    continue;

                case 2:
                    addCustomer();
                    continue;

                case 3:
                    addCustomerTransaction();
                    continue;

                case 4:
                    getAllTransactionsForSingleCustomer();
                    continue;

                case 5:
                    System.out.println("List All Branches");
                    bank.getBranches();
                    continue;

                case 6:
                    getAllCustomerFromSingleBranch();
                    continue;

                case 7:
                    printInstructions();
                    continue;
                case 8:
                    System.out.println("Quit Banking App");
                    flag = false;
                    continue;

                default:
                    System.out.println("Invalid Option, Please Try Again");
            }
        }
    }

    public static void printInstructions(){
        System.out.println("1 - Create New Branch");
        System.out.println("2 - Add New Customer");
        System.out.println("3 - Add Customer Transaction");
        System.out.println("4 - Show All Transactions For Customer");
        System.out.println("5 - Show All Branches");
        System.out.println("6 - Show All Customers In Branch");
        System.out.println("7 - Show Menu Again");
        System.out.println("8 - Quit");

    }


    public static void addCustomer(){
        System.out.println("Add New Customer");
        bank.getBranches();
        System.out.println("Which Branch ?");
        Branches selectedBranch = bank.queryBranch(scanner.nextLine());
        System.out.println("What is customer's name ?");
        String name = scanner.nextLine();
        System.out.println("What is customer's initial transaction ?");
        double initialTransaction = scanner.nextInt();
        scanner.nextLine();
        Customers newCustomer = new Customers(name);
        newCustomer.addTransaction(initialTransaction);
        bank.addCustomerToBranch(selectedBranch, newCustomer);
    }

    public static void addCustomerTransaction(){
        System.out.println("Add Transaction for Customer");
        System.out.println("What is customer's name ?");
        Customers searchedCustomer = bank.searchCustomerInAllBranches(scanner.nextLine());
        if(searchedCustomer == null){
            System.out.println("Customer not found");
        }else {
            System.out.println("What is the transaction to add ?");
            searchedCustomer.addTransaction(scanner.nextDouble());
            scanner.nextLine();
            System.out.println("Transaction added");
        }
    }

    public static void getAllTransactionsForSingleCustomer(){
        System.out.println("Get All Transactions of Customer");
        System.out.println("What is customer's name ?");
        Customers searchedCustomer = bank.searchCustomerInAllBranches(scanner.nextLine());
        if(searchedCustomer == null){
            System.out.println("Customer not found");
        }else {
            searchedCustomer.getTransactions();
        }
    }

    public static void getAllCustomerFromSingleBranch(){
        System.out.println("List All Customers For Branch");
        bank.getBranches();
        System.out.println("Which Branch ?");
        Branches selectedBranch = bank.queryBranch(scanner.nextLine());
        selectedBranch.getBranchCustomers();
    }

}
