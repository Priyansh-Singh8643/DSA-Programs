class MergeSort 
{
	public static void divide(int[] arr, int si, int li)
	{
		if (si<li)
		{
			int mid=si+(li-si)/2;
			
			divide(arr, si, mid);
			divide(arr, mid+1, li);
			
			conquer(arr, si, mid, li);
		}
	}
	
	public static void conquer(int[] arr, int si, int mid, int li)
	{
		// Temporary array
		int[] temp=new int[li-si+1];
		
		int i=si;
		int j=mid+1;
		int k=0;
		
		// Merge the two halves
		while(i<=mid && j<=li)
		{
			if (arr[i]<=arr[j])
			{
				temp[k++]=arr[i++];
			}else{
				temp[k++]=arr[j++];
			}
		}
		
		// Copy remaining elements from left half
		while(i<=mid)
		{
			temp[k++]=arr[i++];
		}
		
		// Copy remaining elements from the right half
		while(j<=li)
		{
			temp[k++]=arr[j++];
		}
		//System.out.println();
		
		// Copy temp array back to original array
		for (int x=0;x<temp.length;x++)
		{
			arr[si+x]=temp[x];
			
			//System.out.print("->"+arr[si+x]+"["+(si+x)+"]");
			// Above commented line is for testing
		}
		//System.out.println();
	}
		
	public static void main(String[] args) 
	{
		int[] arr={12, 11, 13, 5, 6, 7};
		
		System.out.println("Original Array : ");
		for (int num: arr )
		{
			System.out.print(num+" ");
		}
		int arrSize=arr.length-1;
		divide(arr, 0, arr.length-1);
		
		System.out.println("\n\nSorted Array : ");
		for (int num: arr)
		{
			System.out.print(num+" ");
		}
		
		System.out.println("\n");
	}
}
