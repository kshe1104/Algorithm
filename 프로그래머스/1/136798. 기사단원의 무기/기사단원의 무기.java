class Solution {
    public static int solution(int number, int limit, int power) {
        int answer = 0;

        // 1번 기사부터 number 기사까지 각각의 약수 개수를 구함
        for (int i = 1; i <= number; i++) {
            int count = 0; // i번 기사의 약수 갯수

            // 제곱근까지만 탐색
            for (int j = 1; j * j <= i; j++) {
                if(j*j==i) count++; // 제곱수인 경우 1개만 추가
                else if(i%j==0){ // 나누어 떨어지면 2개의 약수 추가
                    count+=2;
                }
            }

            // 약수 개수가 제한수치(limit)을 초과하는지 검사
            if(count>limit) answer+=power;
            else{
                answer += count;
            }
        }
        return answer;
    }
}