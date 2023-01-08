import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int length = sc.nextInt();
		
		for(int i=0; i<length; i++) {
			String OX = sc.next();
			int sum = 0;
			int score = 1;
			
			for(int j = 0; j < OX.length(); j++) {
				if(OX.charAt(j) == 'O') {
					sum += score;
					score++;
				}else {
					score = 1;
				}
			}
			System.out.println(sum);
		}
		
		sc.close();
   }
}