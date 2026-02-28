class CustomQueue 
{
	private int maxSize;
	private int front;
	private int rear;
	private int[] queueArray;
	
	//Constructor to initialize queue
	public CustomQueue(int size)
	{
		maxSize=size;
		queueArray = new int[maxSize];
		front=0;
		rear=-1;
	}
	
	//Method to insert element(Enqueue)
	public void enqueue(int value)
	{
		if(isFull())
		{
			System.out.println("Queue is Full. Cannot insert "+value);
			return;
		}
		queueArray[++rear]=value;
		System.out.println("Inserted "+value);
	}
	
	//Method to remove the element(Dequeue)
	public void dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty.");
			return;
		}
		int removed = queueArray[front++];
		System.out.println("Removed "+removed);
	}
	
	//Method to view front value(Peek)
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty.");
			return -1;
		}
		return queueArray[front];
	}
	
	public boolean isEmpty()
	{
		return front>rear;
	}
	
	public boolean isFull()
	{
		return rear==maxSize-1;
	}
	
	public void display()
	{
		if (isEmpty())
		{
			System.out.println("Queue is Empty.");
			return;
		}
		System.out.print("Queue :");
		for (int i=front;i<=rear;i++)
		{
			System.out.print(queueArray[i]+" ");
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args) 
	{
		CustomQueue q=new CustomQueue(5);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		
		q.display();
		
		q.dequeue();
		q.dequeue();
		
		q.display();
	}
}
