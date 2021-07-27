package com.company;
/*
Flour Pack Problem
        Write a method named canPack with three parameters of type int named bigCount, smallCount, and goal.

        The parameter bigCount represents the count of big flour bags (5 kilos each).

        The parameter smallCount represents the count of small flour bags (1 kilo each).

        The parameter goal represents the goal amount of kilos of flour needed to assemble a package.

        Therefore, the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal.
        The method should return true if it is possible to make a package with goal kilos of flour.

        If the sum is greater than goal, ensure that only full bags are used towards the goal amount.
        For example, if goal = 9, bigCount = 2, and smallCount = 0, the method should return false since each
        big bag is 5 kilos and cannot be divided. However, if goal = 9, bigCount = 1, and smallCount = 5,
        the method should return true because of 1 full bigCount bag and 4 full smallCount bags equal goal,
        and it's okay if there are additional bags left over.

        If any of the parameters are negative, return false.

        EXAMPLE INPUT/OUTPUT:

        canPack (1, 0, 4); should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.

        canPack (1, 0, 5); should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.

        canPack (0, 5, 4); should return true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos,
        and we have 1 bag left which is ok as mentioned above.

        canPack (2, 2, 11); should return true since bigCount is 2 (big bags 5 kilos each) and smallCount is
        2 (small bags of 1 kilo), makes in total 12 kilos and goal is 11 kilos.

        canPack (-3, 2, 12); should return false since bigCount is negative.



        NOTE: The method canPack should be defined as public static like we have been doing so far in the course.

        NOTE: Do not add a main method to the solution code.*/

public class FlourPack {
    /*Algorithm

    * Take the 3 input values see if any of them are less than 0, if yes return false
    * Check if total value of big sacks, total of small sacks or total of small + big sacks is equal to goal
    * If not, check if totalValueAllSacks - goal returns a negative value, if yes return false. (Checks if you have
      enough sacks to even reach the goal)
    * If not get and store the remainder from goal divided by 5 (goal % 5) in var (remainder)
    * Minus remainder from the goal value and then divide that value by 5 ((goal - remaider) / 5 ) and store in
      var (bigSacksNeeded)
    * Check if bigSacksNeeded is lesser than or greater than and equal to inputted bigSacks value.
    * If greater then check if remainder is lesser than or equal to inputted small sacks value, if yes return true else false;
    * if less then store ((bigSacksNeeded - bigSacks) * 5) + remainder to the new var (neededForGoal).
    * Check if neededForGoal is lesser than or equal to inputted small sacks value.
       */


    public static boolean canPack (int bigSacks, int smallSacks, int goal){
        if(bigSacks < 0 || smallSacks < 0 || goal < 0){
            return false;
        }
        int totalAllSacks = (bigSacks * 5) + smallSacks;

        if((bigSacks * 5) == goal || smallSacks == goal || totalAllSacks == goal){
            return true;
        }
//        Checks if you have enough sacks to even reach goal
        int difference =  totalAllSacks - goal;
        if (difference < 0){
            return false;
        }

//        Gives remainder that is not divisible by 5 (one big sack = 5 kg)
        int remainder = goal % 5;
//        Gives exact value of bigSacks needed
        int bigSacksNeeded = (goal - remainder) / 5 ;
//        If we have enough bigSacks than that is needed for the goal, we just need to finish off the remainder
        if (bigSacks >= bigSacksNeeded){
//            Whatever remainder sacks we need should be lesser or equal to the amount of small sacks we have
            return remainder <= smallSacks;
        }
        else{
//            If we don't have enough bigSacks to cover the bigSacksNeeded for goal than we need to find how many big
//            sacks we're short, convert that to smallSack value, add the remainder and see exactly how many small sacks
//            are needed to reach goal.
            int neededForGoal = ((bigSacksNeeded - bigSacks) * 5) + remainder;
            return neededForGoal <= smallSacks;
        }
     }
}
