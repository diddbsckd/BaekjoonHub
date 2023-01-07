import java.util.Scanner;

public class Main {
	
	static Integer[] dp = new Integer[41];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		dp[0] = 0;
		dp[1] = 1;
		
		
		// 0 : 1 1 2 3 5 8
		// 1 : 0 1 1 2 3 5 8
		
		for(int i = 0; i<T; i++) {
			int n = sc.nextInt();
			
			if(n == 0)
			{
				System.out.println(1 + " " + 0);
			}else
			{
				fibonacci(n);
				System.out.println(dp[n-1] + " " + dp[n]);
				
			}
			}
		sc.close();
	}
	
	public static Integer fibonacci(int n) {
		
		if(dp[n] == null) {
			dp[n] = fibonacci(n-1) + fibonacci(n-2);
		}
		return dp[n];
	}
	
	
}
