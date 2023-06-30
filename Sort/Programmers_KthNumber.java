package Sort;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Programmers_KthNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            ArrayList<Integer> temp = new ArrayList<>();

            for(int j=commands[i][0]-1; j<commands[i][1]; j++){
                temp.add(array[j]);
            }
            Collections.sort(temp);

            answer[i] = temp.get(commands[i][2]-1);
            System.out.println(Arrays.toString(array));
        }
        return answer;
    }
}
