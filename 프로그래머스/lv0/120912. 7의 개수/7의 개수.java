class Solution {
    public int solution(int[] array) {
        int answer = 0;
	        String x = "";
	        for(int i=0; i<array.length; i++) {
	        	String y = Integer.toString(array[i]);
	        	x += y;
	        }
	        String[] arrays = x.split("");
	        
	        for(int i=0; i<arrays.length; i++) {
	        	if(arrays[i].equals("7")) {
	        		answer++;
	        	}
	        }
	        System.out.println(answer);
	       
	        return answer;
    }
}