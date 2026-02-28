import java.util.LinkedList;

class Doubly 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> newNode=new LinkedList<>();
		
		newNode.add(1);
		newNode.add(2);
		
		System.out.println(newNode);
		
		for (int i=0;i<newNode.size();i++)
		{
			System.out.print(newNode.get(i)+" ");
		}
		
		System.out.println();
	}
}
