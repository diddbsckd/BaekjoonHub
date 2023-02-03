class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        for(int i=0; i<db.length; i++) {
        	if(id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])) {
        		System.out.println(1);
        		answer = "login";
        	}else if(id_pw[0].equals(db[i][0]) && !id_pw[1].equals(db[i][1]) && !answer.equals("login") ) {
        		System.out.println(2);
        		answer = "wrong pw";
        	}else if(!id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1]) && !answer.equals("login") && !answer.equals("wrong pw")) {
        		System.out.println(3);
        		answer = "fail";
        	}
        }
        
        return answer;
    }
}