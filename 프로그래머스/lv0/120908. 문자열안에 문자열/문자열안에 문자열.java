class Solution {
    public int solution(String str1, String str2) {
        int answer = str1.indexOf(str2);
	        
	        if(answer == -1) {
	        	answer = 2;
	        }else {
	        	answer = 1;
	        }
	        System.out.println(answer);
	        return answer;
    }
}