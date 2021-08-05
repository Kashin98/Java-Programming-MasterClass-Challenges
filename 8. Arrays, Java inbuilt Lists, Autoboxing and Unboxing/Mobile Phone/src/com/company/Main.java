package com.company;
/*

Mobile Phone
        Create a program that implements a simple mobile phone with the following capabilities.


        1.  Implement the master class MobilePhone, that holds the ArrayList of Contacts, with the following attributes:

        -  Two fields, a String called myNumber and an ArrayList of type Contact called myContacts.
        -  A constructor that takes a String (the phone number) and initialises myNumber and instantiates myContacts.
        -  And seven methods, they are (their functions are in their names):
        -  addNewContact(), has one parameter of type Contact and returns a boolean. Returns true if the contact doesn't
        exists, or false if the contact already exists.
        -  updateContact(), has two parameters of type Contact (the old contact that will be updated with the new
        contact) and returns a boolean. Returns true if the contact exists and was updated successfully, or false if the
        contact doesn't exists.
        -  removeContact(), has one parameter of type Contact and returns a boolean. Returns true if the contact exists
        and was removed successfully, or false if the contact doesn't exists.
        -  findContact(), has one parameter of type Contact and returns an int. The returned value is it's position in
        the ArrayList, it will either be -1 (doesn't exists) or a value greater than or equal to 0 (does exists).
        -  findContact(), same as above, only it has one parameter of type String.
        -  queryContact(), has one parameter of type String and returns a Contact. Use the String to search for the name
        and then return the Contact. Return null otherwise.
        -  printContacts(), has no parameters and doesn't return anything. Print the contacts in the following format:

        Contact List:
        1. Bob -> 31415926
        2. Alice -> 16180339
        3. Tom -> 11235813
        4. Jane -> 23571113


        2. Implement the Contact class with the following attributes:

        -  Two fields, both String, one called name and the other phoneNumber.
        -  A constructor that takes two Strings, and initialises name and phoneNumber.
        -  And Three methods, they are:
        -  getName(), getter for name.
        -  getPhoneNumber(), getter for phoneNumber.
        -  createContact(), has two parameters of type String (the persons name and phone number) and returns an
        instance of Contact. This is the only method that is static.



        TIP:  In MobilePhone, use findContact() in the other methods (except printContacts()) to check if it exists
        before proceeding.
        TIP:  Two Contact objects are equal if they have the same name.
        TIP:  Be extremely careful about spaces in the printed message.



        NOTE:  All fields are private.
        NOTE:  Constructors should be defined as public.
        NOTE:  All methods should be defined as public (except for the two findContact() methods which are private).
        NOTE:  Do not add a main method to the solution code.
        NOTE:  If you get an error from the Evaluate class, it's most likely the constructor. Check if you've added a
        constructor or if the constructor has the right arguments.
*/


import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("1234567890")

    public static void main(String[] args) {

        System.out.println("Mobile Phone Menu");
        boolean flag = true;
        printInstructions();

        while (flag){
            System.out.println("Enter a choice:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){

                case 1:
                   addContact();
                    continue;

                case 2:
                    updateContact();
                    continue;

                case 3:
                    removeContact();
                    continue;

                case 4:
                    findContact();
                    continue;

                case 5:
                    System.out.println("Print Contact");
                    mobilePhone.printContacts();
                    continue;

                case 6:
                    printInstructions();
                    continue;

                case 7:
                    System.out.println("Quit Menu");
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid Choice, please try again");
            }
        }
    }

    public static void printInstructions(){
        System.out.println("1 - Add new contact");
        System.out.println("2 - Update contact");
        System.out.println("3 - Remove contact");
        System.out.println("4 - Find contact");
        System.out.println("5 - Show all contacts");
        System.out.println("6 - Show Menu");
        System.out.println("7 - Quit Menu");
    }

    public static void addContact(){
        System.out.println("Add Contact");
        System.out.println("Add new contact Name");
        String name = scanner.nextLine();
        System.out.println("Add new contact Phone No.");
        String phoneNumber = scanner.nextLine();
        mobilePhone.addNewContact(Contact.createContact(name,phoneNumber));
    }
    public static void updateContact() {
        System.out.println("Update Contact");
        System.out.println("Provide Old Contact name");
        Contact oldContact = mobilePhone.queryContact(scanner.nextLine());
        if(oldContact == null){
            System.out.println("Contact not found");
        }else {
            System.out.println("Contact found");
            System.out.println("Add updated contact Name");
            String updName = scanner.nextLine();
            System.out.println("Add updated contact Phone No.");
            String updPhoneNumber = scanner.nextLine();
            mobilePhone.updateContact(oldContact, Contact.createContact(updName,updPhoneNumber));
        }
    }

    public static void removeContact(){
        System.out.println("Remove Contact");
        System.out.println("Provide Contact name to remove");
        Contact removeContact = mobilePhone.queryContact(scanner.nextLine());
        if(mobilePhone.removeContact(removeContact)){
            System.out.println(removeContact.getName() + " was removed");
        }else {
            System.out.println("Contact was not found");
        }
    }

    public static void findContact(){
        System.out.println("Find Contact");
        System.out.println("Provide Contact name to find");
        Contact findContact = mobilePhone.queryContact(scanner.nextLine());
        if(findContact == null){
            System.out.println("Contact not found");
        }else {
            System.out.println(findContact.getName() + " -> " +findContact.getPhoneNumber());
        }
    }
}
