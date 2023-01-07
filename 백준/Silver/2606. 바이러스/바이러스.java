import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int a = sc.nextInt();
		
		for(int i = 0; i < N + 1; i++) {
			graph.add(new ArrayList<>());
		}
		
		for(int i = 0; i<a; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			graph.get(num1).add(num2);
			graph.get(num2).add(num1);
		}
		System.out.println(dfs(N));
	}
	public static int dfs(int N)
	{
		int count = 0;
		boolean visited [] = new boolean[N+1];
		
		Deque<Integer> q = new ArrayDeque<>();
		q.add(1);
		visited[1] = true;
		
		while(q.size() != 0)
		{
			int num = q.pollFirst();
			for(int node : graph.get(num)) {
				if(visited[node] == false)
				{
					visited[node] = true;
					q.add(node);
					count++;
				}
			}
		}
		return count;	
	}

}
