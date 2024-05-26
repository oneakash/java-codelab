package org;
import org.animals.Fish;
import org.typs.Action;

public class MainApp {
    public static void main(String[] args) {
        Fish shark = new Fish(350.0, "Swimming");
        shark.eat("Tuna");
        shark.sleep(120);
        shark.printPrice(200);
        Action action = shark;
        action.move();
    }
}
