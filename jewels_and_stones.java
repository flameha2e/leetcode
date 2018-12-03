package solution;

public class jewels_and_stones {
	
	public static void main(String args[]) {
//		String J = "aA", S = "aAAbbbb";
//		String J = "z", S = "ZZ";
		String J = "Ab", S = "aAAbbbb";
		
		System.out.println(numJewelsInStones(J,S));
		
	}

    public static int numJewelsInStones(String J, String S) {
    		String chars = "";
    		for(int i=0; i<S.length(); i++) {
    			if(J.indexOf(S.charAt(i)) !=-1) {
    				chars+=S.charAt(i);
    			}
    		}
    		
    		return chars.length();
        
    }
}
