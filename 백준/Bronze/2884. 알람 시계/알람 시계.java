import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] S = br.readLine().split(" ");
		int H = Integer.parseInt(S[0]);
		int M = Integer.parseInt(S[1]);
		
		if(M < 45) {
			if(H == 0) {
				H = 23;
				M = 60 - (45 - M);
			}else {
				H -= 1;
				M = 60 - (45 - M);
			}
		}else {
			M -= 45;
		}
		
		System.out.println(H + " " + M);
	}

}
