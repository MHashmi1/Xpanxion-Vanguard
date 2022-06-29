//this program has a method that tests whether the two strings are an exact reverse of one another

public class Reverse
{
   public static void main(String[] args)
   {

      System.out.println(isExactReverse("ba", "a"));
      System.out.println(isExactReverse("desserts", "stressed"));
      System.out.println(isExactReverse("apple", "apple"));
      System.out.println(isExactReverse("regal", "lager"));
      System.out.println(isExactReverse("war", "raw"));
      System.out.println(isExactReverse("pal", "slap"));


   }
   public static boolean isExactReverse(String x, String y)
   {
      int c=0;
      if (x.length() != y.length())
         return false;
      else{
         for (int i= x.length()-1;i>=0; i--){
            if (x.charAt(i) != y.charAt(c)) {
               return false;
            }
            c++;
         }
      }
      return true;
   }

}