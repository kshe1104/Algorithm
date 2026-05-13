import java.util.*;
 class Solution{
        public int solution(int[] priories, int location){
            Queue<Process> q = new LinkedList<>();
            int answer = 0; // 실행횟수
            for (int i = 0; i < priories.length; i++) {
                q.add(new Process(priories[i], i)); // 큐에 노드 삽입
            }

            Arrays.sort(priories); // 우선순위 정렬
            int targetIdx = priories.length - 1; // 가장 우선순위 높은 값의 위치

            while (!q.isEmpty()) {
                Process cur = q.poll();

                // 만약 현재 꺼낸 게 가장 높은 우선순위라면?
                if (cur.priority == priories[targetIdx]) {
                    answer++;
                    targetIdx--;

                    // 이게 내가 찾던 그 위치의 프로세스라면?
                    if (cur.location == location) {
                        return answer;
                    }
                }
                else{ // 더 높은 것이 뒤에 있다는 뜻이니 다시 큐에 집어넣음
                    q.add(cur);
                }
            }
            return answer;
        }
    static class Process{
        int priority; // 우선순위
        int location; // 위치

        Process(int priority, int location) {
            this.priority = priority;
            this.location = location;
        }
    }
}