    class Solution{
        int max_tired = 0;

        public int solution(int k, int[][] dungeons) {
            boolean[] visited = new boolean[dungeons.length]; // 던전 방문여부
            dfs(0, k , dungeons, visited);
            return max_tired;
        }

        public void dfs(int depth, int tired, int[][] dungeons, boolean[] visited) {
            max_tired = Math.max(depth, max_tired); // 최댓값 검사
            for (int i = 0; i < dungeons.length; i++) {
                if (!visited[i] && tired >= dungeons[i][0]) {
                    visited[i] = true;
                    dfs(depth+1,tired-dungeons[i][1],dungeons,visited);
                    visited[i] = false;
                }
            }
        }
    }