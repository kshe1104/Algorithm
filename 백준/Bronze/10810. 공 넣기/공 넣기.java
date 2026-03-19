
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt(); // 바구니 갯수
        int  m = sr.nextInt(); // 공 넣는 횟수

        int [] basket = new int[n];

        for(int i=0;i<m;i++){
            int first = sr.nextInt(); //첫번째 바구니 인덱스+1
            int last = sr.nextInt(); //마지막 바구니 인덱스+1
            int num = sr.nextInt(); //넣을 공의 숫자

            for(int j = first-1;j<=last-1;j++){
                basket[j]=num; //숫자넣기
            }
        }

        for (int i : basket) {
            System.out.println(i);
        }
    }
}
