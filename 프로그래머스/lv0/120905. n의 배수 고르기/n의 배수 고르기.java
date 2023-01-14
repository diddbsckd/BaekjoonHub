import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        Deque<Integer> aaa = new ArrayDeque<>();
       
        for(int i=0; i<numlist.length; i++) {
        	if(numlist[i]%n == 0) {
        		aaa.add(numlist[i]);
        	}
        }
        
        int num = aaa.size();
        int[] answer = new int[aaa.size()];
        
        for(int i=0; i<num; i++) {
        	answer[i] = aaa.pollFirst();
        }
        
        return answer;
    }
}