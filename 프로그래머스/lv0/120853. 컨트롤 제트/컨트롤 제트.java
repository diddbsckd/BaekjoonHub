class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] S = s.split(" ");
        
        int num = 0;
        for(int i=0; i<S.length; i++) {
        	if(S[i].equals("Z")) {
        		answer -= num;
        	}else if(!S[i].equals("Z")) {
        		num = Integer.parseInt(S[i]);
        		answer += num;
        	}
        }
        
        return answer;
    }
}