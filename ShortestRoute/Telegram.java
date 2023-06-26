package ShortestRoute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Node{
    int next, value;
    public Node(int next, int value){
        this.next = next;
        this.value = value;
    }
}
public class Telegram {
    static int N, M, C;
    static int[] dist;
    static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        dist = new int[N+1];
        Arrays.fill(dist, 1001);

        for(int i=0; i<=N; i++){
            graph.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            graph.get(x).add(new Node(y, z));
        }

        dijkstra(C);

        int count = 0;
        int max_dist = 0;

        for(int i=1; i<=N; i++){
            if(dist[i] != 1001){
                count++;
                max_dist = Math.max(dist[i], max_dist);
            }
        }
        System.out.println(count-1+" "+max_dist);
    }

    private static void dijkstra(int start) {
        PriorityQueue<Node> q = new PriorityQueue<>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.value-o2.value;
            }
        });

        q.add(new Node(start, 0));
        dist[start] = 0;

        while (!q.isEmpty()){
            Node curNode = q.poll();

            if(dist[curNode.next] < curNode.value) continue;

            for(int i=0; i<graph.get(curNode.next).size(); i++){
                int cost = dist[curNode.next] + graph.get(curNode.next).get(i).value;

                if(cost < dist[graph.get(curNode.next).get(i).next]){
                    dist[graph.get(curNode.next).get(i).next] = cost;
                    q.add(new Node(graph.get(curNode.next).get(i).next, cost));
                }
            }
        }
    }
}
