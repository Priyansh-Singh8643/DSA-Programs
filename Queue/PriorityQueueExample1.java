import java.util.PriorityQueue;

class PriorityQueueExample1 
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> queue=new PriorityQueue<>();
		
		queue.add(12);
		queue.add(11);
		queue.add(32);
		queue.add(24);
		queue.add(17);
		queue.add(7);
		
		System.out.println(queue);
		queue.remove();
		System.out.println(queue);
	}
}
