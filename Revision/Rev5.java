import java.util.ArrayList;

class Rev5 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(56);
		al.add(89);
		al.add(12);
		
		//In this we don't have the problem of typecasting when assiging value because of Generics
		int a=al.get(1);
		System.out.println(a);
	}
}
