package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class intersection_of_two_arrays {
	public static void main(String args[]) {
//		int nums1[] = {1,2,2,1};
//		int nums2[] = {2,2};
//		int nums1[] = {4,7,9,7,6,7};
//		int nums2[] = {5,0,0,6,1,6,2,2,4};
		int nums1[] = {8,0,3};
		int nums2[] = {0,0};
		System.out.println(Arrays.toString(intersection(nums1, nums2)));
	}
	
    public static int[] intersection(int[] nums1, int[] nums2) {
    		int shorter_array[] = (nums1.length > nums2.length)? nums2: nums1;
    		int longer_array[] = (nums1.length > nums2.length)? nums1: nums2;
    		ArrayList<Integer> output = new ArrayList<Integer>();
        for(int i=0; i<shorter_array.length; i++) {
        		int num = shorter_array[i];
        		if(!output.contains(num) && IntStream.of(longer_array).anyMatch(x -> x == num)) {
        			output.add(num);
        		}
        }
        int res[] = new int[output.size()];
        for(int i =0; i<output.size(); i++) {
	        for(int n : output)
	            res[i++] = n;        	
        }
        return res;
    }
}
