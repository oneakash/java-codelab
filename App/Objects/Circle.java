package App.Objects;
import App.Abstructs.*;

public class Circle extends Shape implements Draw{
    double r,A;
    public Circle(String color , double r){
        super(color);
        this.r=r;
    }
    public double area(){
        A= Math.PI*r*r;
        return A;
    }
    public void drawShape(){
        System.out.println("Circle with " + getColor() +" color, " + r + " radius and "+(Math.PI*r*r)+" area drawn in the Canvas.");
    }
   
}


