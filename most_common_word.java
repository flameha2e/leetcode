package solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class most_common_word {
	public static void main(String args[]) {
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String banned[] = {"hit"};
		System.out.println(mostCommonWord(paragraph,banned));
		
	}
	
    public static String mostCommonWord(String paragraph, String[] banned) {
    		HashMap<String, Integer> map = new HashMap<String, Integer>();
    		StringTokenizer st = new StringTokenizer(paragraph,"!?',;. ");
    		HashSet<String> bannedSet = new HashSet<String>(Arrays.asList(banned));
    		String mostCommon = "";
    		int count = 0;
    		while(st.hasMoreTokens()) {
    			String word = st.nextToken().toLowerCase();
			int c = map.getOrDefault(word, 0)+1;
			map.put(word, c);
			if(c > count && !bannedSet.contains(word)) {
				count = c;
				mostCommon = word;
			}	
    		}	
    		
    		return mostCommon;
    }

}
