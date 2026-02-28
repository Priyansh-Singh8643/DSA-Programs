import java.util.ArrayDeque;
import java.util.Deque;

class DequeExample 
{
	public static void main(String[] args) 
	{
		Deque<Integer> queue=new ArrayDeque<>();
		
		queue.addFirst(10);
		queue.addLast(20);
		queue.addLast(30);
		
		System.out.println(queue);
		System.out.println(queue.removeFirst());
		System.out.println(queue);
	}
}
