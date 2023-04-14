class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        int a = n/10;
        
        if(k >= a) {
        	k -= a;
        }else if(k < a) {
        	k = 0;
        }
        
        answer = (n * 12000) + (k * 2000);
        return answer;
    }
}