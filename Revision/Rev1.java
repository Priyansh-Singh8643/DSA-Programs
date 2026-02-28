//We used to do this before jdk-11 now we can directly give the value in the add().

import java.util.ArrayList;

class Rev1 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		
		al.add(new Integer(5));
		al.add(new Float(11.67f));
		al.add(new String("Priyansh"));
		System.out.println(al);
	}
}
