import java.util.Scanner;

class SnakePatternMatrix 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the No. of Rows : ");
		int m=sc.nextInt();
		
		System.out.print("Enter the No. of Columns : ");
		int n=sc.nextInt();
		
		int[][] matrix=new int[m][n];
		
		System.out.println("Enter the Matrix Elements : ");
		for (int i=0;i<m;i++)
		{
			for (int j=0;j<n;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Matrix in Snake Pattern : ");
		
		for (int i=0;i<m;i++)
		{
			if (i%2==0)
			{
				//Left to Right
				for (int j=0;j<n;j++)
				{
					System.out.print(matrix[i][j]+" ");
				}
			}else{
				//Right to Left
				for (int j=n-1;j>=0;j--)
				{
					System.out.print(matrix[i][j]+"	");
				}
			}
			System.out.println();
		}
		
		sc.close();
	}
}
