package p2;
/**
 * OtherPakage
 */
class OtherPakage {
    OtherPakage(){
        p1.Protection p = new p1.Protection();
        System.out.println("other pakage constructor");
        // class or pakage only
        // System.out.println("n = " + p.n);
        // class only
        // System.out.println("n_pri = " + p.n_pri);
        // class, subclass or pakage only
        // System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}