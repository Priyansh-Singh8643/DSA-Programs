// Matrix Multiplication 
// Time complexity of this program would be order of (n cube)
class MatrixMultiplication 
{
	public static void main(String[] args) 
	{
		int a[][]={{1,2,3},{4,5,6}};
		int b[][]={{1,2},{3,4},{5,6}};
		int c[][]={{0,0},{0,0}};
		
		for (int i=0;i<2;i++)
		{
			for (int j=0;j<2;j++)
			{
				for (int k=0;k<3;k++)
				{
					c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
				}
			}
		}
		
		for (int i=0;i<2;i++)
		{
			for (int j=0;j<2;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
