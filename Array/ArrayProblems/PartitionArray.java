import java.util.Arrays;

public class PartitionArray 
{
	public static void partitionArray(int[] arr, int pivot)
	{
		int low=0,mid=0;
		int high=arr.length-1;
		
		while (mid<=high)
		{
			if(arr[mid]<pivot)
			{
				int temp=arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
			
				low++;
				mid++;
			}else if(arr[mid]==pivot)
			{
				mid++;
			}else{
				int temp=arr[mid];
				arr[mid]=arr[high];
				arr[high]=temp;
			
			high--;
			}
		}
	}
	public static void main(String[] args) 
	{
		int[] arr={9, 13, 3, 5, 14, 10, 10};
		int pivot=10;
		
		partitionArray(arr, pivot);
		
		System.out.println("Partitioned Array : "+ Arrays.toString(arr));
	}
}
