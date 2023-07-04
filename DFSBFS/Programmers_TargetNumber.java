package DFSBFS;

public class Programmers_TargetNumber {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(0, 0, numbers, target);

        return answer;
    }
    public void dfs(int idx, int tmp, int[] numbers, int target){
        if(numbers.length == idx){
            if(tmp == target){
                answer += 1;
            }
            return;
        }

        else{
            dfs(idx+1, tmp + numbers[idx], numbers, target);
            dfs(idx+1, tmp - numbers[idx], numbers, target);
        }

    }
}
