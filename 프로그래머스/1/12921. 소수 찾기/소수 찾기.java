class Solution {
    public int solution(int n) {
 int result = 0;
        for(int i=2;i<=n;i++){
            if(isPrime(i)) result++;
        }
        return result;
    }

    public boolean isPrime(int num){
                for(int i=2;i*i<=num; i++){
            if(num%i==0) return false;
        }
        return true;
    }
    
}