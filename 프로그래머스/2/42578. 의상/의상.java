import java.util.*;
class Solution{

        public int solution(String[][] clothes) {
            int fashion = 1;
            HashMap<String, Integer> map = new HashMap<>();
            for (String[] s : clothes) {
                String type = s[1]; // 의상의 종류
                map.put(type, map.getOrDefault(type, 0) + 1); // map에 넣는데 이미 type이 존재하면 갯수를 1늘리고, 처음보는 종류면 1이라고 적어넣자
            }
            for (int value : map.values()) { // 각 카테고리별 갯수
                fashion *= (value+1);
            }
            return fashion - 1; // 아무것도 안입은 상태는 제외한다.
        }
    }