import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[6];
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i]*arr[i];
		}
		arr[5] = sum % 10;
		System.out.println(arr[5]);
		
		sc.close();
		
		
	}

}
