//Homework example for creating classes
package clothing;
public class Clothing {

    public double price;
    public String type;
    public String size;

    public Clothing(){
        this.price = 29.9;
        this.type = "T-shirt";
        this.size = "Medium";
    }

    public Clothing(double price, String type, String size){
        this.price = price;
        this.type = type;
        this.size = size;
    }

    public void increasePrice(){
        this.price += 5;
    }

    public void increasePrice(double x){
        this.price += x;
    }

    public void details(){
        System.out.println("Item: " + this.type);
        System.out.println("Size: " + this.size);
        System.out.println("Price: $" + this.price);
        System.out.println();
    }
}
