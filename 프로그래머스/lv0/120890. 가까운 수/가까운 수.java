class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int X = 100;
        int Y = 0;
        
        for(int i=0; i<array.length; i++) {
        	Y = Math.abs(array[i] - n);
        	
        	if(Y < X) {
        		X = Y;
        		answer = array[i];
        	}else if(X == Y) {
        		System.out.println(i);
        		if(array[i]<answer) {
        			answer = array[i];
        		}
        	}
        }
        return answer;
    }
}