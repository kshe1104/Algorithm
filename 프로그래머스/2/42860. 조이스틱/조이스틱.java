import java.util.*;
class Solution {
    public int solution(String name) {
                int len = name.length();
        int result = 0;
        char[] joy = new char[len];

        for(int i=0;i<len;i++){
char c = name.charAt(i);
            result+=Math.min(c-'A','Z'-c+1);// 위 아래 최소조작
        }
        // 좌/우 최소이동
        int move = len-1;//일단 끝까지 쭉 가는 경우
        for(int i=0;i<len;i++){
            int next = i+1;
            // 연속된 'A'구간 찾기
            while(next<len && name.charAt(next)=='A'){next++;}
            //오른족으로 갔다가 되돌아오는 경우들을 모두 고려
            int case1 = 2*i+len-next;
            int case2 = i+2*(len-next);
            move = Math.min(move,Math.min(case1,case2));
        }
        result+=move;
        return result;
    }
}