import java.util.Scanner;

class RotateSortedArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		//Original Sorted Array
		int arr[]={1,2,3,4,5,6,7,8,9};
		
		System.out.print("Enter Rotation Index :- ");
		int k=sc.nextInt();
		
		int n=arr.length;
		
		//Handle case if k > n
		k= k % n;
		
		int[] rotated = new int[n];
		
		int index=0;
		
		//Copy from k to end
		for (int i=k;i<n;i++)
		{
			rotated[index++]=arr[i];
		}
		
		//Copy from 0 to k-1
		for (int i=0;i<k;i++)
		{
			rotated[index++]=arr[i];
		}
		
		//Printed Rotated Array
		System.out.println("Rotated Array : ");
		
		for (int num:rotated)
		{
			System.out.print(num+"	");
		}
		System.out.println();
		
		sc.close();
	}
}
