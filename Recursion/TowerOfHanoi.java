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
		
		solve(n-1,source,dest,aux);
		
		System.out.printf("Move disk %d from rod %c to rod %c%n",n,source,dest);
		
		solve(n-1, aux, source, dest);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of disks : ");
		int n=sc.nextInt();
		solve(n,'S','A','D');
		
		sc.close();
	}
}
