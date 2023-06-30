package Heap;

import java.util.PriorityQueue;

public class Programmers_MoreSpicy {
    public int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<scoville.length; i++){
            pq.offer(scoville[i]);
        }

        while(pq.peek() < K){
            int mix = pq.poll() + pq.poll()*2;
            pq.offer(mix);

            if(pq.size() == 1 && pq.peek() < K){
                answer = -1;
                break;
            }
            answer++;
        }
        return answer;
    }
}
