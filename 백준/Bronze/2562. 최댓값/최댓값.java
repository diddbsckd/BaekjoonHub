import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] a = new int[10];
		
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0 ; i < 9 ; i++)
		{
			int temp = sc.nextInt();
			a[i] = temp;
			map.put(temp, i + 1);
		}
		
		Arrays.sort(a);
		System.out.println(a[9]);
		System.out.println(map.get(a[9]));
	}
}