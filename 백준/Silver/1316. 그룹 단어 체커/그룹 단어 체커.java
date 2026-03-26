import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        int n = sr.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            String word = sr.next();
            if (isGroupWord(word)) {
                count++;
            }
        }
        System.out.println(count);
        sr.close();
        
    }

    public static boolean isGroupWord(String s) {
        Set<Character> appeared = new HashSet<>();
        char prev = '\0'; //작전문자

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == prev) { // 1. 같은 문자가 연속으로 나와도 괜찮음
                continue;
            }

            // 2. 지금 문자가 이미 나왔던 문자인데, prev와 다르면 X
            if(appeared.contains(ch)){
                return false;
            }

            // 3. 처음 보는 문자면 Set에 추가, prev 갱신
            appeared.add(ch);
            prev = ch;
        }
        return true;
    }
}
