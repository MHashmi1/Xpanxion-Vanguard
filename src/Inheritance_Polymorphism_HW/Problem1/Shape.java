package Inheritance_Polymorphism_HW.Problem1;

public class Shape {

    private boolean isFilled;
    private String color;

    public Shape(){
        this.isFilled=true;
        this.color="Green";
    }

    public Shape(boolean isFilled, String color){
        this.isFilled=isFilled;
        this.color=color;
    }

    @Override
    public String toString(){
        return "Filled: "+this.isFilled+"\nColor: "+this.color;
    }

}
