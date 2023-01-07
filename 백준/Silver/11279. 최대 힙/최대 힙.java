import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		
		for(int i = 0; i<N; i++) {
			int num = sc.nextInt();
			if(num > 0) {
				p.add(num);
			}else {
				if(p.size() != 0) {
					sb.append(p.poll() + "\n");
				}else {
					sb.append(0 + "\n");
				}
			}
		}
		System.out.println(sb);
		
	}

}
