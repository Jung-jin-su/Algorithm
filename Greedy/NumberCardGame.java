package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NumberCardGame {

    static int[] list;
    static int[] min_num;
    static int N, M, result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        list = new int[M];
        min_num = new int[N];


        for(int i=0; i<N; i++){
            result = Integer.MAX_VALUE;
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                list[j] = Integer.parseInt(st.nextToken());
            }

            for(int j=0; j<M; j++){
                if(result > list[j]){
                    result = list[j];
                }
            }
            min_num[i] = result;
        }
        Arrays.sort(min_num);
        System.out.println(min_num[min_num.length-1]);
    }
}
