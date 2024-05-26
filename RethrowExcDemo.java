class OpenException extends Exception{}
class CloseException extends Exception{}

public class RethrowExcDemo {
    public static void main(String[] args) throws OpenException, CloseException {
        boolean flag = args.length/2==0;
        try{
            if(flag) throw new OpenException();
            else throw new CloseException();
        }
        // catch(OpenException oe){
        //     System.out.println(oe);
        //     throw oe;
        // }
        // catch(CloseException ce){
        //     System.out.println(ce);
        //     throw ce;
        // }
        catch(Exception e){
            System.out.println(e);
            throw e;
        }
    }
}
