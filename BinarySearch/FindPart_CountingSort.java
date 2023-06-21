package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindPart_CountingSort {

    static int N, M;
    static int[] list;
    static int[] findList;
    static int[] countingList;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        list = new int[N];
        countingList = new int[1000001];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        findList = new int[M];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            findList[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<N; i++){
            countingList[list[i]] += 1;
        }

        for(int i=0; i<findList.length; i++){
            if(countingList[findList[i]] != 0) System.out.print("yes"+" ");
            else System.out.print("no"+" ");
        }
    }
}
