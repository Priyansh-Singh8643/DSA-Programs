import java.util.Scanner;

class  TowerOfHanoi
{
	public static void solve(int n, char source, char aux, char dest)
	{
		if (n==1)
		{
			System.out.printf("Move disk from rod %c to %c%n",source,dest);
			return;
		}
		
		solve(n-1,source,dest,aux)
			
		solve(
	}
	public static void main(String[] args) 
	{
		
	}
}
