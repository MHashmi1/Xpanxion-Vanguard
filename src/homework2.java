import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter y: ");
        double y = scanner.nextDouble();
        System.out.print("Enter z: ");
        double z = scanner.nextDouble();

        if (x<y && y<z)
            System.out.println("INCREASING");
        else if (x>y && y>z)
            System.out.println("DECREASING");
        else
            System.out.println("NEITHER");
    }
}