/*
It is a Square matrix(n x n)

Sum of each row is equal

Sum of each column is equal

Sum of both the diagonals is equal

All numbers are distinct

*/
import java.util.Scanner;

class MagicSquareCheck 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the size of square matrix(n) : ");
		int n=sc.nextInt();
		
		int[][] matrix=new int[n][n];
		
		System.out.println("Enter matrix elements : ");
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		
		int sum	= 0;
		
		// Sum of first row
		for (int j=0;j<n;j++)
		{
			sum+=matrix[0][j];
		}
		
		boolean isMagic = true;
		
		//Check rows
		for (int i=0;i<n;i++)
		{
			int rowSum=0;
			for (int j=0;j<n;j++)
			{
				rowSum+=matrix[i][j];
			}
			if (rowSum!=sum)
			{
				isMagic=false;
				break;
			}
		}
		
		//Check Columns
		for (int j=0;j<n && isMagic;j++)
		{
			int colSum=0;
			
			for (int i=0;i<n;i++)
			{
				colSum+=matrix[i][j];
			}
			if (colSum!=sum)
			{
				isMagic=false;
				break;
				
			}
		}
		
		//Check Diagonals
		int diag1=0,diag2=0;
		for (int i=0;i<n;i++)
		{
			diag1+=matrix[i][i];
			diag2+=matrix[i][n-i-1];
		}
		
		if (diag1!=sum || diag2!=sum)
		{
			isMagic=false;
		}
		
		if(isMagic)
			System.out.println("Matrix is a Magic Square.");
		else
			System.out.println("Matrix is not a Magic Square.");
		
		sc.close();
		}
	}

