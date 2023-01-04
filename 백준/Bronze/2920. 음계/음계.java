import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		int[] as = {1,2,3,4,5,6,7,8};
		int[] des = {8,7,6,5,4,3,2,1};
		String x = "";
		
		for(int i = 0; i < 8; i++) {
			arr[i] = sc.nextInt();
		}
		
		if(Arrays.equals(arr, as)) {
			x = "ascending";
		}else if(Arrays.equals(arr, des)) {
			x = "descending";
		}else {
			x = "mixed";
		}
		
		System.out.println(x);
		
		sc.close();
	}

}
