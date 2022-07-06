package ExceptionHandling_AbstractClasses_Interfaces;

public class Tracing {
    public static void main(String[] args) {
        String str = "HELLO-WORLD!!";
        String[] a = {"3", "4", "35", "0", "27", "0", "0", "90", "40", "55", "68"};
        String[] b = {"12", "", "0", "23", "w", "0", "f", "0"};
        for(int i = 0; i < a.length + 1; i++)
        {
            try
            {
                if(i < a.length - 2)
                {
                    int x = Integer.parseInt(a[i + 1]);
                    int y = Integer.parseInt(b[i]);
                    System.out.println(x / y);
                    System.out.println(str.charAt(i * 10));
                    System.out.println("No exception this time.");
                }
                else if(i >= b.length)
                {
                    int x = Integer.parseInt(b[i - 2]);
                    int y = Integer.parseInt(a[i]);
                    System.out.println(x / y);
                }
            }
            catch(ArithmeticException e)
            {
                System.out.println("Invalid Arithmetic Operation");
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Array Out Of Bounds");
            }
            catch(StringIndexOutOfBoundsException e)
            {
                System.out.println("String Out Of Bounds");
            }
            catch(NumberFormatException e)
            {
                System.out.println("hmmm, can't convert.");
            }
        }
    }
}
