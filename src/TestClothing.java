//This class creates objects based on the Clothing class

public class TestClothing
{
   public static void main(String[] args)
   {
      Clothing clt1 = new Clothing();

      clt1.details();
      clt1.increasePrice();
      clt1.details();
      clt1.increasePrice(7);
      clt1.details();

      Clothing clt2 = new Clothing(31.2, "Jeans", "Small");

      clt2.details();
      clt2.increasePrice();
      clt2.increasePrice();
      clt2.details();
      clt2.increasePrice(4);
      clt2.details();
   }
}