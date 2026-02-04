class Solution {
    public int answer = 0;
    public int solution(int[] numbers, int target) {dfs(0,0,numbers,target);
        return answer;
        
    }
    
    public void dfs(int depth,int sum, int[] numbers,int target){
        if(depth==numbers.length){ // 모든 숫자 다 활용했다면
            if(sum==target) answer++; //근데 target을 만족했다면 정답수+1
        
            return; //아니라면 그냥 return
        }
    dfs(depth+1,sum+numbers[depth],numbers,target);
    
    dfs(depth+1,sum-numbers[depth],numbers,target);
    }    
}