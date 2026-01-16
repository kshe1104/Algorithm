import java.util.*;
class Solution {
    public int solution(int[] nums) {
        HashSet h = new HashSet(); // HashSet 생성 크기 정적으로 잡을 필요 없음
        
        for(int i=0;i<nums.length;i++){
            h.add(nums[i]); //전부 다 hashSet에 넣음(중복 허용하지않기때문에)
        }
        
        if (h.size() < nums.length/2){
            return h.size(); //만약 HashSet의 사이즈가 포켓몬의 수의 절반보다 작다면 사이즈 리턴
        } else{
            return nums.length/2;
        }
    }
}