package Appf.Objects;
import Appf.Abstructs.*;

public class Circle extends Shape implements Draw{
    double radius;
    String color;
    public Circle(String color, double radius){
        super(color);
        this.color = color;
        this.radius = radius;
    }
    public double area(){
        return Math.PI*Math.pow(radius,2);
    }
    public void drawShape(){
        System.out.println("Circle with " + color + " color, " + radius + " radius and " + area() + " area drawn in the Canvas.");
    }
}
