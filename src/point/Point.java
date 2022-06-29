//This class creates objects containing coordinates and has a method
//that can calculate the distance between two point objects

package point;

public class Point {

    private int x;
    private int y;

    public Point(){
        x=0;
        y=0;
    }

    public Point(int xVal, int yVal){

        this.x = xVal;
        this.y = yVal;

    }

    public int getY(){
        return this.y;
    }
    public int getX(){
        return this.x;
    }

    public void setPoint(int newX, int newY){
        this.x = newX;
        this.y = newY;
    }

    public String toString(){
        return "("+this.x+","+this.y+")";
    }

    public double distance(Point a){

        return Math.sqrt(Math.pow((double)(this.x-a.getX()),2) + Math.pow((double)(this.y-a.getY()),2));

    }

}
