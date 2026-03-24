
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String n1 = sr.next();
        String n2 = sr.next();

        StringBuilder sb1 = new StringBuilder(n1);
        StringBuilder sb2 = new StringBuilder(n2);

        int a = Integer.parseInt(sb1.reverse().toString());
        int b = Integer.parseInt(sb2.reverse().toString());
        
        System.out.println(Math.max(a,b));
    }
}