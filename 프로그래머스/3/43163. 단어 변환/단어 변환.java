import java.util.*;
class Solution {
    public int solution(String begin, String target, String[] words) {
        // 1. target 이 words 안에 있는지 체크
        boolean exists = false;
        for (String w : words) {
            if(w.equals(target)){
                exists = true;
                break;
            }
        }
        if(!exists) return 0;

        // 2. BFS -> 큐와 방문배열
        Queue<Node> q = new LinkedList<>();
        boolean visited[] = new boolean[words.length];

        //시작 단어와 단계 0부터 시작
        q.offer(new Node(begin, 0));

        while (!q.isEmpty()) {
            Node cur = q.poll();

            // 3. target에 도달하면 그때의 단계 수 반환
            if (cur.word.equals(target)) {
                return cur.step;
            }

            // 4. 아직 방문하지않은 word 중에서
            // 현재 단어와 한 글자만 다른 단어들을 큐에 넣음
            for (int i = 0; i < words.length; i++) {
                if (!visited[i] && canConvert(cur.word, words[i])) {
                    visited[i] = true;
                    q.offer(new Node(words[i], cur.step + 1));
                }
            }
        }
        
        // 여기까지 왔다 -> target에 도달하지 못함
        return 0;
    }

    private static class Node {
        String word;
        int step;

        public Node(String word, int step) { // 명시적으로 생성자 만들어줌
            this.word = word;
            this.step = step;
        }
    }

    private boolean canConvert(String a, String b) {
        int diff = 0;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)!=b.charAt(i)) diff++;
            if(diff>1) return false; // 2글자 이상 다르면 바로 false
        }
        return diff == 1; // diff가 1인지아닌지 반환
    }
}