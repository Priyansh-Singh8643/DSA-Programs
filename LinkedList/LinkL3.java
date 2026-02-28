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
		
}

class Link3 
{
    public static void main(String[] args) 
    {
        LinkedList<Integer> ll=new LinkedList<>();
		
		ll.insertBeginning(11);
    }
}
