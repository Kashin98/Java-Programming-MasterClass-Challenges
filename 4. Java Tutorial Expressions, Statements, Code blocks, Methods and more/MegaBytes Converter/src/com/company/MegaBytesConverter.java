package com.company;

/* MegaBytes Converter

---
** Please read this entire page before attempting to solve this coding exercise.  Additional help is available by watching the video mentioned at the bottom of the page **
---

Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.

The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.

Then it needs to print a message in the format "XX KB = YY MB and ZZ KB". XX represents the original value kiloBytes. YY represents the calculated megabytes. ZZ represents the calculated remaining kilobytes.

1 MegaByte = 1024 Kilobytes (Binary)
*/

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kilobytes){
        int calculateMegaBytes = kilobytes/1024;
        int calculateRemainingKiloBytes = kilobytes%1024;
        System.out.println(kilobytes + " KB = " + calculateMegaBytes + " MB and " + calculateRemainingKiloBytes + " KB");

        // Shorter answer: Do calculation in print method itself w/o variables.
        // System.out.println(kilobytes + " KB = " + kilobytes/1000 + " MB and " + kilobytes%1000 + " KB");
    }
}
