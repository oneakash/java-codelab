package org.typs;

public class Animal implements Action{
    public double w;
    public String mt;
    public Animal(double weight, String movementType){
        w = weight;
        mt = movementType;
    }
    public void eat(String t){
        System.out.println("Eating " + t + "...");
    }
    public void sleep(int s){
        System.out.println("Sleeping for " + s + " min...");
    }
    public void move(){
        System.out.println(mt);
    }
    public double getWeight(){
        return w;
    }
}
