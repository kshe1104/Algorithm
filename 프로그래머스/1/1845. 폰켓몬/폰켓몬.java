import java.util.*;
class Solution {
    public int solution(int[] nums) {
        HashSet h = new HashSet();
        for(int i=0;i<nums.length;i++){
            h.add(nums[i]);
        }
        
        if (h.size()<nums.length/2){
            return h.size();
        }else{
            return nums.length/2;
        }
    }
}