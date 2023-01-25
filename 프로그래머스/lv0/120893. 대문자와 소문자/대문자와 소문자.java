class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        
        for(int i=0; i<my_string.length(); i++) {
        	if(arr[i] >= 65 && arr[i] <= 90) {
        		answer += String.valueOf(arr[i]).toLowerCase();
        	}else if(arr[i] >= 97 && arr[i] <= 122) {
        		answer += String.valueOf(arr[i]).toUpperCase();
        	}
        }
        
        return answer;
    }
}