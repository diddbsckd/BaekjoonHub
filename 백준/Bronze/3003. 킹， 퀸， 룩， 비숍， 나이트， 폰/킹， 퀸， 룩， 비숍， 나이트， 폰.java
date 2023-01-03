import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[6];
		int[] b = {1, 1, 2, 2, 2, 8};
		
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0; i<a.length; i++) {
			System.out.print(b[i] - a[i] + " ");
		}
		
		
		
 	}

}