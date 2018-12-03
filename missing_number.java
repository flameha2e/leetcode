package solution;

import java.util.Arrays;

public class missing_number {
	
	public static void main(String args[]) {
		int[] input = {3,0,1};
//		int[] input = {9,6,4,2,3,5,7,0,1};
//		int[] input = {0};
		System.out.println(missingNumber(input));
		
	}
	
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<=nums.length-1;i++) {
        		if(nums[i]!=i)
        			return i;
        }
        return nums.length;
    }

}