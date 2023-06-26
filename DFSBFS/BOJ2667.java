package DFSBFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class BOJ2667 {
    static int N;
    static int[][] map;
    static boolean[][] visited;
    static int total;
    static int[] cnt;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        visited = new boolean[N][N];
        total = 0;
        cnt = new int[25*25];

        for(int i=0; i<N; i++){
            String s = br.readLine();
            for(int j=0; j<N; j++){
                map[i][j] = s.charAt(j) - '0';
            }
        }   //입력완료

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(!visited[i][j] && map[i][j] == 1) {
                    total++;
                    dfs(i, j);
                }
            }
        }

        Arrays.sort(cnt);
        System.out.println(total);
        for(int i=0; i<cnt.length; i++){
            if(cnt[i] != 0) System.out.println(cnt[i]);
        }

    }

    private static void dfs(int r, int c) {
        visited[r][c] = true;
        cnt[total]++;

        for(int k=0; k<4; k++){
            int nx = r + dx[k];
            int ny = c + dy[k];

            if(nx >=0 && ny >= 0 && nx < N && ny < N){
                if(!visited[nx][ny] && map[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    dfs(nx, ny);
                }
            }
        }
    }
}
