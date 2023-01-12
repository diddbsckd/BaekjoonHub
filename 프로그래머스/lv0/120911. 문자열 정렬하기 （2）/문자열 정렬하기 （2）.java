import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
	        
	        String mystring = my_string.toLowerCase();
	        
	        char[] array = mystring.toCharArray();
	        Arrays.sort(array);

	        for(int i=0; i<array.length; i++) {
	        	answer += array[i];
	        }
	        
	        return answer;
    }
}