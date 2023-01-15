class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] array = my_string.split(" ");
        
        answer = Integer.parseInt(array[0]);
        
        for(int i=1; i<array.length-1; i++) {
        	if(i%2 == 1) {
        		if(array[i].equals("+")) {
        			answer += Integer.parseInt(array[i+1]);
        		}else if(array[i].equals("-")) {
        			answer -= Integer.parseInt(array[i+1]);
        		}
        	}
        }
        
        return answer;
    }
}