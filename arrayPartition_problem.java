package solution;

import java.util.Arrays;

public class arrayPartition_problem {
	
	public static void main(String args[]) {
		int array[] = {1,4,3,2};
		System.out.println(arrayPairSum(array));
	}
	
    public static int arrayPairSum(int[] nums) {
    		Arrays.sort(nums);
    		int sum = 0;
        for(int i = 0; i<nums.length; i+=2) {
        		sum += Math.min(nums[i], nums[i+1]);
        }
    	
    		return sum;
    }

}
