package Hash;

import java.util.HashSet;

public class Programmers_Phonekemon {
    public int solution(int[] nums) {
        int max = nums.length/2;

        HashSet<Integer> list = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            list.add(nums[i]);
        }

        if(list.size() > max) return max;
        else return list.size();

    }
}
