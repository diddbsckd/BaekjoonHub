class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n/2)+(n%2)];
        int x = 0;
        for(int i=1; i<=n; i++) {
        	if(i%2 != 0) {
        		answer[x] = i;
        		x++;
        	}
        }
        return answer;
    }
}