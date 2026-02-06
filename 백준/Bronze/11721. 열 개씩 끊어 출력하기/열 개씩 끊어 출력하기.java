
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String word = sr.nextLine(); //문자 받기
        StringBuilder sb = new StringBuilder();

        Queue<Character> queue = new LinkedList<>();
        char[] word2 = word.toCharArray();

        for (int i = 0; i < word2.length; i++) {
            queue.add(word2[i]); // queue 가득채우기
        }

        while(!queue.isEmpty()){
            for(int i=0;i<10&&!queue.isEmpty();i++){ //NullPointerException 방지
            sb.append(queue.poll());}
            System.out.println(sb);
            sb.setLength(0); //StringBuilder 비우기
        }
    }
}
