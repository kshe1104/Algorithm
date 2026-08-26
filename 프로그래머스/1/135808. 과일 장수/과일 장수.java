import java.util.*;
class Solution {
  public int solution(int k, int m, int[] score) {
        int answer = 0; // 가격
        Arrays.sort(score); // [1,2,3,1,2,3,1] 정렬
        for (int i = score.length-m; i >= 0; i = i -m) { // [1,1,1,2,2,3,3]
            answer += score[i] * m;

        }
        return answer;
    }
}