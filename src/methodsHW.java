/*This program asks user to input a total of four numbers. A variety of calculations are performed and then displayed.
 */

import java.util.Scanner;

public class methodsHW {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = input.nextInt();
        System.out.print("Enter b: ");
        int b = input.nextInt();
        System.out.print("Enter c: ");
        int c = input.nextInt();
        System.out.print("Enter d: ");
        int d = input.nextInt();

        System.out.println(a + " + " + b + " + " + c + " + " + d + " = " + sum(a,b,c,d));
        System.out.println(a + " * " + b + " * " + d + " = " + multiply(a,b,d));
        System.out.println(b + " / " + d + " = " + divide(b,d));
        System.out.println(b + " - " + c + " = " + subtract(b,c));

    }

    //method returns the sum of four numbers
    public static int sum(int one, int two, int three, int four){
        int total= one+two+three+four;
        return total;
    }

    //method calculates and returns the product of three numbers
    public static int multiply(int one, int two, int three){
        int total= one*two*three;
        return total;
    }

    //method calculates and returns the division of two numbers
    public static double divide(int one, int two){
        double total= one/(double)two;
        return total;
    }


    //method calculates and returns the difference between to #s
    public static int subtract(int one, int two){
        int total= one-two;
        return total;
    }
}