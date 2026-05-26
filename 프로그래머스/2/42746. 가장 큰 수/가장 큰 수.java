import java.util.*;
class Solution{
        public String solution(int[] numbers){
            String[] strNumbers = new String[numbers.length]; // numbers를 String으로 바꿔줄 배열 생성
            for (int i = 0; i < numbers.length; i++) {
                strNumbers[i] = String.valueOf(numbers[i]); // int[] => String[]
            }
            
            
            // 2. 사전 순x, 이어 붙였을 때 큰 순서로 내림차순 설정
            Arrays.sort(strNumbers, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return (o2 + o1).compareTo(o1 + o2); // o2+o1과 o1+o2를 비교해서 큰 것을 앞으로 오게함(내림차순)
                }
            });
            
            if(strNumbers[0].equals("0")) return "0";
            // 정렬 결과 예시: [34,3,30]
            StringBuilder sb = new StringBuilder();
            for (String str : strNumbers) {
                sb.append(str);
            }
            return sb.toString();
        }
    }