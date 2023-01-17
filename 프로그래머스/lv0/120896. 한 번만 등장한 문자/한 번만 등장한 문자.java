import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        HashSet<String> hashset = new HashSet<>();
        
        String[] array = s.split("");
        for(int i=0; i<s.length(); i++) {
        	hashset.add(array[i]);
        }
        
        List<String> list = new ArrayList<>(hashset);
        for(int i=0; i<list.size(); i++) {
        	int count = 0;
        	for(int j=0; j<array.length; j++) {
        		if(array[j].equals(list.get(i))) {
        			count++;
        		}
        	}
        	if(count == 1) {
                Collections.sort(list);
        		answer += list.get(i);
        	}
        }
        
        return answer;
    }
}