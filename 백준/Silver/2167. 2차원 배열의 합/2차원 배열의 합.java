import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[][] arr = new int[N][M];
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int K = sc.nextInt();
		for(int a=0; a<K; a++) {
			int result = 0;
			int i = sc.nextInt()-1;
			int j = sc.nextInt()-1;
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			for(int b=i; b<=x; b++) {
				for(int c=j; c<=y; c++) {
					result += arr[b][c];
				}
			}
			
			System.out.println(result);
		}
	
	}
}
