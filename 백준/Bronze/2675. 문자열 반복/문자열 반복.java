import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0 ; i < T ; i++)
		{
			int j = sc.nextInt();
			String str = sc.next();
			StringBuilder stb = new StringBuilder();
			for(int k = 0 ; k < str.length() ; k++)
			{
				for(int l = 0 ; l < j ; l++)
				{
					stb.append(str.substring(k,k+1));
				}
			}
			System.out.println(stb);
		}
	}
}