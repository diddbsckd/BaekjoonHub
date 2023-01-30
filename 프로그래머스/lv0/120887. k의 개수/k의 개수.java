class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String a = "";
        
        for(int x=i; x<=j; x++ ) {
        	a += String.valueOf(x);
        }
        
        String[] z = a.split("");
        String K = String.valueOf(k);
        
        for(int y=0; y<a.length(); y++) {
        	if(z[y].equals(K)) {
        		answer++;
        	}
        }
        
        return answer;
    }
}