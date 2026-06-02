    class Solution{
        int maxDungeons = 0;

        public int solution(int k, int[][] dungeons) {
            boolean[] visited = new boolean[dungeons.length];
            dfs(0, k, dungeons, visited);
            return maxDungeons;
        }

        private void dfs(int depth, int fatigue, int[][] dungeons, boolean[] visited) {
            // 던전에 들어와서 지금 내 깊이와 최고기록을 비교
            maxDungeons = Math.max(maxDungeons, depth);
            for (int i = 0; i < dungeons.length; i++) {
                if (!visited[i] && fatigue >= dungeons[i][0]) {
                    visited[i] = true;
                    
                    dfs(depth + 1, fatigue - dungeons[i][1], dungeons, visited);

                    visited[i] = false;
                }
            }
        }
    }