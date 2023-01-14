class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        while(hp>0){
        	if(hp>=5) {
        		answer = hp/5;
        		hp %= 5;
        		continue;
        	}else if(hp>=3 && hp<5) {
        		answer++;
        		hp %= 3;
        		continue;
        	}else if(hp<3 && hp>0){
        		answer += hp;
        		hp = 0;
        		continue;
        	}else {
        		break;
        	}
        }
        
        return answer;
    }
}