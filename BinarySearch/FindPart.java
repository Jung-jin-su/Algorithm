package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FindPart {
    static int N, M;
    static int[] list;
    static int[] find_list;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        list = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        find_list = new int[M];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            find_list[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(list);

        for(int i=0; i<M; i++){
            binarySearch(list, find_list[i], 0, list.length-1);
        }
        System.out.println(sb);
    }

    private static void binarySearch(int[] array, int target, int start, int end) {
        if(start > end) {
            sb.append("no");
            sb.append(" ");
            return;
        }
        int mid = (start + end) / 2;

        if(array[mid] == target) {
            sb.append("yes");
            sb.append(" ");
            return;
        }
        else if(array[mid] > target){
            binarySearch(array, target, start, mid-1);
        }

        else{
            binarySearch(array, target, mid+1, end);
        }

        return;
    }
}
