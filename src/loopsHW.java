import java.util.Scanner;

public class loopsHW {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        int sum = 0;
        int count = 1;
        while(n <= 1){
            System.out.print("Enter an integer n greater than 1: ");
            n = scan.nextInt();
        }
        while(count <= n){
            if((n % count) == 0){
                sum+= count;
                count++;
            }
            else {
                count++;
            }

        }
        System.out.println("The sum of all factors of " + n + " is " + sum);
    }
}