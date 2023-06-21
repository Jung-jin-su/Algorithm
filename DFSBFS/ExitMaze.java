package DFSBFS;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

class Move{
    int x, y, cnt;

    public Move(int x, int y, int cnt){
        this.x = x;
        this.y = y;
        this.cnt = cnt;
    }
}

public class ExitMaze {
    static int N, M;
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

            for(int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(String.valueOf(c[j]));
            }
        }

        System.out.println(bfs(0, 0));

    }

    private static int bfs(int r, int c) {
        Queue<Move> q = new ArrayDeque<>();
        q.add(new Move(r, c, 0));
        visited[r][c] = true;

        while (!q.isEmpty()){
            Move cur = q.poll();

            int x = cur.x;
            int y = cur.y;
            int count = cur.cnt;

            if(x == N-1 && y == M-1) return count+1;

            for(int k=0; k<4; k++){
                int nx = x + dx[k];
                int ny = y + dy[k];

                if(nx < 0 || ny < 0 || nx >= N || ny >= M) continue;

                if(map[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    q.add(new Move(nx, ny, count+1));
                }
            }
        }
        return 0;
    }
}
