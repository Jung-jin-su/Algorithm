package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MakingRiceCake {
    static int N, M;
    static int[] list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        list = new int[N];
        int result = 0;

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(list);
        int start = 0;
        int end = list[list.length-1];

        while (start <= end) {
            int total = 0;
            int mid = (start + end) / 2;

            for(int i=0; i<list.length; i++){
                if(list[i] > mid) total += list[i] - mid;
            }

            if(total < M) end = mid-1;

            else {
                result = mid;
                start = mid + 1;
            }
        }
        System.out.println(result);
    }

}
