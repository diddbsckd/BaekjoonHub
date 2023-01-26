class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String[] num = {"3", "6", "9"};
        String[] arr = String.valueOf(order).split("");
        
        for(int i=0; i<num.length; i++) {
        	for(int j=0; j<arr.length; j++) {
        		if(num[i].equals(arr[j])) {
        			answer++;
        		}
        	}
        }
        
        return answer;
    }
}