class NumberBetweenArray 
{
	public static void main(String[] args) 
	{
		int arr[]={12,11,32,2,7};
		
		int i,j;
		
		System.out.println("Original Array :- ");
		
		for( i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println("\n");
		
		for(i=1;i<5;i++)
		{
			j=i-1;
			
			while(j>=0 && arr[j+1]<arr[j])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				j--;
			}
		}
		
		System.out.println("Sorted Array :- ");
		
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println("\n");
		
		arr[2]=72;
		
		System.out.println("Inserted Value :- "+arr[2]);
					
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println("\n");
		
		for(i=2;i<5;i++)
		{
			j=i-1;
			
			while(j>=0 && arr[j+1]<arr[j])
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				j--;
			}
		}
		
		System.out.println("Again Sorted :- ");
		
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println("\n");
		
	}
}
