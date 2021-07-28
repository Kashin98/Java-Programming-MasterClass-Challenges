package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    SimpleCalculator calculator = new SimpleCalculator();

//	    Part of original question (Works fine :)
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add= " + calculator.getAdditionResult());
//        System.out.println("subtract= " + calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply= " + calculator.getMultiplicationResult());
//        System.out.println("divide= " + calculator.getDivisionResult());


//	    Creating actual calculator that takes in user Input (Not Part of Question)
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Enter the First value");
            calculator.setFirstNumber(scanner.nextInt());
            System.out.println("Enter the Second value");
            calculator.setSecondNumber(scanner.nextInt());
            System.out.println("Do you want to 1 - Add");
            System.out.println("Do you want to 2 - Subtract");
            System.out.println("Do you want to 3 - Multiply");
            System.out.println("Do you want to 4 - Divide");
            int input = scanner.nextInt();
            if(input == 1){
                System.out.println(calculator.getAdditionResult());
            }
            if(input == 2){
                System.out.println(calculator.getSubtractionResult());
            }
            if(input == 3){
                System.out.println(calculator.getMultiplicationResult());
            }
            if(input == 4){
                System.out.println(calculator.getDivisionResult());
            }
            scanner.nextLine(); //Handle character enter key
            System.out.println("************");
            System.out.println();
            System.out.println("Do you want to continue ? - y/n");
            String more = scanner.nextLine();
            if(more.equals("y")){
                continue;
            }
            else {
                break;
            }
        }
    }
}
