
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt(); // 바구니 갯수
        int m = sr.nextInt(); // 교환 횟수
        int [] basket = new int[n]; //바구니 생성

        for (int i = 0; i < n; i++) {
            basket[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            int num1 = sr.nextInt();
            int num2 = sr.nextInt();

            int tmp;
            tmp = basket[num1 - 1];
            basket[num1-1] = basket[num2-1];
            basket[num2-1] = tmp;
        }

        for (int i : basket) {
            System.out.println(i);
        }
    }
}
