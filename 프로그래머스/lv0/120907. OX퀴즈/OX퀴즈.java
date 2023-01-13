class Solution {
    public static String[] solution(String[] quiz) {
	        String[] answer = new String[quiz.length];
	        
	        for(int i=0; i<quiz.length; i++) {
	        	String[] num = quiz[i].split(" ");
	        	
	        	int X = Integer.parseInt(num[0]);
	        	int Y = Integer.parseInt(num[2]);
	        	int Z = Integer.parseInt(num[4]);
	        	String mark = num[1];
	        	
	        	if(mark.equals("+")) {
	        		if(X + Y == Z) {
	        			answer[i] = "O";
	        		}else if(X + Y != Z){
	        			answer[i] = "X";
	        		}
	        	}else {
	        		if(X - Y == Z) {
	        			answer[i] = "O";
	        		}else {
	        			answer[i] = "X";
	        		}
	        	}
	        	System.out.println(answer[i]);
	        }
	        
	        return answer;
    }
}