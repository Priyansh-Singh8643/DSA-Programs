import java.util.*;

class FindPivotIndex 
{
	public static int pivotIndex(int[] nums)
	{
		int totalSum=0;
		
		for (int num:nums)
		{
			totalSum+=num;
		}
		
		int leftSum=0;
		
		for(int i=0;i<nums.length;i++)
		{
			int rightSum = totalSum - leftSum - nums[i];
			
			if (leftSum == rightSum)
			{
				return i;
			}
			leftSum += nums[i];
		}
		return -1;
	}
	
	public static void main(String[] args) 
	{
		int[] nums={6, 7, 13, 3, 10};
		
		int result = pivotIndex(nums);
		
		if (result != -1)
		{
			System.out.println("Pivot Index :"+result);
		}
		else{
			System.out.println("No Pivot Index Found.");
		}
	}
}
