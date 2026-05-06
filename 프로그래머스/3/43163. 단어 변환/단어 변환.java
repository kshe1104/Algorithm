import java.util.*;
class Solution{
        public int solution(String begin,String target,String[] words){
            // target이 words[] 안에 있는 지 확인 없으면 끝
            for (int i = 0; i < words.length; i++) {
                boolean have = false;
                if(target.equals(words[i])) {
                    have = true;
                    break;
                }

            }

            boolean[] visited = new boolean[words.length]; // words에 방문표시

            Queue<Node> queue = new LinkedList<>();
            queue.add(new Node(begin,0)); // 시작단어 큐에 넣고 시작


            while (!queue.isEmpty()) {
                Node current = queue.poll(); // 큐에서 꺼냄

                // 만약 현재 단어가 target과 같다면 바로 정답 반환
                if(current.word.equals(target)) return current.count;

                // words 배열 순회하면서 다음에 갈 수 있는 단어 찾기
                for (int i = 0; i < words.length; i++) {
                    // 1. 아직 방문x , 2. 한 글자만 다르다면
                    if (!visited[i] && canConvert(current.word, words[i])) {
                        visited[i] = true;
                        queue.add(new Node(words[i], current.count + 1));
                    }
                }
            }
            return 0;
        }

        public boolean canConvert(String s1, String s2) {
            int diffCount = 0; // 몇글자 차이나나
            for (int i = 0; i < s1.length(); i++) { // 글자 수 만큼 비교
                if (s1.charAt(i) != s2.charAt(i)) { // 다르다면 count++
                    diffCount++;
                }
            }
            if(diffCount==1) return true;
            else return false;
        }    static class Node{
        String word;
        int count;

        Node(String word, int count) {
            this.word = word;
            this.count = count;
        }
    }
    }
