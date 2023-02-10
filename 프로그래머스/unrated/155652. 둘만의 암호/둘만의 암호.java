import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] a = skip.split("");
        String[] b = s.split("");
        
        List<String> list = new ArrayList<>(Arrays.asList(alphabet));
        System.out.println(list);
        
        for(int i=0; i<skip.length(); i++) {
        	list.remove(a[i]);
        }
        
        int x = 0;
        for(int i=0; i<s.length(); i++) {
        	x = list.indexOf(b[i]) + index;
        	if(x >= list.size()) {
        		x -= list.size();
        		if(x >= list.size()) {
        			x -= list.size();
        		}
        	}
        	
        	for(int j=0; j<1; j++) {
        		answer += list.get(x);
        	}
        	
        }
        
        return answer;
    }
}