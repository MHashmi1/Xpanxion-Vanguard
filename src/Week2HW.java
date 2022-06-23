//This programs prompts the user to enter an integer
// and creates an array filled with random numbers and outputs various computations

import java.util.Scanner;

public class Week2HW {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n =0;
        while (n<1){
            System.out.print("Enter an integer n, greater than 0: ");
            n=input.nextInt();
        }
        System.out.println();

        int[] array = new int[n];
        for(int x=0; x< array.length; x++){
            array[x]=(int) (1+(Math.random())*500);
        }

        System.out.println("Array on one line:");
        printArray(array);
        System.out.println("Maximum: "+getMax(array));
        System.out.println("Minimum: "+getMin(array));
        System.out.println("Sum: "+sumValues(array));
        System.out.println("Average: "+getAverage(array));
        System.out.println("Number of integers greater than average: "+greaterThanAverage(array));
        System.out.println("Number of times subsequent value increases: "+countInc(array));
        System.out.println("Number of times subsequent value decreases: "+countDec(array));
        System.out.println("Array with 3 elements per line: ");
        printArray3PerLn(array);
    }

    public static int getMax(int[] arr){
        int max = arr[0];
        for(int x=0; x< arr.length; x++){
            if (arr[x]>max)
                max=arr[x];
        }
        return max;
    }
    public static int getMin(int[] arr){
        int min = arr[0];
        for(int x=0; x< arr.length; x++){
            if (arr[x]<min)
                min=arr[x];
        }
        return min;
    }

    public static int sumValues(int[] arr){
        int sum=0;
        for(int x=0; x< arr.length; x++){
            sum+=arr[x];
        }
        return sum;
    }

    public static double getAverage(int[] arr){
        double average = (double)sumValues(arr)/arr.length;
        return average;
    }

    public static int greaterThanAverage(int arr[]){
        int count=0;
        for(int x=0; x< arr.length; x++){
            if (arr[x]>getAverage(arr))
                count++;
        }
        return count;
    }

    public static int countInc(int arr[]){
        int count = 0;
        for(int x=0; x< arr.length-1; x++){
            if (arr[x]<arr[x+1])
                count++;
        }
        return count;
    }
    public static int countDec(int arr[]){
        int count = 0;
        for(int x=0; x< arr.length-1; x++){
            if (arr[x]>arr[x+1])
                count++;
        }
        return count;
    }

    public static void printArray(int arr[]){
        for(int x=0; x< arr.length; x++){
            System.out.print(arr[x]+" ");
        }
        System.out.println();
    }

    public static void printArray3PerLn(int arr[]){
        for(int x=0; x< arr.length; x++){
            if (x%3==0)
                System.out.println();
            System.out.print(arr[x]+" ");
        }
        System.out.println();
    }
}
