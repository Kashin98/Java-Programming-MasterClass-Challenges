package com.company;

/*Create a method called getDurationString with two parameters, first parameter minutes and 2nd parameter seconds.

        You should validate that the first parameter minutes is >= 0.

        You should validate that the 2nd parameter seconds is >= 0.

        The method should return "Invalid value" in the method if either of the above are not true.

        If the parameters are valid then calculate how many hours minutes and seconds equal the minutes and
        seconds passed to this method and return that value as string in format XXh YYm ZZs where
        XX represents a number of hours, YY the minutes and ZZ the seconds.

        Create a 2nd method of the same name but with only one parameter seconds.

        Validate that it is >= 0, and return "Invalid value" if it is not true.

        If it is valid, then calculate how many minutes are in the seconds value and then call the other overloaded
        method passing the correct minutes and seconds calculated so that it can calculate correctly.

        Call both methods to print values to the console.

        Tips:
        Use int or long for your number data types is probably a good idea.
        1 minute = 60 seconds and 1 hour = 60 minutes or 3600 seconds.
        Methods should be static as we have used previously.

        Bonus Question:
        For the input 61 minutes output should be 01h 01m 00s, but it is ok if it is 1h 1m 0s (Tip: use if-else)
        Create a new console project and call it SecondsAndMinutesChallenge*/

public class SecondsAndMinutes {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    // Takes y mins and z secs and makes it into XXh YYm SSs
     public static void getDurationString(long minutes, long seconds){
        if((minutes>=0) && (seconds>=0)){
            long hours = minutes/60L;
            long remainingMinutes = (minutes%60L) + (seconds/60L);
            long remainingSeconds = seconds%60L;

            // Bonus Question - Solution
            if(hours<10 && remainingMinutes<10 && remainingSeconds<10){
                System.out.println("0"+hours + "h " + "0" + remainingMinutes + "m " + "0"+remainingSeconds + "s");
            }
            else{
                System.out.println(hours + "h " + remainingMinutes + "m " + remainingSeconds + "s");
            }

        }else {
            System.out.println(INVALID_VALUE_MESSAGE);
        }

     }

    // Takes only z secs converts to mins and secs passes it into older method to make it into XXh YYm SSs
     public static void getDurationString(long seconds){
         if (seconds>=0){
            long minutes = seconds/60L;
            long remainingSeconds = seconds%60L;
            getDurationString(minutes,remainingSeconds);
         }
         else {
             System.out.println(INVALID_VALUE_MESSAGE);
         }
     }
}
