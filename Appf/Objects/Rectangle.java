package Appf.Objects;
import Appf.Abstructs.*;

public class Rectangle extends Shape implements Draw{
    public double width;
    public double height;
    public Rectangle(String color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }
    public double area(){
        return height * width;
    }
    public void drawShape(){
        System.out.println("Rectangle with " + getColor() + " color, " + width + " width, " + height + " height and " + area() + "drawn in the Canvas.");
    }
    public void drawBackground(){
        System.out.println("Drawing Background");
    }
    
}
