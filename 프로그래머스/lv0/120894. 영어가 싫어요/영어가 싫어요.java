class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i=0; i<num.length; i++) {
        	int x = numbers.indexOf(num[i]);
        	
        	if(x == -1) {
        		continue;
        	}else {
        		switch(num[i]) {
        			case "zero" :
        				numbers = numbers.replaceAll("zero", "0");
        			case "one" 	:
        				numbers = numbers.replaceAll("one", "1");
        			case "two"	:
        				numbers = numbers.replaceAll("two", "2");
        			case "three":
        				numbers = numbers.replaceAll("three", "3");
        			case "four"	:
        				numbers = numbers.replaceAll("four", "4");
        			case "five"	:
        				numbers = numbers.replaceAll("five", "5");
        			case "six"	:
        				numbers = numbers.replaceAll("six", "6");
        			case "seven":
        				numbers = numbers.replaceAll("seven", "7");
        			case "eight":
        				numbers = numbers.replaceAll("eight", "8");
        			case "nine"	:
        				numbers = numbers.replaceAll("nine", "9");
        		}
        	}
        }
        return Long.parseLong(numbers);
    }
}