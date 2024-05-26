package Qexc;

public class NullValueException extends Exception {
    public int n;
    public NullValueException(int n) {
        this.n = n;
    }
    public String toString(){
        return "Null Value Exception: NullValueException " + n;
    }
}
