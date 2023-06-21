package Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class StudentGrade {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> map = new HashMap<>();

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int grade = Integer.parseInt(st.nextToken());

            map.put(grade, name);
        }

        ArrayList<Integer> key = new ArrayList<>(map.keySet());
        Collections.sort(key);

        for(Integer k : key){
//            System.out.print("key : " + k + ", ");
//            System.out.println("val : " + map.get(k));
            System.out.print(map.get(k)+" ");
        }
    }
}
