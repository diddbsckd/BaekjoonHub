import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i>=0; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			int sum = A + B;
			
			if(A == 0 && B == 0 ) {
				break;
			}else {
				System.out.println(sum);
			}
		}
	}
}