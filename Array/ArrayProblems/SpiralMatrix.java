import java.util.Scanner;

public class SpiralMatrix 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter number of rows : ");
		int m=sc.nextInt();
		
		System.out.print("Enter the number of columns : ");
		int n=sc.nextInt();
		
		int[][] matrix=new int[m][n];
		
		System.out.println("Enter the matrix elements : ");
		for (int i=0;i<m;i++)
		{
			for (int j=0;j<n;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Spiral Order : ");
		
		int top =0, bottom =m-1;
		int left =0, right =n-1;
		
		while(top<=bottom && left<=right)
		{
			//Top row
			for (int i = left;i<=right;i++)
				System.out.print(matrix[top][i]+" ");
			top++;
			
			//Right Column
			for (int i=top;i<=bottom;i++)
				System.out.print(matrix[i][right]+" ");
			right--;
			
			//Bottom row 
			if (top<=bottom)
			{
				for (int i = right;i >= left;i--)
					System.out.print(matrix[bottom][i]+" ");
				bottom--;
			}
			
			//Left Column
			if (left <= right)
			{
				for (int i=bottom;i>=top;i--)
					System.out.print(matrix[i][left]+" ");
				left++;
			}
		}
		sc.close();
	}
}
