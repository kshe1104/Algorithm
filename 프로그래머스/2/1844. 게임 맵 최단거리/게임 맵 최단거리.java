import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int n = maps.length; // 행
        int m = maps[0].length; // 열
        
        // BFS를 위한 큐 준비
        Queue<int[]> queue = new LinkedList<>();
        
        // 방향 배열
        int[] dr = {1,-1,0,0}; // 상,하
        int[] dc = {0,0,1,-1}; // 좌,우
        
        boolean[][] visited = new boolean[n][m]; // maps의 크기만큼 방문배열
        
        // 초기화
        // 시작 위치(0,0)와 현재까지의 거리(1)을 큐에 넣기
        queue.add(new int[]{0,0,1}); // 크기 3짜리 배열을 큐에 삽입
        visited[0][0] = true; // 시작 위치 방문 처리
        
        // 반복
        while(!queue.isEmpty()){
            int [] current = queue.poll(); // 큐에서 하나 꺼냄
            int r = current[0];
            int c = current[1];
            int dist = current[2];
            
            // 목적지(상대 팀 진영)에 도착했다면?
            if(r==n-1&&c==m-1){
                return dist;
            }
            
            // 주변 4방향 탐색
            for(int i=0;i<4;i++){
                int nr = r+dr[i]; // 현재 위치에서 상,하
                int nc = c+dc[i]; // 현재 위치에서 좌,우
                
                // 맵 안이고, 벽이 아니고, 아직 안가본 곳이라면?
                if(nr>=0&nr<n&&nc>=0&&nc<m){
                    if(maps[nr][nc]==1&&!visited[nr][nc]){ // 아직 안가본 곳이라면
                        visited[nr][nc] = true; // 방문표시
                        queue.add(new int[]{nr,nc,dist+1}); // 큐에 넣기(거리+1);
                    }
                }
            }
        }
        // 끝까지 못갔다면 못가는 막혀있는 곳이므로 -1 반환
        return -1;
    }
}