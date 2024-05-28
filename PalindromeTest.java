public class PalindromeTest {
    public static void main(String[] args) {
        String s = args[0];
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        if(s.equals(sb.toString())){
            System.out.println("Yes");
        }
        else System.out.println("No");
        System.out.println(s);
    }
}
