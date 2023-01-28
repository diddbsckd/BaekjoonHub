import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String[] arrA = st.nextToken().split("");
		String[] arrB = st.nextToken().split("");
		String SA = "";
		String SB = "";
		for(int i=2; i>=0; i--) {
			SA += arrA[i];
			SB += arrB[i];
		}
		int A = Integer.parseInt(SA);
		int B = Integer.parseInt(SB);
		
		if(A > B) {
			bw.write(A+"");
		}else {
			bw.write(B+"");
		}
		
		bw.flush();
		bw.close();
	}

}
