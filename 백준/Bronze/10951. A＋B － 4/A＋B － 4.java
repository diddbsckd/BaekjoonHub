import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = 0;
		int B =0;
		
		while(sc.hasNextInt()) {
			
			A = sc.nextInt();
			B = sc.nextInt();
			
			if(A>0 && A<10 && B>0 && B<10) {
				System.out.println(A+B);
			}else {
				break;
			}
			
		}
		sc.close();
	}

}
