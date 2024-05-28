package Appf.Objects;
import Appf.Abstructs.*;

public class Circle extends Shape implements Draw{
    double radius;
    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }
    public double area(){
        return Math.PI*Math.pow(radius,2);
    }
    public void drawShape(){
        System.out.println("Circle with " + getColor() + " color, " + radius + " radius and " + area() + " area drawn in the Canvas.");
    }
}
