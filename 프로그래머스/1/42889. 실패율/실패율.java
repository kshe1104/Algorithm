import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
       int[] challenger = new int[N+2]; //스테이지별 도전자수
        for(int i=0;i<stages.length;i++)
        {
            challenger[stages[i]]+=1;
        }
        
        HashMap<Integer,Double> fails = new HashMap<>(); //스테이지 별 실패자 수
        double total = stages.length;
        
        //각 스테이지 순회하며 실패율 계산
        for(int i=1;i<=N;i++){
            if(challenger[i]==0){ //도전한 사람이 없는 경우 -> 실패율 0
                fails.put(i,0.);
            }
            else{
                fails.put(i,challenger[i]/total); //실패율 구함
                total-=challenger[i];// 다음 스테이지 실패율을 구하기 위해 현재 스테이지의 인원을 뺌
            }
        }
        //실패율이 높은 스테이지부터 내림차순으로 정렬
        return fails.entrySet().stream().sorted((o1,o2)->Double.compare(o2.getValue(),o1.getValue())).mapToInt(HashMap.Entry::getKey).toArray();
    }
}