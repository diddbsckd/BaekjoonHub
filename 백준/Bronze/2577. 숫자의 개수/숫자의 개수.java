import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		int M = A * B * C;
		int[] R = new int[10];
		
		while(M > 0) {
			String S = String.valueOf(M%10);
			M /= 10;
			switch(S) {
				case "0" :
					R[0] += 1;
					break;
				case "1" :
					R[1] += 1;
					break;
				case "2" :
					R[2] += 1;
					break;
				case "3" :
					R[3] += 1;
					break;
				case "4" :
					R[4] += 1;
					break;
				case "5" :
					R[5] += 1;
					break;
				case "6" :
					R[6] += 1;
					break;
				case "7" :
					R[7] += 1;
					break;
				case "8" :
					R[8] += 1;
					break;
				case "9" :
					R[9] += 1;
					break;
			}
		}
		for(int i=0; i<R.length; i++) {
			System.out.println(R[i]);
		}
	}
	

}