import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        
        String[] str = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            str[i] = String.valueOf(numbers[i]); //String으로
        }
        
        Arrays.sort(str,(o1,o2)->(o2+o1).compareTo(o1+o2));
        
 if(str[0].equals("0")){
            return "0";
        } // 정렬했는데 0이 가장 크다면 0 리턴
        
            StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            sb.append(str[i]); // 차례대로 더해줌
        }
        return sb.toString();
    }
}