package Inheritance_Polymorphism_HW.Problem1;

public class Circle extends Shape {

    private double radius;

    public Circle(){
        this.radius=1;
    }

    public Circle (double radius){
        this.radius=radius;
    }

    public Circle (double radius, boolean isFilled, String color){
        super(isFilled, color);
        this.radius=radius;
    }

    public double getArea (){
        return Math.PI*Math.pow(this.radius,2);
    }

    public String toString(){
        return "Radius: "+this.radius+"\nArea: "+this.getArea()+"\n"+super.toString();
    }
}
