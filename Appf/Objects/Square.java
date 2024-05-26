package Appf.Objects;

public class Square extends Rectangle {
    public Square(String color, double side){
        super(color, side, side);
    }
    public void drawShape(){
        System.out.println("Square with " + getColor() + " color and " + area() + " area drawn in the Canvas.");
    }
}
