package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class KnightOfKing {
    static int[] dx = {-2, -2, -1, -1, 2, 2, 1, 1};
    static int[] dy = {-1, 1, -2, 2, -1, 1, -2, 2};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] c = s.toCharArray();

        int row = Integer.parseInt(String.valueOf(c[1]));
        int column = (int) c[0] - (int) ('a') + 1;

        int cnt = 0;

        for(int i=0; i<8; i++){
            int x = row + dx[i];
            int y = column + dy[i];

            if(x >= 1 && y >= 1 && x <= 8 && y <= 8) cnt++;
        }
        System.out.println(cnt);
    }
}
