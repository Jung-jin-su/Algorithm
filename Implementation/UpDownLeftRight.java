package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class UpDownLeftRight {

    static int N;
    static int[][] map;
    static String[] dir;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        map = new int[N][N];

        dir = br.readLine().split(" ");

        int startX = 0;
        int startY = 0;

        for(int i = 0; i<dir.length; i++){
            if(dir[i].equals("U")) {
                startX -= 1;
                if(startX < 0) startX += 1;
            }
            else if(dir[i].equals("D")) {
                startX += 1;
                if(startX >= N) startX -= 1;
            }
            else if(dir[i].equals("L")) {
                startY -= 1;
                if(startY < 0) startY += 1;
            }
            else {
                startY += 1;
                if(startY >= N) startY -= 1;
            }
        }

        System.out.println((startX+1)+" "+(startY+1));
    }

    private static void start(int r, int c) {

    }
}
