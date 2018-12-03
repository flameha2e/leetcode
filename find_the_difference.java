package solution;

import java.util.Arrays;

public class find_the_difference {
	public static void main(String args[]) {
		System.out.println(findTheDifference("abcd","abecd"));
		System.out.println(findTheDifference("ae", "aea"));
	}
	
    public static char findTheDifference(String s, String t) {
    		char sArray[] = s.toCharArray();
    		char tArray[] = t.toCharArray();
    		Arrays.sort(sArray);
    		Arrays.sort(tArray);
    		
    		for(int i=0;i<sArray.length;i++) {
    			if(sArray[i]!=tArray[i])
    				return tArray[i];
    		}
    		return tArray[tArray.length-1];
        
    }

}
