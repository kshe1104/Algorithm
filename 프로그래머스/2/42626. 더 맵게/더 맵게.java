import java.util.*;    
class Solution{
        public int solution(int[] scoville,int k){
            int count = 0;
            PriorityQueue<Integer> pq = new PriorityQueue<>(); //우선순위 큐
            for (int i = 0; i < scoville.length; i++) {
                pq.add(scoville[i]);
            }
            while(pq.peek()<k){
                if(pq.size()<2) return -1;
                int food = pq.poll() + pq.poll() * 2;
                pq.add(food);
                count++;
            }
            return count;
        }
    }