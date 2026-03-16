class TailRecursiveFactorial 
{
	public static int factorial(int n)
	{
		return factorialHelper(n,1);
	}
	
	private static int factorialHelper(int n, int acc)
	{
		if(n==0)
		{
			return acc;
		}
		else{
			return factorialHelper(n-1,acc*n);
		}
	}
	
	public static void main(String[] args) 
	{
	System.out.println("Factorial of 5 is : "+factorial(5));	
	}
}
