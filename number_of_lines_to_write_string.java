package solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class number_of_lines_to_write_string {
	public static void main(String args[]) {
		
		int[] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		String S = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(Arrays.toString(numberOfLines(widths, S)));	
	}
	
	public static int[] numberOfLines(int[] widths, String S) {
		String letters = "abcdefghijklmnopqrstuvwxyz";
		Map<Character,Integer> myMap = new HashMap<Character,Integer>();
		for(int i=0;i<letters.length();i++)
		{
			myMap.put(letters.charAt(i), widths[i]);
		}
		
		int pos = 0;
		int line = 1;
		for(int i=0;i<S.length();i++) {
			if( !((pos+myMap.get(S.charAt(i)))>100))
					pos += myMap.get(S.charAt(i));
			else {
				line++;
				pos = myMap.get(S.charAt(i));
			}
				
		}

		int[]  result = {line, pos};
		return result;
	}

}
