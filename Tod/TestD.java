package Tod;
abstract class D{
    int i;
    D(int i){
        this.i=i;
    }
    int m(int j){
        return i+j;
    }
    abstract int m2(int j, int k);
    void m4(){}
}

class E extends D{
    E(int i){
        super(i);
    }
    int m2(int x, int y){
        return x*y;
    }
}
public class TestD {
    public static void main(String[] args) {
        F c = new F(10, 20);
        E b = new E(5);
        c.m3("Java");
        System.out.println("1:"+c.m2(6,6));
        System.out.println("2:"+b.m2(6,6));
        D a = b;
        System.out.println("3:"+a.m(15));
        System.out.println("4:"+a.i);
        a = c;
        System.out.println("5:"+a.m(15));
        System.out.println("6:"+a.i);
        a.m4();
        c.i+=10;
        a.m4();
        a.i+=10;
        a.m4();
    }
}
