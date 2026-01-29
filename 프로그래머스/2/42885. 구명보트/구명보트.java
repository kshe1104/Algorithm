import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        int left = 0;
        int right = people.length-1;
        int answer = 0;
        Arrays.sort(people);
        while(left<=right){ // 투포인터 탐색(시간복잡도가 낮음)
            if(people[left]+people[right]<=limit){
                left++;
                right--; //둘 태움
            }
            else{
                right--; // 무거운 쪽만 점점 가벼운 사람으로 교체
            }
            answer++;
        }
        return answer;
    }
}