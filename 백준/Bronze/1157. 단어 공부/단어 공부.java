import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[26];
		String s = br.readLine();
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				arr[s.charAt(i) - 97]++;
			}else {
				arr[s.charAt(i) - 65]++;
			}
		}
		
		int max = 0;
		char a = '?';
		for(int i = 0; i < 26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				a = (char)(i + 65);
			}else if(arr[i] == max) {
				a = '?';
			}
		}
		
		bw.write(a);
		bw.close();
		
		
//		char[] c = br.readLine().toUpperCase().toCharArray(); // 문자 입력받고 대문자로 변환해서 배열에 담기
//		int max = 0; // 반복되는 숫자를 담기위한 변수
//		char a = '0'; // 최대 반복 char를 담기위한 변수
//		
//		for(int i = 0; i < c.length; i++) {
//			int count = 0; // 반복횟수 담아줄 변수
//			
//			char c2 = c[i]; // 비교 할 char 하나 담는 변수
//			
//			for(int j = 0; j<c.length; j++) {
//				
//				if(c[j] == c2 ) {
//					count++;
//				}
//				
//				if( c[j] == c2 && max < count) {
//					max = count;
//					a = c[j];
//				}else if(a != c2 && max == count){
//					a = '?';
//				}
//			}	
//		}
//		bw.write(a);
//		bw.flush();
//		bw.close();
	}

}
