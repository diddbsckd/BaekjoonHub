import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main{
	
	public static Deque<Integer> deque;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		deque = new LinkedList<>();
		StringBuilder stb = new StringBuilder();
		for(int i = 0 ; i < N ; i++)
		{
			String temp = sc.next();
			switch(temp)
			{
				case "push_front" :
					push_front(sc.nextInt());
					break;
				case "push_back" :
					push_back(sc.nextInt());
					break;
				case "pop_front" :
					stb.append(pop_front() + "\n");
					break;
				case "pop_back" :
					stb.append(pop_back() + "\n");
					break;
				case "size" :
					stb.append(size() + "\n");
					break;
				case "empty" :
					stb.append(empty() + "\n");
					break;
				case "front" :
					stb.append(front() + "\n");
					break;
				case "back" :
					stb.append(back() + "\n");
					break;
			}
		}
		System.out.println(stb);
	}

	public static void push_front(int num)
	{
		deque.addFirst(num);
	}
	public static void push_back(int num)
	{
		deque.add(num);
	}
	public static int pop_front()
	{
		if(deque.size() != 0)
		{
			return deque.poll();
		}else return -1;
	}
	public static int pop_back()
	{
		if(deque.size() != 0)
		{
			return deque.removeLast();
		}else return -1;
	}
	public static int size()
	{
		return deque.size();
	}
	public static int empty()
	{
		if(deque.size() != 0) return 0;
		else return 1;
	}
	public static int front()
	{
		if(deque.size() != 0) return deque.getFirst();
		else return -1;
	}
	public static int back()
	{
		if(deque.size() != 0) return deque.getLast();
		else return -1;
	}
}
