class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        char[] mychar = my_string.toCharArray();
        
        char X = mychar[num1];
        char Y = mychar[num2];
        
        mychar[num1] = Y;
        mychar[num2] = X;
        
        for(int i=0; i<mychar.length; i++) {
        	answer += mychar[i];
        }
        
        return answer;
    }
}