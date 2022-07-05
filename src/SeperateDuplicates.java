//The method takes a String as a parameter and returns a new String.
// -The returned String should be exactly like str,
// but any identical characters that appear in a consecutive way must be separated
// by hyphens “-“.

public class SeperateDuplicates
{
   public static void main(String[] args)
   {

      System.out.println(seperateDuplicatesChars("Hello"));
      System.out.println(seperateDuplicatesChars("Bookkeeper"));
      System.out.println(seperateDuplicatesChars("Yellowwood door"));
      System.out.println(seperateDuplicatesChars("Chicago Cubs"));

   }
   
   public static String seperateDuplicatesChars(String str)
   {

      for (int i=0;  i<(str.length()-1); i++){
         if (str.charAt(i) == str.charAt(i+1)){
            str = str.substring(0,i+1) + "-" +str.substring(i+1);
         }
   }
      return str;
   }
}