import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(int[][] score) {
		int length = score.length;
        int[] answer = new int[length];
        int[] avg = new int[length];
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<length; i++) {
        	avg[i] = score[i][0] + score[i][1];
        }
        
        int[] avg2 = avg.clone();
        Arrays.sort(avg2);
        
        int a = length;
        for(int i=0; i<length; i++) {
        	map.put(avg2[i], a);
        	a--;
        }
        
        for(int i=0; i<length; i++) {
        	answer[i] = map.get(avg[i]);
        }
        
        return answer;
    }
}