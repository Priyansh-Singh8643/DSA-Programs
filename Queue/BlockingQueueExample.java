import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class BlockingQueueExample 
{
	public static void main(String[] args) 
	{
		BlockingQueue<Integer> queue=new ArrayBlockingQueue<>(5);
		
		queue.put(10);
		queue.put(20);
		queue.put(30);
		queue.put(40);
		queue.put(50);
		//queue.put(60);
		
		
		System.out.println(queue);
		System.out.println(queue.take());
		System.out.println(queue);
		queue.put(70);
		System.out.println(queue);
	}
}
