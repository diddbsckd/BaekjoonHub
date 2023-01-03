import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = 0;
		int B = 0;
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			System.out.println(A + B);
			
		}
	}

}