//program takes user input and prints out various computations

import java.util.Scanner;

public class ArrayHW2 {

    public static int max(int[] array){

        int max=0;
        for(int x=0; x< array.length; x++){
            if(array[x]>max)
                max=array[x];
        }
        return max;
    }

    public static int min(int[] array){

        int min=array[0];
        for(int x=0; x< array.length; x++){
            if(array[x]<min)
                min=array[x];
        }
        return min;
    }

    public static double average(int[] array){

        double total=0;
        for(int x=0; x< array.length; x++){
            total += array[x];
        }
        return total/ array.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=0;
        System.out.print("Enter integer n, greater than 0: ");
        while (n<1){
            n=scanner.nextInt();
        }
        int[] arr = new int[n];

        System.out.println("Enter "+n+" integers: ");
        for(int x=0; x< arr.length; x++){
            arr[x]=scanner.nextInt();
            System.out.print(arr[x]+" ");
        }

        System.out.print("You entered: ");
        for(int x=0; x< arr.length; x++){
            System.out.print(arr[x]+" ");
        }
        System.out.println();

        System.out.println("Maximum value: "+max(arr));
        System.out.println("Minimum value: "+min(arr));
        System.out.println("Average: "+average(arr));

        System.out.println();

        System.out.println("Elements greater than average:");
        for(int x=0; x< arr.length; x++){
            if (arr[x]>average(arr))
                System.out.print(arr[x]+" ");
        }

        System.out.println();

        System.out.println("Elements greater than "+arr[arr.length-1]+":");
        for(int x=0; x< arr.length; x++){
            if (arr[x]>arr[arr.length-1])
                System.out.print(arr[x]+" ");
        }

        System.out.println();

        System.out.println("Array in reverse order: ");
        for(int x= arr.length-1; x>= 0; x--){
            System.out.print(arr[x]+" ");
        }

    }
}
