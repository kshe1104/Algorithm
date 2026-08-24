class Solution {
    public int solution(String[] babbling) {
         int answer = 0;
        String[] speak = {"aya", "ye", "woo", "ma"};
        String[] Nospeak = {"ayaaya","yeye","woowoo","mama"};
        for(String b : babbling){
            // 연속된 같은 발음이 포함되어 있으면 통과
            boolean Repeat = false;
            for(String repeat : Nospeak){
                if(b.contains(repeat)){
                    Repeat = true;
                    break;
                }
            }
            if(Repeat) continue;
        
        // 발음 가능한 단어 -> 공백으로
        for(String sound : speak){
            b = b.replace(sound," ");
        }
        // 남은 공백을 지웠을 때 빈 문자열이면 발음 가능
        if(b.replace(" ","").isEmpty()){
            answer++;
        }}
       
        return answer;
    }
}