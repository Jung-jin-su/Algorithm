package Hash;

import java.util.HashMap;

public class Programmers_WhoDidNotFinish {
    static HashMap<String, Integer> list = new HashMap<>();

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        for(int i=0; i<participant.length; i++){
            if(list.containsKey(participant[i])){
                int num = list.get(participant[i]) + 1;
                list.put(participant[i], num);
            }
            else{
                list.put(participant[i], 1);
            }
        }

        for(int i=0; i<completion.length; i++){
            if(list.containsKey(completion[i])){
                list.put(completion[i], list.get(completion[i])-1);
            }
        }

        for(String key : list.keySet()){
            if(list.get(key) == 0){
                continue;
            }
            else{
                answer = key;
            }
        }
        return answer;
    }

}
