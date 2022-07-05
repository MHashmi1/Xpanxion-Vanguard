package Inheritance_Polymorphism_HW.Problem2;

public class TestWord
{
   public static void main(String[] args)
   {

      Word w1 = new Word("Go Cubs Go", "Cub");
      System.out.println("New Word object");
   	System.out.println("Superclass word: " + w1.getSentence());
   	System.out.println("Subclass word: " + w1.getNoVowelsWord());
   	System.out.println("Is word a substring of sentence? " + w1.isSubstring());
      System.out.println();

      Word w2 = new Word("Applepie", "Apple");
      System.out.println("New Word object");
   	System.out.println("Superclass word: " + w2.getSentence());
   	System.out.println("Subclass word: " + w2.getNoVowelsWord());
   	System.out.println("Is word a substring of sentence? " + w2.isSubstring());
      System.out.println();

      System.out.println("w1 and w2 are the same? " + w1.equals(w2));

   }
}