package account;

public class TestAccount
{
   public static void main(String[] args)
   {
      
      Account accJohn = new Account("S93203", "John", 2534.31);
      System.out.println(accJohn.getId());
      System.out.println(accJohn.getName());
      System.out.println(accJohn.getBalance());
      accJohn.debit(5000);
      System.out.println(accJohn.getBalance());
      accJohn.debit(200);
      System.out.println(accJohn.getBalance());
      accJohn.credit(600);
      System.out.println(accJohn.accountDetails());
      System.out.println("-----------------------------------------------------------------");
      
      Account accSarah = new Account("C45442", "Sarah");
      accSarah.credit(340.97);
      
      accJohn.transferTo(accSarah, 100000);
      accJohn.transferTo(accSarah, 500);
      
      System.out.println(accJohn.accountDetails());
      System.out.println(accSarah.accountDetails());
      System.out.println("-----------------------------------------------------------------");
   
   }


}