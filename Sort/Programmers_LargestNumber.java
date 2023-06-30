package Sort;

import java.util.Arrays;
import java.util.Comparator;

public class Programmers_LargestNumber {
    public String solution(int[] numbers) {
        String answer = "";

        String[] temp = new String[numbers.length];

        for(int i=0; i<numbers.length; i++){
            temp[i] = String.valueOf(numbers[i]);
        }

        // 1번 방법
        Arrays.sort(temp, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                return (o2+o1).compareTo(o1+o2);    //핵심
            }
        });

        // 2번 방법
        // Arrays.sort(temp, (o1, o2) -> (o2+o1).compareTo(o1+o2));

        if(temp[0].equals("0")){
            return "0";
        }

        for(int i=0; i<temp.length; i++){
            answer += temp[i];
        }
        return answer;
    }
}
