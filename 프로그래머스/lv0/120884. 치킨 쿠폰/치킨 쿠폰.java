class Solution {
   public int solution(int chicken) {
        int answer = 0;
        int rem = 0;
        
        while(chicken >= 10) {
        	rem = chicken % 10;
        	chicken /= 10;
        	answer += chicken;
        	chicken += rem; 
        }
        
        return answer;
    }
}