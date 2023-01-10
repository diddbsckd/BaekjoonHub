class Solution {
    public int solution(String A, String B) {
        int answer = 0;
	        
	        String B2 = B + B;
	        
	        int num = B2.indexOf(A);
	        
	        if(num != 0) {
	        	answer = num;
	        }else if(num == 0) {
	        	answer = 0;
	        }else if(num == -1) {
	        	answer = -1;
	        }

	        return answer;
    }
}