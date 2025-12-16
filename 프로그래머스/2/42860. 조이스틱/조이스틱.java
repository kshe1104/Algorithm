import java.util.*;
class Solution {
    public int solution(String name) {
        int answer = 0;
        int len = name.length();
        for(int i=0;i<len;i++){
            char c = name.charAt(i);
            answer+=Math.min(c-'A','Z'-c+1);
        }
        // 좌/우 최소 이동
        int move = len-1; // 일단 끝까지 가는 경우 -> 움직임이 len-1만큼 일어남
        for(int i=0;i<len;i++){
            int next = i+1; 
           
        while(next<len && name.charAt(next)=='A'){
            next++; // A가 겹쳐있는 구간 건너뛰기
        }
            // 오른쪽으로 갔다가 되돌아오는 경우들을 모두 고려
            int case1 = 2*i+len-next; //오른쪽 갔다가 왼쪽
            int case2 = i+2*(len-next); //왼쪽(끝) 쪽으로 크게 돌아오기
            move = Math.min(move,Math.min(case1,case2));
        }
        answer+=move;
        return answer;
    }
}