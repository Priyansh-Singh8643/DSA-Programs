class TailRecursiveSum 
{
	public static int sum(int n)
	{
		return sumHelper(n, 0);
	}
	
	private static int sumHelper(int n, int acc)
	{
		if (n==0)
		{
			return acc;
		}
		else{
			return sumHelper(n-1, acc + n);
		}
	}
	
	public static void main(String[] args) 
	{
		int num=5;
		int result=sum(num);
		System.out.println("Sum of numbers from 1 to "+num+" is : "+result);
	}
}
