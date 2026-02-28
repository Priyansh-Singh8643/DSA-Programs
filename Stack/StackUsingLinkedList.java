class Node
{
	int data;
	Node next;
	
	Node(int value)
	{
		this.data=value;
		next=null;
	}
}

class StackUsingLinkedList 
{
	private Node top;
	
	public StackUsingLinkedList()
	{
		top=null;
	}
	
	public void push(int value)
	{
		Node newNode=new Node(value);
		newNode.next=top;
		top=newNode;
		System.out.println(value+" pushed to stack");
	}
	
	public int pop()
	{
		if (isEmpty())
		{
			System.out.println("Stack is Empty. Cannot pop");
			return -1;
		}
		
		int poppedValue=top.data;
		top=top.next;
		return poppedValue;
	}
	
	public int peek()
	{
		if (isEmpty())
		{
			System.out.println("Stack is Empty");
			return -1;
		}
		return top.data;
	}
	
	public boolean isEmpty()
	{
		return top==null;
	}
	
	public void display()
	{
		if (isEmpty())
		{
			System.out.println("Stack is Empty");
			return;
		}
		
		Node current=top;
		System.out.print("Stack elements : ");
		
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		StackUsingLinkedList stack=new StackUsingLinkedList();
		
		stack.push(1);
		stack.display();
		
		stack.push(2);
		stack.display();
		
		System.out.println("Top Value : "+stack.peek());
		stack.display();
		
		System.out.println("Value Popped : "+stack.pop());
		stack.display();
		
		stack.push(11);
		stack.display();
		
		System.out.println("Top Value : "+stack.peek());
		stack.display();
		
		System.out.println("Top Value : "+stack.peek());
		stack.display();
		
		
		
	}
}
