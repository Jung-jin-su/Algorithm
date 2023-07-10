package BruteForce;

import java.util.HashSet;

public class Programmers_FindPrime {
    public int solution(String numbers) {
        int answer = 0;
        HashSet<Integer> numlist = new HashSet<>();
        makeNumber(numlist, numbers.toCharArray(), new boolean[numbers.length()], "");

        for(Integer num : numlist){
            if(sosu(num)) answer++;
        }
        return answer;
    }
    public boolean sosu(int x){
        if(x <= 1) return false;

        for(int i=2; i<x; i++){
            if(x%i == 0) return false;
        }
        return true;
    }
    public void makeNumber(HashSet<Integer> list, char[] number, boolean[] used, String s){
        for(int i=0; i<number.length; i++){
            if(!used[i]){
                s += String.valueOf(number[i]);
                used[i] = true;
                makeNumber(list, number, used, s);
                s = s.substring(0, s.length()-1);
                used[i] = false;
            } else{
                list.add(Integer.parseInt(s));
            }
        }
    }
}
