package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();

//        Part of Question (Works)

//        person.setFirstName("");   // firstName is set to empty string
//        person.setLastName("");    // lastName is set to empty string
//        person.setAge(10);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setFirstName("John");    // firstName is set to John
//        person.setAge(18);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setLastName("Smith");    // lastName is set to Smith
//        System.out.println("fullName= " + person.getFullName());


//        Not Part of question (Takes in User Input to create person)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name");
        person.setFirstName(scanner.nextLine());
        System.out.println("Enter Second Name");
        person.setLastName(scanner.nextLine());
        System.out.println("Enter Age");
        person.setAge(scanner.nextInt());

        System.out.println(" 1 - Check if You're teen");
        System.out.println(" 2 - Get your full Name");
        int choice = scanner.nextInt();
        if(choice == 1){
            System.out.println(person.isTeen());
        }
        else if(choice == 2){
            System.out.println(person.getFullName());
        }
        else{
            System.out.println("Invalid Choice");
        }

    }
}
