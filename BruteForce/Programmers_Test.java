package BruteForce;

import java.util.ArrayList;

public class Programmers_Test {
    public ArrayList<Integer> solution(int[] answers) {
        ArrayList<Integer> result = new ArrayList<>();
        int[] answer = new int[3];
        int[] cnt_list = new int[3];
        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] s3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;

        for(int i=0; i<answers.length; i++){
            if(s1[i%s1.length] == answers[i]) cnt1++;
            if(s2[i%s2.length] == answers[i]) cnt2++;
            if(s3[i%s3.length] == answers[i]) cnt3++;
        }

        cnt_list[0] = cnt1;
        cnt_list[1] = cnt2;
        cnt_list[2] = cnt3;

        int max = Integer.MIN_VALUE;
        for(int i=0; i<cnt_list.length; i++){
            if(max < cnt_list[i]) max = cnt_list[i];
        }

        for(int i=0; i<cnt_list.length; i++){
            if(max == cnt_list[i]) answer[i] = i+1;
        }

        for(int i=0; i<answer.length; i++){
            if(answer[i] != 0) result.add(answer[i]);
        }
        return result;
    }
}
