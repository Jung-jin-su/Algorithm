package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AntWarrior {
    static int N;
    static int[] K;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        K = new int[N];
        int[] dp = new int[101];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            K[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = K[0];
        dp[1] = Math.max(K[0], K[1]);

        for(int i=2; i<N; i++){
            dp[i] = Math.max(dp[i-1], dp[i-2]+K[i]);
        }
        System.out.println(dp[N-1]);
    }
}
