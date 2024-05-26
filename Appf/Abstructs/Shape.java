package Appf.Abstructs;

public abstract class Shape {
    private String color;
    public Shape(String color){
        this.color = color;
    }
    public abstract double area();
    public final String getColor() {
        return this.color;
    }
}
