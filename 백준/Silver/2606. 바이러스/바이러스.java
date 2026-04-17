
import java.util.*;

public class Main {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        int computer = sr.nextInt(); //컴퓨터 갯수
        int bridge = sr.nextInt(); // 직접 연결되어있는 컴퓨터의 수

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(); // 2차원 배열 생성
        // int[][] list  = new int[n][m] 과같음
        // But, 초기화 안함 그냥 생성만

        for (int i = 0; i <= computer; i++) {
            graph.add(new ArrayList<>()); // 빈 리스트 추가
        }

        for (int i = 0; i < bridge; i++) {
            int a = sr.nextInt();
            int b = sr.nextInt(); // 연결정보 입력받기

            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        boolean[] visited = new boolean[computer+1];
        dfs(1, graph, visited);
        System.out.println(count);

    }

    public static void dfs(int node,ArrayList<ArrayList<Integer>> graph, boolean[] visited){
        visited[node] = true; // 방문
        for(int next : graph.get(node)){ // 이중리스트의 인덱스를 돌면서 진행
            if(!visited[next]){
                count++; // 새롭게 감염
                dfs(next, graph, visited);
            }
        }
    }

}

