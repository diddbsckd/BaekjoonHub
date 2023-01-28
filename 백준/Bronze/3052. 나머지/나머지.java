import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[10];
		int sum = 1;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine())%42;
		}
		
		Arrays.sort(arr);
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] != arr[i-1]) {
				sum++;
			}
		}
		bw.write(sum+"");
		bw.flush();
		bw.close();
	}

}
