package solution;

import java.util.Arrays;

public class single_number {
	public static void main(String args[]) {
		int[] list = {0,1,1,2,2,3,3,4,4};
		System.out.println(singleNumber(list));
	}
	
    public static int singleNumber(int[] nums) {
    		Arrays.sort(nums);
        for(int i=0; i<nums.length-1;i+=2) {
        		if(nums[i]!=nums[i+1])
        			return nums[i];
        }
    		return nums[nums.length-1];
    }

}
