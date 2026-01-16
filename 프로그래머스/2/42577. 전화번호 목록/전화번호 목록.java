import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        // 중복x, 빠른 탐색속도
        Set<String> set = new HashSet<>(); 
        
        // Set에 phone_book 전부 추가하기
        for(int i=0;i<phone_book.length;i++){
            set.add(phone_book[i]);
        }
        
        for(String phone:phone_book){
            for(int i=1;i<phone.length();i++){
                if(set.contains(phone.substring(0,i))) return false;
            }
        }
        return true;
    }
}