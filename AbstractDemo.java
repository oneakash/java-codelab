abstract class A{
    abstract void callme();
    void callmetoo(){
        System.out.println("This is a contrete method.");
    }
}
class B extends A{
    void callme(){
        System.out.println("B's implementation of callme.");
    }
}

class AbstractDemo {
    public static void main(String[] args) {
        B ob = new B();
        ob.callme();
        ob.callmetoo();
    }
}
