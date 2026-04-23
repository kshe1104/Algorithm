import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        Scanner sr = new Scanner(System.in); //입력
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 정점의 갯수
        int m = Integer.parseInt(st.nextToken()); // 간선의 갯수
        int start = Integer.parseInt(st.nextToken()); // 탐색을 시작할 정점의 갯수

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>(); //간선저장

        // 1. 그래프 초기화(정점의 갯수만큼 리스트 객체 생성)
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // 2. 간선 저장
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine()); //매 줄마다 새로 잘라줘야함
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        // 3. 작은 번호부터 방문하기 위해 정렬
        for (int i = 1; i <= n; i++) {
            Collections.sort(graph.get(i));
        }


        boolean[] visited_DFS = new boolean[n + 1];
        dfs(start, graph, visited_DFS); // static으로 인해 체인으로 부르지 않아도 사용가능
        System.out.println();

        boolean[] visited_BFS = new boolean[n + 1];
        bfs(start, graph, visited_BFS);
    }

static void dfs(int node,ArrayList<ArrayList<Integer>> graph,boolean[] visited){
    visited[node] = true;
    System.out.print(node + " "); // 방문순서 출력
    for (int next : graph.get(node)) {
        if (!visited[next]) {
            dfs(next, graph, visited); //재귀적으로 실행

        }
    }
}
static void bfs(int start,ArrayList<ArrayList<Integer>> graph,boolean[] visited){
    Queue<Integer> queue = new LinkedList<>();

    // 1. 시작 노드를 큐에 넣고 방문 처리
    queue.add(start);
    visited[start] = true;

    // 2, 큐가 빌 때 까지 반복
    while (!queue.isEmpty()) {
        //큐에서 노드를 하나 꺼냄
        int current = queue.poll();
        System.out.print(current + " "); // 방문 순서 출력

        // 3. 현재 노드와 연결된 모든 노드를 확인
        for (int next : graph.get(current)) {
            if (!visited[next]) {
                visited[next] = true;
                queue.add(next);
            }
        }
    }
}}
