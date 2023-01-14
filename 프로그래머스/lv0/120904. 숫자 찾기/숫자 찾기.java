class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String numS = num+"";
        String kS = k+"";
        
        answer = numS.indexOf(kS);
        
        if(answer > -1) {
        	answer += 1;
        }
        
        return answer;
    }
}