import java.util.*;
class Solution {
public int[] solution(int[] progress,int[] speeds){
    Queue<Integer> q = new LinkedList<>();
    for (int i = 0; i < progress.length; i++) {
        int remain = 100 - progress[i]; // 남은 과정
        int day = remain / speeds[i]; // 앞으로 걸릴 작업 일 수
        if(remain%speeds[i]!=0) day++;  // 나머지가 있다면 하루 더
        q.add(day); //큐에 삽입
}
        ArrayList<Object> answerList = new ArrayList<>(); // 동적배열생성

        while (!q.isEmpty()) {
            int firstDeploy = q.poll(); // 이번 배포의 주인공(기준일)
            int count = 1; // 주인공 본인은 이미 포함

            // 큐가 비어있지 않고, 다음 작업이 기준일보다 빨리 끝나거나 같이끝난다면?
            while (!q.isEmpty() && q.peek() <= firstDeploy) {
                q.poll();
                count++; // 배포 갯수 증가
            }

            answerList.add(count); // 총 배포 갯수 저장
        }
    int[] answer = new int[answerList.size()];
    for (int i = 0; i < answerList.size(); i++) {
        answer[i] = (int) answerList.get(i);
    }
    return answer;
}
}