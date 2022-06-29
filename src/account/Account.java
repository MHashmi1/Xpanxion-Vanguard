package account;

//this class creates account objects and has a method that allows transfers between objects

public class Account {

    private String id;
    private String name;
    private double balance;

    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId(){
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return this.balance;
    }

    public void credit(double a){
        this.balance +=a;
    }

    public boolean debit(double a){
        if ((this.balance - a) <0){
            System.out.println("Amount exceeded!");
            return false;
        }
        else {
            this.balance -= a;
            return true;
        }
    }

    public void transferTo(Account account, double a){
        if (this.debit(a)){
            account.balance +=  a;
            System.out.println("Transfer completed!");
        }
    }

    public String accountDetails(){
        return this.name+" the current balance in your account "+this.id+" is $"+this.balance;
    }
}
