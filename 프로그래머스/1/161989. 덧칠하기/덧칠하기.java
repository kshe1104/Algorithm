class Solution {
    public static int solution(int n, int m, int[] section) {
        boolean[] wall = new boolean[n+1]; // 벽 1번~n번을 편하게 쓰기위해 n+1로 만듦
        int count = 0;
        // 기본값인 false -> 칠해져있음 , true -> 칠해야함

        for (int i = 0; i < section.length; i++) {
            wall[section[i]] = true;
        }

        // 1번구역부터 n번 구역까지 순회
        for (int i = 1; i <= n; i++) {
            if (wall[i]) {
                count++;
                
                // i부터 시작해서 m개 구역을 칠해진 상태로 변경
                for (int j = 0; j < m; j++) {
                    if(i+j<=n) wall[i+j]=false;
                }
                
            }
        }
        return count;
    }
}