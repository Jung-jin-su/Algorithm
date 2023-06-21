package DFSBFS;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

public class FreezingDrinks_BFS {
    static int N, M, result;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M];

        for(int i=0; i<N; i++){
            String s = br.readLine();
            char[] c = s.toCharArray();

            for (int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(String.valueOf(c[j]));
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(map[i][j] == 0 && !visited[i][j]) bfs(i, j);
            }
        }
        System.out.println(result);
    }

    private static void bfs(int startX, int startY) {
        Queue<Point> q = new ArrayDeque<>();
        q.add(new Point(startX, startY));
        visited[startX][startY] = true;

        while (!q.isEmpty()){
            Point cur = q.poll();
            int x = cur.x;
            int y = cur.y;

            for(int k=0; k<4; k++){
                int nx = x + dx[k];
                int ny = y + dy[k];

                if(nx < 0 || ny < 0 || nx >= N || ny>= M) continue;

                if(map[nx][ny] == 0 && !visited[nx][ny]){
                    visited[nx][ny] = true;
                    q.add(new Point(nx, ny));
                }
            }
        }

        result++;
    }
}
