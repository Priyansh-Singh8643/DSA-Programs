//Generics
//Here we have used the Generics which make the list TypeSafe and remove the problem of typecasting.

import java.util.ArrayList;

class Rev3 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(56);
		al.add(89);
		al.add(23);
		System.out.println(al);
	}
}
