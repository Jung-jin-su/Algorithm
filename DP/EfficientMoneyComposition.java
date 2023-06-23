package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class EfficientMoneyComposition {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] coin = new int[N];
        int[] dp = new int[M+1];
        Arrays.fill(dp, 10001);

        for(int i=0; i<N; i++){
            int val = Integer.parseInt(br.readLine());
            coin[i] = val;
        }

        dp[0] = 0;
        for(int i=0; i<N; i++){
            for(int j=coin[i]; j<=M; j++){
                if(j-coin[i] != 10001){
                    dp[j] = Math.min(dp[j], dp[j-coin[i]]+1);
                }
            }
        }

        if(dp[M] == 10001) System.out.println(-1);
        else System.out.println(dp[M]);
    }
}
