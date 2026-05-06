import java.util.*;
class Solution{
        public int solution(int[][] maps){
            int n = maps.length; //행
            int m = maps[0].length; //열

            // BFS를 위한 큐를 준비
            Queue<int[]> queue = new LinkedList<>(); // 큐 한칸에 int형 배열이 들어가는 queue 준비

            int[] dx = {-1, 1, 0, 0}; // 상하
            int[] dy = {0, 0, -1, 1}; // 좌우

            boolean[][] visited = new boolean[n][m]; // 방문여부 체크 맵의 크기만큼

            queue.add(new int[]{0,0,1}); // 큐에 넣는다 0,0,1 이라는 배열을
            // 현재 위치와 거리를 넣음
            // 칸의 갯수를 세는 게 목적이므로 시작위치도 거리 1로

            visited[0][0] = true; // 시작위치 방문여부 초기화

            while(!queue.isEmpty()){
                int[] current = queue.poll(); // 큐에서 하나 꺼냄
                int r = current[0];
                int c = current[1];
                int dist = current[2];

                // 목적지 진영에 도착했다면
                if(r==n-1&&c==m-1){
                    return dist; //거리반환
                }
                for (int i = 0; i < 4; i++) {
                    int nr = r+dx[i];
                    int nc = c+dy[i];

                    if(nr>=0&&nr<n&&nc>=0&&nc<m){
                        if(maps[nr][nc]==1&&!visited[nr][nc]){
                            visited[nr][nc] = true;
                            queue.add(new int[]{nr, nc, dist + 1});
                        }
                    }
                }
            }

           return -1;
        }
    }