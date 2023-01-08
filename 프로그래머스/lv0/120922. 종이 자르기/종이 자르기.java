class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        
        if(M>0 && N>0) {
            answer += M-1;
            for(int i=M; i>0; i--) {
                answer += N-1;
            }
        }
        
        return answer;
    }
}