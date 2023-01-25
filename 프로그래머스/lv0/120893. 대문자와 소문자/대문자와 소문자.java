class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++) {
        	char X = my_string.charAt(i);
        	
        	if(X >= 'A' && X <= 'Z') {
        		answer += Character.toLowerCase(X);
        	}else if(X >= 'a' && X <= 'z') {
        		answer += Character.toUpperCase(X);
        	}
        }
        
        return answer;
    }
}