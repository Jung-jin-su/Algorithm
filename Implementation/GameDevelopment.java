package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class GameDevelopment {
    static int N, M;
    static int startX, startY, startDir;
    static int[][] map;
    static boolean[][] visited;
    // 북, 서, 남, 동
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];
        int turn_cnt = 0;
        int result = 1;

        st = new StringTokenizer(br.readLine());

        startX = Integer.parseInt(st.nextToken());
        startY = Integer.parseInt(st.nextToken());
        startDir = Integer.parseInt(st.nextToken());

        for (int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        visited[startX][startY] = true;
        while (true){
            startDir = (startDir + 1) % 4;

            int x = startX + dx[startDir];
            int y = startY + dy[startDir];

            if(!visited[x][y] && map[x][y] == 0){
                startX = x;
                startY = y;
                result++;
                visited[x][y] = true;
                turn_cnt = 0;
                continue;
            }
            else turn_cnt++;

            if(turn_cnt == 4){
                x = startX - dx[startDir];
                y = startY - dy[startDir];

                if(map[x][y] == 0){
                    startX = x;
                    startY = y;
                }
                else break;

                turn_cnt = 0;
            }
        }
        System.out.println(result);
    }
}
