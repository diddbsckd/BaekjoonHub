class Solution {
    public int[] solution(int[] array) {
        int[] answer = {0, 0};
        
        answer[0] = array[0];
        answer[1] = 0;
        for(int i=1; i<array.length; i++) {
        	if(array[i] > array[i-1]) {
        		answer[0] = array[i];
        		answer[1] = i;
        	}
        }
        
        return answer;
    }
}