/*
Mohammad Hashmi
Xpanxion/Vanguard Homework 1
Program asks for user to enter # of weeks, converts input to days,hours,minutes,seconds
 */

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //variable declarations
        int weeks, days, hours, minutes, seconds;


        System.out.print("Enter number of weeks: ");
        weeks = scanner.nextInt();

        //perform calculations based on user input
        days=weeks*7;
        hours=days*24;
        minutes=hours*60;
        seconds=minutes*60;


        System.out.println(days+" days.");
        System.out.println(hours+ " hours.");
        System.out.println(minutes+ " minutes.");
        System.out.println(seconds+ " seconds.");

    }
}