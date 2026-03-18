class TailCallRecursionExample
{
	static int factorial(int n, int result)
	{
		if (n==0 || n==1)
		{
			return result;
		}
		
		return factorial(n-1, n*result);
	}
	public static void main(String[] args) 
	{
		int n=5;
		int f=factorial(n,1);
		System.out.println("Factorial = "+f);
	}
}
