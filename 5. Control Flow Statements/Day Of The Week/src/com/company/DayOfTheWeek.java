package com.company;

/*Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.

        The method should not return any value (hint: void)

        Using a switch statement print Sunday, Monday, ... Saturday
        if the int parameter day is 0, 1, ... , 6 respectively, otherwise it should print Invalid day.

        Bonus:
        Write a second solution using if then else, instead of using switch.
        Create a new project in IntelliJ with the name DayOfTheWeekChallenge*/

public class DayOfTheWeek {

    public static void printDayOfTheWeek(int switchValue){

        switch (switchValue){
            case 0:
                System.out.println("It is Sunday");
                break;
            case 1:
                System.out.println("It is Monday");
                break;
            case 2:
                System.out.println("It is Tuesday");
                break;
            case 3:
                System.out.println("It is Wednesday");
                break;
            case 4:
                System.out.println("It is Thursday");
                break;
            case 5:
                System.out.println("It is Friday");
                break;
            case 6:
                System.out.println("It is Saturday");
                break;
            default:
                System.out.println("Invalid day, choose between 0 to 6");

        }
    }


}
