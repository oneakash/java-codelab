public class ThrowsDemo {
    static void throwOne() {
        System.out.println("Inside throwOne.");
        throw new ArithmeticException();
        // throw new IllegalAccessException("demo");
    }
    public static void main(String[] args) {
        throwOne();
        // try{
        //     throwOne();
        // }
        // catch(IllegalAccessException e){
        //     System.out.println("Caught " + e);
        // }
    }
}
