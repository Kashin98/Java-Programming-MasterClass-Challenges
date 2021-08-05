package com.company;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branches> branches;

    public Bank() {
        this.branches = new ArrayList<Branches>();
    }

    public void createBranch(String name){
        Branches newBranch = new Branches(name);
        branches.add(newBranch);
        System.out.println(name + " Branch created.");
    }

    private int findBranch(String name){
        for(int i = 0; i < branches.size(); i++){
            if(branches.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public Branches queryBranch(String name){
        int index = findBranch(name);
        if(index >= 0){
            return branches.get(index);
        }
        return null;
    }

    public void addCustomerToBranch(Branches branch, Customers newBranchCustomer){
        branch.addCustomer(newBranchCustomer);
        System.out.println(branch.getName() + " Branch has added a new customer - " + newBranchCustomer.getName());
    }

    public void getBranches(){
        System.out.println("Branches List:");
        for (int i = 0; i < branches.size(); i++){
        System.out.println("Branch - " + branches.get(i).getName());
        }
    }

//    The idea behind this is that it searches every branch for the customer and sees if the customer is found in
//    branch, if not the value returns null.
    public Customers searchCustomerInAllBranches(String name){
//        Searching each branch
        for(int i = 0; i < branches.size(); i++){
//            Seeing if the name passed in matches any name in the branch, if not go check the next branch
            Customers searchedCustomer = branches.get(i).queryCustomer(name);
            if (searchedCustomer == null){
//                continue;
            }else{
                System.out.println("Customer is from Branch - " + branches.get(i));
                if(searchedCustomer.getName().equals(name)){
                    return branches.get(i).queryCustomer(name);
                }
            }
        }
        return null;
    }
}
