class Solution {
    public int solution(int n) {
        int answer = 0;
        int x = n%7;
        
        if(x == 0) {
        	answer = n/7;
        }else {
        	answer = (n/7)+1;
        }
        
        return answer;
    }
}