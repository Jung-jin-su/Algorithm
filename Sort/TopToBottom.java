package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TopToBottom {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] list = new int[N];

        for(int i=0; i<N; i++){
            String s = br.readLine();
            list[i] = Integer.parseInt(s);
        }

//        Integer[] tmp = Arrays.stream(list).boxed().toArray(Integer[]::new);
        Integer[] tmp = new Integer[N];
        for(int i=0; i<N; i++){
            tmp[i] = list[i];
        }
        Arrays.sort(tmp, Comparator.reverseOrder());

        for(int i=0; i<tmp.length; i++){
            System.out.print(tmp[i]+" ");
        }
    }
}
