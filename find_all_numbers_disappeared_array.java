package solution;

import java.util.ArrayList;
import java.util.List;

public class find_all_numbers_disappeared_array {
	public static void main(String args[]) {
		int nums[] = {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(nums));
	}
	
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		boolean temp[] = new boolean [nums.length+1];
		for(int i=0;i<nums.length;i++) {
			temp[nums[i]] = true;
		}
		
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<temp.length;i++) {
			if(temp[i]!=true)
				list.add(i);
		}
		return list;
	}
}
