//Non-Generics

import java.util.ArrayList;

class Rev4 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(15);
		al.add(85);
		al.add(69);
		
		//referrenceVariable.get(indexing)
		
		/* int a=al.get(1);
			Object cannot be converted to int
                int a=al.get(1); 
		*/
		
		int a=(int)al.get(1);
		System.out.println(a);
	}
}
