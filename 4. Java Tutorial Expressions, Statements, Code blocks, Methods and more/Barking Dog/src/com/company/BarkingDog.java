package com.company;

/* ---
** Please read this entire page before attempting to solve this coding exercise.
* Additional help is available by watching the video mentioned at the bottom of the page **
---

We have a dog that likes to bark.  We need to wake up if the dog is barking at night!

Write a method bark that has 2 parameters.

1st parameter should be of type boolean and be named barking it represents if our dog is currently barking.

2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has valid range of 0-23.
We have to wake up if the dog is barking before 08:00 am or after 22:00 hours so in that case return true.

In all other cases return false. If the hourOfDay parameter is less than 0 or greater than 23 return false.

Examples of input/output:

bark(true, 1); should return true
bark(false, 2); should return false since the dog is not barking.
bark(true, 8); should return false, since it's not before 8:00AM.
bark(true, -1); should return false because the hourOfDay parameter needs to be in range 0-23.
TIP: Use an if else statement with multiple conditions.

NOTE: The bark method  needs to be defined as public static like we have been doing so far in the course.

NOTE: Do not add a  main method to solution code.

--
*/

public class BarkingDog {

    public static boolean bark(boolean barking, int hourOfDay){
        if(hourOfDay<0 || hourOfDay > 23){
            return false;
        } else if(hourOfDay < 8 || hourOfDay > 22){
            return barking ? true : false;
        }else{
            return barking ? false : true;
        }
    }
}
