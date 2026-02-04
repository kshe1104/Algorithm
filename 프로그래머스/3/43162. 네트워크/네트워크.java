class Solution {
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        int answer = 0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,computers,visited);
                answer++; // 한그룹 끝 -> 네트워크 +1
            }
        }
        return answer;
    }
    
    public void dfs(int now, int[][] computers,boolean[] visited){
        visited[now] = true;
        for(int next=0;next<computers.length;next++){
            if(computers[now][next]==1&&!visited[next])// 한 행씩 검사
                // 연결되어있다면 그리고 방문한적이 없다면
                dfs(next,computers,visited); // 재귀로 간접 연결까지 체크
        }
    }
}