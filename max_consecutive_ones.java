package solution;

public class max_consecutive_ones {
	public static void main(String args[]) {
		int[] input = {0,0};
		System.out.println(findMaxConsecutiveOnes(input));
		
	}
    public static int findMaxConsecutiveOnes(int[] nums) {
        int consecutiveCount = 0;
        int start=0, end=0;
        int i=0;
        	while(i<nums.length) {
        		while(i<nums.length && nums[i]!=1)
        			i++;
        		start = i;
        		while(i<nums.length && nums[i]==1)
        			i++;
        		end=i;
        		if(end-start > consecutiveCount)
        			consecutiveCount = end-start;
    		}
        
    		return consecutiveCount;
    }
}
