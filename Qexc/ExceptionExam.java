package Qexc;

public class ExceptionExam {
    public static void main(String[] args) {
        int n = args.length;
        System.out.println("Total Exception: " + n);
        try{
            if(n == 0) ExceptionGenerator.a();
            if(n == 1) ExceptionGenerator.b();
            try{
                if(n == 2) ExceptionGenerator.c();
                else if(n == 3) ExceptionGenerator.d();
                else throw new NullValueException(n);
            }
            catch(ArrayIndexOutOfBoundsException ex){
                System.out.println("Exception is " + ex);
            }
        }
        catch(ArithmeticException | NullPointerException ex){
            System.out.println("Exception = " +ex);
        }
        catch(NullValueException ex){
            System.out.println(ex);
        }
        catch(Exception ex){
            System.out.println("Any Exception");
        }
        System.out.println("Exam Ended");
    }
}
