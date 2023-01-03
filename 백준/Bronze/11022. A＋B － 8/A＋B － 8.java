import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int A;
		int B;
		
		for(int i = 0; i < T; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			
			System.out.println("Case #" + (i + 1) + ": "+ A + " + " +
			B + " = " + (A + B));
		}
		
		
	}
}
