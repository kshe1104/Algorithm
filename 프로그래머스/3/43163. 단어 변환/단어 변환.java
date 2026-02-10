import java.util.*;
class Solution {
public int solution(String begin, String target, String[] words){
        int answer = 0;

        Queue<String> q = new LinkedList<>();
    int[] ch = new int[words.length];
    q.offer(begin); // 문자열 넣기
    int level = 0; //레벨체크

    while (!q.isEmpty()) {
        int size = q.size();

        for (int i = 0; i < size; i++) {
            String tmp = q.poll(); // q값 꺼내기
            if(tmp.equals(target)) return level;

            char[] a = tmp.toCharArray();

            for (int t = 0; t < words.length; t++) {
                char[] b = words[t].toCharArray();
                int cnt = 0;
                for (int j = 0; j <b.length; j++) {
                    if(a[j]!=b[j]) cnt++;
                }
                if (cnt == 1 && ch[t] == 0) {
                    q.offer(words[t]);
                    ch[t] = 1;
                }
            }
        }
        level++;
    }
    return answer;
}
}