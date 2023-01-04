import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		
		double[] arr = new double[length];
		double M = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(M <= arr[i]) {
				M = arr[i];
			}
		}
		
		double[] arr2 = new double[length];
		double sum = 0;
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = arr[i]/M*100;
			sum += arr2[i];
		}
		
		double avg = sum / length;
		
		System.out.println(avg);
		sc.close();
		
		
	}

}
