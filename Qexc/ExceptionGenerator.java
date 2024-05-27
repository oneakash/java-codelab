package Qexc;

public class ExceptionGenerator{
    public static void a(){
        throw new ArithmeticException();
    }
    public static void b(){
        throw new NullPointerException();
    }
    public static void c() throws Exception{
        throw new ArrayIndexOutOfBoundsException();
    }
    public static void d() throws NullValueException{
        throw new NullValueException(0);
    }
}
