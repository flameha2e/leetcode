package solution;

import java.util.StringTokenizer;

public class reverse_words_in_string_iii {
	
	public static void main(String args[]) {
		System.out.println(reverseWords("This is a test to see if the words can be reversed"));
		
	}
	
    public static String reverseWords(String s) {
    		StringTokenizer st = new StringTokenizer(s);
    		String output = "\"";
    		while(st.hasMoreTokens()) {
    			StringBuilder sb = new StringBuilder(st.nextToken());
    			output += sb.reverse();
    			if(st.hasMoreTokens())
    				output += " ";
    		}
    		
        return output+"\"";
    }

}
