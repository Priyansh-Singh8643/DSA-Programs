//predefined queue use linkedlist internally

import java.util.LinkedList;
import java.util.Queue;

class QueueExample 
{
	public static void main(String[] args) 
	{
		//Created queue of Integers
		Queue<Integer> queue=new LinkedList<>();
		
		//Enqueue(add elements)
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		
		//Display of Queue
		System.out.println("Queue : "+queue);
		
		//Peek(see the front element without removing
		System.out.println("Front of queue : "+queue.peek());
		
		//Dequeue(remove elements)
		System.out.println("Removed : "+queue.poll());
		System.out.println("Removed : "+queue.poll());
		
		//Display the queue after removal
		System.out.println("Queue after removals : "+queue);
		
		//Check if the queue is empty
		System.out.println("Is Queue empty?" + queue.isEmpty());
	}
}
