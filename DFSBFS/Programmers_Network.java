package DFSBFS;

import java.util.ArrayDeque;
import java.util.Queue;

public class Programmers_Network {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];

        for(int i=0; i<n; i++){
            if(!visited[i]){
                bfs(i, computers, n, visited);
                answer += 1;
            }

        }
        return answer;
    }
    public void bfs(int cur, int[][] computers, int total, boolean[] visited){
        Queue<Integer> q = new ArrayDeque<>();
        q.add(cur);


        while(!q.isEmpty()){
            int current = q.poll();
            visited[current] = true;

            for(int i=0; i<total; i++){
                if(i != current && computers[current][i] == 1){
                    if(!visited[i]){
                        visited[i] = true;
                        q.add(i);
                    }
                }
            }
        }
    }
}
