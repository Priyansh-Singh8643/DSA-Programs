class  BubbleSortOptimized2
{
	public static void main(String[] args) 
	{
		int arr[]= {11,12,17,24,32};
		
		System.out.println("Original Array : ");
		printArray(arr);
		
		bubbleSort(arr);
		
		System.out.println("\nSorted Array(Ascending) : ");
		printArray(arr);
		
	}
	
	public static void bubbleSort(int[] arr){
		int n= arr.length;
		int count=0;
		
		for (int i=0;i<n-1;i++)
		{
			for (int j=0;j<n-1;j++)
			{
				if (arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
				if (arr[j]<=arr[j+1])
				{
					System.out.println("Testing");
					count++;
				}
				if (count==4)
				{
					break;
				}
			}
			
			System.out.println("Testing 2");
			if (count==4)
			{
				break;
			}
		}
	}
		public static void printArray(int[] arr)
		{
			for (int num: arr)
			{
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}
