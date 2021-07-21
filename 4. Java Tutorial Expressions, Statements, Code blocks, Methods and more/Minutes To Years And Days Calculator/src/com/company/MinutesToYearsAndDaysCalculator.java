package com.company;

/* convert given minutes to years and days. print output as XX min = YY y and ZZ d .
create method as printYearsAndDays with parameter long named minutes. return -1 if minutes is less than 0.

EXAMPLES OF INPUT/OUTPUT:

printYearsAndDays(525600); should print "525600 min = 1 y and 0 d"
printYearsAndDays(1051200); should print "1051200 min = 2 y and 0 d"
printYearsAndDays(561600); should print "561600 min = 1 y and 25 d"
*/

public class MinutesToYearsAndDaysCalculator {

    public static void printYearsAndDays(long minutes){
        if (minutes>0){
            long days =  minutes/60/24;
            long years = days / 365;
            long remainingDays = days % 365 ;
            System.out.println(minutes + " mins = " + years + " y and " + remainingDays +" days");
        }else {
            System.out.println("Invalid Value");
        }

    }

}
