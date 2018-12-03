package solution;

public class reverse_string {
	public static void main(String args[]) {
		System.out.println(reverseString("aBcDeFg"));
	}
	
	public static String reverseString(String s) {
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}

}
