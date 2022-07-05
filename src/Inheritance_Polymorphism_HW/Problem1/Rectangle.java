package Inheritance_Polymorphism_HW.Problem1;

public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle(){
        this.width=2;
        this.length=1;
    }

    public Rectangle(double width, double length){
        this.setLW(width, length);
    }

    public Rectangle(double width, double length, boolean isFilled, String color){
        super(isFilled, color);
        this.setLW(width, length);
    }

    public void setLW(double x, double y){
        if (x>y){
            this.length=x;
            this.width=y;
        }
        else {
            this.length=y;
            this.width=x;
        }
    }

    public double getArea(){
        return this.length*this.width;
    }

    public String toString(){
        return "Width: "+this.width+"\nLength: "+this.length+"\nArea: "+this.getArea()+"\n"+super.toString();
    }



}
