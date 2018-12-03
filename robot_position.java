package solution;

public class robot_position {
	
	public static void main(String args[]) {
		System.out.println(judgeCircle2("UU"));
		System.out.println(judgeCircle2("LL"));
		System.out.println(judgeCircle2("UD"));
	}

    public static boolean judgeCircle(String moves) {
        int U=10, D=-10, R=1, L=-1;
        int position = 0;
        for(int i = 0; i<moves.length();i++) {
        		if(moves.charAt(i)=='U')
        			position += U;
        		else if(moves.charAt(i)=='D')
        			position += D;
        		else if(moves.charAt(i)=='R')
        			position += R;
        		else //L
        			position += L;
        }
        
        return (position==0)?true:false;
    }
    
    public static boolean judgeCircle2(String moves) {
        int x = 0, y = 0;
        for(char c: moves.toCharArray()){
            x += (c=='R'?1:0) + (c=='L'?-1:0); y += (c=='U'?1:0) + (c=='D'?-1:0);
        }
        return x == 0 && y == 0;
    }
}
