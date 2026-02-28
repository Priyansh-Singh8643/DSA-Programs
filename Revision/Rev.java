
//Without generic ArrayList is not typeSafe and there will be typecasting problem.
//Values are stored with the indexing.

import java.util.ArrayList;

class Rev 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		
		al.add(1);
		al.add(11.67f);
		al.add("Priyansh");
		
		System.out.println(al);
	}
}
