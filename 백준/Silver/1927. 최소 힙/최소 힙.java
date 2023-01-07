import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		PriorityQueue<Integer> p = new PriorityQueue<Integer>();
		Scanner sc = new Scanner(System.in);
		StringBuilder stb = new StringBuilder();
		
		int N = sc.nextInt();
		
		
		for(int i = 0; i<N; i++) {
			int num = sc.nextInt();
			if(num != 0) {
				p.add(num);
			}else {
				if(p.size() != 0) {
					stb.append(p.poll() + "\n");
				}else {
					stb.append(0 + "\n");
				}
			}
		}
		System.out.println(stb);
	}

}
