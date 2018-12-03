package solution;

public class rotate_string {
	public static void main(String args[]) {
//		System.out.println(rotateString("abcde", "cdeab"));
		System.out.println(rotateString("abcde", "abced"));
	}
	
	public static boolean rotateString(String A, String B) {
        if(A.length() != B.length()) return false;
		if(A.equals(B)) return true;
		
		for(int offset=1; offset< A.length();offset++) {
			boolean match = true;
			for(int i=0;i<B.length();i++) {
				if(A.charAt((i+offset) % A.length())!=B.charAt(i)) {
					match = false;
					break;
				}
			}
			if (match) return true;
		}
        return false;
    }
}
