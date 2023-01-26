import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		long x = Integer.parseInt(st.nextToken());
		long[] arr = new long[n];
		long sum = 0;
		long min = 0;
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st2.nextToken());
		}
		
		for(int i=0; i<x; i++) {
			Arrays.sort(arr);
			sum = arr[0] + arr[1];
			arr[0] = sum;
			arr[1] = sum;
		}
		
		for(int i=0; i<arr.length; i++) {
			min += arr[i];
		}
		
		System.out.println(min);
	}

}
