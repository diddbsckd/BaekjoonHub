import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	static Integer dp[][];
	static int tree[][];
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		dp = new Integer[n][n];
		tree = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<i+1; j++) {
				tree[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {
			dp[n-1][i] = tree[n-1][i];
		}
		
		System.out.println(rec(n,0,0));
		sc.close();
	}
	
	public static int rec(int n, int depth, int index) {
		
		if(depth == n-1) {
			return dp[depth][index];
		}
		
		if(dp[depth][index] == null) {
			dp[depth][index] = Math.max(rec(n, depth+1, index), rec(n, depth+1, index+1)) + tree[depth][index];
		}
		
		return dp[depth][index];
	}
	

}
