package Appf;
import Appf.Abstructs.Draw;
import Appf.Abstructs.Shape;
import Appf.Objects.Circle;
import Appf.Objects.Rectangle;
import Appf.Objects.Square;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Main Application Started.");
        Circle c = new Circle("Red", 50.0);
        c.drawShape();
        c.drawBackground();
        System.out.println("Circle Color = "+c.getColor());
        System.out.println("Circle Area = "+c.area());
        Shape s = new Circle("Yellow", 30.0);
        System.out.println("Circle Color = "+s.getColor());
        System.out.println("Circle Area = "+s.area());
        Draw d = new Circle("Green", 33.0);
        d.drawShape();
        d.drawBackground();
        Rectangle r = new Rectangle("Blue",80,60);
        r.drawShape();
        r.drawBackground();
        System.out.println("Rectangle Color = "+r.getColor());
        System.out.println("Rectangle Area = "+r.area());
        s = new Rectangle("White", 70, 30);
        System.out.println("Rectangle Color = "+s.getColor());
        System.out.println("Rectangle Area = "+s.area());
        d = new Rectangle("Orange", 60, 40);
        d.drawShape();
        d.drawBackground();
        Square sq = new Square("Purplr", 50);
        sq.drawShape();
        sq.drawBackground();
        System.out.println("Square Color = "+sq.getColor());
        System.out.println("Square Area = "+sq.area());
        r = new Square("Pink", 45);
        r.drawShape();
        r.drawBackground();
        System.out.println("Square Color = "+r.getColor());
        System.out.println("Square Area = "+r.area()); 
        s = new Square("Pink", 45);
        System.out.println("Square Color = "+s.getColor());
        System.out.println("Square Area = "+s.area());   
        d = new Square("Pink", 45);
        d.drawShape();
        d.drawBackground();
        System.out.println("Main Application Ended.");
    }
}
