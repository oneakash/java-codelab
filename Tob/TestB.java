package Tob;

abstract class X {
    int i;
    X(int i){
        this.i = i;
    }
    int m(int j){
        return i * j;
    }
    abstract int m2(int j, int k);
    void m4(){}
}

class Y extends X{
    Y(int i){
        super(i);
    }
    int m2(int a, int b){
        return a * b;
    }
}
public class TestB{
    public static void main(String[] args) {
        Z z = new Z(10,20);
        Y y = new Y(5);
        z.m3("Java");
        System.out.println("1:"+z.m2(6,6));
        System.out.println("2:"+y.m2(6,6));
        X x = y;
        System.out.println("3:"+x.m(15));
        System.out.println("4:"+x.i);
        x = z;
        System.out.println("5:"+x.m(15));
        System.out.println("6:"+x.i);
        x.m4();
        z.i+=10;
        x.m4();
        x.i+=10;
        x.m4();
    }
}