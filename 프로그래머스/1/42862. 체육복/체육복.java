import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        int[] clothes = new int[n]; //학생들 체육복 배열
        Arrays.fill(clothes,1);

        for(int i=0;i<lost.length;i++){
            clothes[lost[i]-1]--; //잃어버린 아이들 체육복 갯수 -1
        }
        
        for(int i=0;i<reserve.length;i++){
            clothes[reserve[i]-1]++; //여분 옷 가져온 학생들 옷 수 +1
        }
        
  for (int i = 0; i < n; i++) {
    if (clothes[i] == 0) {
        // 앞에서 빌릴 수 있는지 먼저 확인
        if (i - 1 >= 0 && clothes[i - 1] > 1) {
            clothes[i]++;
            clothes[i - 1]--;
        }
        // 앞에서 못 빌렸으면 뒤에서 시도
        else if (i + 1 < n && clothes[i + 1] > 1) {
            clothes[i]++;
            clothes[i + 1]--;
        }
    }
}
        int answer = 0;
        for(int i=0;i<n;i++){
            if(clothes[i]>=1){answer++;}
        }
  
        return answer;
    }
}