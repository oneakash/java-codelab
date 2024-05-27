package Toc;
abstract class P{
    int i;
    P(int i){
        this.i = i;
    }
    int m(int j){
        return 2*i+2*j;
    }
    abstract int m2(int j, int k);
    void m4(){}
}
class Q extends P{
    Q(int i){
        super(i);
    }
    int m2(int x, int y){
        return 2*x+2*y;
    }
}

public class TestC {
    public static void main(String[] args) {
        R r = new R(10, 20);
        Q q = new Q(5);
        r.m3("Java");
        System.out.println("1:"+r.m2(6,6));
        System.out.println("2:"+q.m2(6,6));
        P p = q;
        System.out.println("3:"+p.m(15));
        System.out.println("4:"+p.i);
        p = r;
        System.out.println("5:"+p.m(15));
        System.out.println("6:"+p.i);
        p.m4();
        r.i+=10;
        p.m4();
        p.i+=10;
        p.m4();
    }
}
