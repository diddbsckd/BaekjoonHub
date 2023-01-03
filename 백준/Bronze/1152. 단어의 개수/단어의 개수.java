import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String temp = sc.nextLine();
		StringTokenizer st = new StringTokenizer(temp , " ");
		System.out.println(st.countTokens());
		
	}
}