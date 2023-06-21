package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Time {

    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        int cnt = 0;

        for(int i=0; i<=N; i++){
            for(int j=0; j<60; j++){
                for(int k=0; k<60; k++){
                    String h = String.valueOf(i);
                    String m = String.valueOf(j);
                    String s = String.valueOf(k);

                    if(h.contains("3") || m.contains("3") || s.contains("3")) cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
