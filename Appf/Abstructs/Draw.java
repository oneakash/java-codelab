package Appf.Abstructs;

public interface Draw {
    void drawShape();
    default void drawBackground(){
        System.out.println("Draw Background Not Implemented");
    }
}
