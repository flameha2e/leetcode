package solution;

import java.util.List;
import java.util.ArrayList;

public class self_dividing_numbers {

	public static void main(String args[]) {
		System.out.println(selfDividingNumbers(21, 30));
	}
	
	
    public static List<Integer> selfDividingNumbers(int left, int right) {
    		List<Integer> list = new ArrayList<>();
    		for(int i=left; i <= right; i++) {
    			boolean isNotFactor = false;
    			int num = i;
    			while(num > 0) {
    				int digit = num % 10;
    				num = num / 10;
    				if(digit==0 || i%digit !=0) {
    					isNotFactor = true;
    					break;
    				}
			}
    			if(isNotFactor == false)
    				list.add(i);
		}
        return list;
    }
}