class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        int[] arr = new int[1000];
        
        for(int i=0; i<array.length; i++) {
        	arr[array[i]] += 1;
        }
        
        for(int i=0; i<arr.length; i++) {
        	if(arr[i] > max) {
        		max = arr[i];
        		answer = i;
        	}else if(arr[i] != 0 && arr[i] == max) {
        		answer = -1;
        	}
        }
        return answer;
    }
}