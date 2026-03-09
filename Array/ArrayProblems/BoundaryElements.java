import java.util.Scanner;

class BoundaryElements 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number of Rows : ");
		int m=sc.nextInt();
		
		System.out.print("\nEnter the number of columns : ");
		int n=sc.nextInt();
		
		int[][] matrix=new int[m][n];
		System.out.println("Enter the Elements of Matrix : ");
		for (int i=0;i<m;i++)
		{
			for (int j=0;j<n;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Boundary Elements of Matrix are : ");
		
		for (int i=0;i<m;i++)
		{
			for (int j=0;j<n;j++)
			{
				if(i==0 || i==m-1 || j==0 || j==n-1)
				{
					System.out.print(matrix[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}
