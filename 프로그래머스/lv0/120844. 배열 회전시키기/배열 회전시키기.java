import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int a = 0;
        
        Deque<Integer> deque = new LinkedList<>();
        
        for(int i=0; i<numbers.length; i++) {
        	deque.addLast(numbers[i]);
        }
        
        if(direction.equals("right")) {
        	a = deque.pollLast();
        	deque.addFirst(a);
        }else if(direction.equals("left")) {
        	a = deque.pollFirst();
        	deque.addLast(a);
        }
        
        for(int i=0; i<numbers.length; i++) {
        	answer[i] = deque.pollFirst();
        }
        
        return answer;
    }
}