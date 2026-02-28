class Node
{
    Node next;
    int data;
    
    Node(int value)
    {
        next = null;
        data = value;
	}
        
}

class LinkedList
{
	Node head;
	
	LinkedList()
	{
		head=null;
	}
	
	void insertBeginning(int value)
	{
		Node newNode=new Node(value);
		newNode.next=head;
		head=newNode;
	}
	
	void insertEnd(int value)
	{
		Node newNode=new Node(value);
		
		if (head==null)
		{
			newNode.next=null;
			return;
		}
		
		Node temp;
		temp=head;
		
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newNode;
	}
	
	void insertPosition(int value,int position)
	{
		if(position==1)
		{
			insertBeginning(value);
		}
		
		Node newNode=new Node(value);
		Node temp=head;
		
		for (int i=1;i<position-1&&temp.next!=null;i++ )
		{
			temp=temp.next;
		}
		
		if (temp==null)
		{
			System.out.println("Position Out of Range");
		}
		newNode.next=temp.next;
		temp.next=newNode;
	}
	
	void display()
	{
		Node temp;
		temp=head;
		
		while(temp!=null)
		{
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println("Null");
	}
	
	void deleteBeginning()
	{
		head=head.next;
	}
	
	void deleteEnd()
	{
		Node temp;
		temp=head;
		
		while(temp.next.next!=null)
		{
			temp=temp.next;
			
		}
		temp.next=null;
	}
	
	void deletePosition(int position)
	{
		Node temp;
		temp=head;
		
		for (int i=1;i<position-2&&temp!=null ;i++ )
		{
			temp=temp.next;
		}
		temp.next=temp.next.next;
	}
	
		
}

class Link3 
{
    public static void main(String[] args) 
    {
        LinkedList ll=new LinkedList();
		
		ll.insertBeginning(11);
		ll.insertEnd(45);
		ll.insertPosition(99,2);
		ll.display();
		ll.deleteBeginning();
		ll.display();
		ll.deleteEnd();
		ll.display();
		ll.insertEnd(56);
		ll.display();
		ll.deletePosition(1);
		ll.display();
		
    }
}
