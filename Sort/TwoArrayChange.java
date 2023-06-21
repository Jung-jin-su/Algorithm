package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class TwoArrayChange {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] array1 = new int[N];
        int[] array2 = new int[N];
        int result = 0;

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            array1[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            array2[i] = Integer.parseInt(st.nextToken());
        }

        Integer[] tmp2 = Arrays.stream(array2).boxed().toArray(Integer[]::new);
        Arrays.sort(array1);

        Arrays.sort(tmp2, Collections.reverseOrder());

        for(int i=0; i<K; i++){
            int temp = array1[i];
            array1[i] = tmp2[i];
            tmp2[i] = temp;
        }

       for(int i=0; i<array1.length; i++){
           result += array1[i];
       }
        System.out.println(result);
    }
}
