import java.util.*;
class Solution{
    
    HashSet<Integer> numberSet = new HashSet<>();
    
    public int solution(String numbers){
        // 1. 가진 조각들로 만들 수 있는 모든 숫자를 조합해서 numberSet에 넣기
        permutation("", numbers);
        
        int count = 0;
        
        // 2. HashSet에 담긴 숫자들을 하나씩 꺼내어 소수인지 검사하기
        for (int num : numberSet) {
            if(isPrime(num)) count++;
        }
        
        return count;
    }

    // 순열 생성 메서드
    public void permutation(String combi, String others) {
        if(!combi.equals("")){
            numberSet.add(Integer.parseInt(combi));
        }

        // 2. 남은 조각들 하나씩 이어붙이며 다음 재귀로
        for (int i = 0; i < others.length(); i++) {
            permutation(
                    combi + others.charAt(i),
                    others.substring(0, i) + others.substring(i + 1)); // i번째 조각을 제외한 나머지
        }
    }

    public boolean isPrime(int num) {
        // 0과 1은 소수가 아닙니다
        if(num<=1) return false;

        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if(num%i==0) return false; // 소수가 아니므로
        }return true;
    }

}