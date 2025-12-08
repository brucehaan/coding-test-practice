import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>(k);
        
        for(int i = 0; i < score.length; i++) {
            if(list.size() >= k) {
                Collections.sort(list);
                if(list.get(0) < score[i])
                    list.remove(0);
            }
            list.add(score[i]);
            if(list.size() > k) {
                Collections.sort(list);
                list.remove(0);
            }
            Collections.sort(list);
            answer[i] = list.get(0);
        }
        
        return answer;
    }
}