package org.animals;
import org.typs.Animal;;

public class Fish extends Animal{
    public Fish(double weight, String movementType){
        super(weight, movementType);
    }
    public void printPrice(double pricePerKg){
        System.out.println(getWeight()*pricePerKg);
    }
}
