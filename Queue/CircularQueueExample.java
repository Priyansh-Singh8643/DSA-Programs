class CircularQueue
{
	int[] queue;
	int front,rear,size;
	
	CircularQueue(int size)
	{
		this.size=size;
		queue=new int[size];
		front=rear=-1;
	}
	
	void enqueue(int data)
	{
		if((rear+1)%size==front)
		{
			System.out.println("Queue is full");
			return;
		}
		
		if(front==-1)
		{
			front=0;
		}
		rear=(rear+1)%size;
		queue[rear]=data;
		System.out.println("Inserted : "+data);
	}
	
	
	void dequeue()
	{
		if(front==-1)
		{
			System.out.println("Queue is Empty");
			return;
		}
		System.out.println("Deleted :"+queue[front]);
		
		if(front==rear) front=rear=-1;
		else front=(front+1)%size;
	}
	
	void display()
	{
		if(front==-1)
		{
			System.out.println("Queue is Empty");
			return;
		}
		System.out.println("Queue elements : ");
		
		int i=front;
		while(true)
		{
			System.out.println(queue[i]);
			if (i==rear)
			break;
			
			i=(i+1)%size;
		}
				
	}			
}


class CircularQueueExample 
{
	public static void main(String[] args) 
	{
		CircularQueue cq=new CircularQueue(5);

		cq.enqueue(12);
		cq.enqueue(11);
		cq.enqueue(32);
		cq.enqueue(24);
		cq.enqueue(17);
		cq.enqueue(77);

		cq.display();
		cq.dequeue();
		cq.display();
		cq.enqueue(97);
		cq.display();
	}
}
