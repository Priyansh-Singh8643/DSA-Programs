class SearchInRotatedArray 
{
	public static int search(int arr[],int target)
	{
		int	left=0;
		int	right=arr.length-1;
		
		while(left <= right)
		{
			int	mid	= left + (right-left)/2;
			
			//Target Found
			if(arr[mid]==target)
			{
				return mid;
			}
			
			//Left half	sorted
			if(arr[left] <=	arr[mid])
			{
				if (target >= arr[left]	&& target <	arr[mid])
				{
					right =	mid	- 1;
				}else{
					left = mid + 1;
				}
			}
			
			//Right	half sorted
			else{
				
				if(target >	arr[mid] &&	target <= arr[right])
				{
					left = mid + 1;
				}else{
					right = mid - 1;
				}
			}
		}
		return -1; // Not Found
	}
				
			
	public static void main(String[] args) 
	{
		int[] arr={4, 5, 6,	7, 1, 2, 3};
		int	target=2;
		
		int	result=search(arr,target);
		
		if(result!=-1){
			System.out.println("Target found at	index :- "+result);
		}
		else{
			System.out.println("Target Not found.");
		}
	}
}
