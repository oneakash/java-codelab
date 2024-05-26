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
        System.out.println("Circle with Green color, " + r + " radius and "+(3.1416*r*r)+" area drawn in the Canvas.");
    }
   
}


