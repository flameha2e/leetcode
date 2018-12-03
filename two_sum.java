package solution;
import java.util.Arrays;

public class two_sum{
	public static void main(String args[]){
		int numArray[] = {2, 7, 11, 15};
//		int numArray[] = {3,2,4};
		int[] array = twoSum(numArray, 17);
		System.out.println(Arrays.toString(array));
		
	}
	
	
	public static int[] twoSum(int[] nums, int target) {
	    for(int i=0; i < nums.length; i++)
	    {
	        for( int j=i+1; j<nums.length; j++)
	        {
	        		if(nums[i]+nums[j]==target)
	        			return new int[] { i, j };
	        }     
	    }
	    throw new IllegalArgumentException("No two number add up to target");
	}	
}