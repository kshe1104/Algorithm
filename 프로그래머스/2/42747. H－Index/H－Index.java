import java.util.*;
class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        
        int n = citations.length;
        for (int i = 0; i < n; i++) {
            // h: 현재 논문을 포함하여 인용 횟수가 더 많은 논문의 수
            int h = n - i;
            
            if (citations[i] >= h) {
                return h;
            }
        }
        
        return 0;
    }
}