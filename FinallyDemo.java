public class FinallyDemo {
    static void procA(){
        try{
            System.out.println("Inside procA");
            throw new RuntimeException("demo");
        }
        finally{
            System.out.println("Inside finally of procA");
        }
    }
    static void procB(){
        try{
            System.out.println("Inside procB");
            return;
        }
        finally{
            System.out.println("Inside finally of procB");
        }
    }
    static void procC(){
        try{
            System.out.println("inside procC");
        }
        finally{
            System.out.println("procC's finally");
        }
    }
    public static void main(String[] args) {
        try{
            procA();
        }
        catch(Exception e){
            System.out.println("Exception caught");
        }
        procB(); procC();
    }
}
