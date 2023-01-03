import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int Ba = B % 10;
		int Bb = (B % 100) / 10;
		int Bc = B / 100;
		
		System.out.println(A * Ba);
		System.out.println(A * Bb);
		System.out.println(A * Bc);
		System.out.println(A * B);
		
		sc.close();
	}
}
