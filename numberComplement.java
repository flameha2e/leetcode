package solution;

public class numberComplement {
	
	public static void main(String args[]) {
		int test = 4;
		System.out.println(findComplement(test));
	}
	
    public static int findComplement(int num) {
    		StringBuilder sb = new StringBuilder();
    		while(num !=0) {
    			sb.append(num % 2 == 0? "1": "0");
    			num /= 2;
    		}

    		int sum = 0;
    		for(int i=0;i<sb.length();i++) {
    			sum += (int)Math.pow(2, i)*Integer.parseInt(String.valueOf(sb.charAt(i)));
    		}
    		return sum;

    }
    
    public static int findComplement2(int num) {
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            sb.append(num % 2 == 0 ? "1" : "0");
            num /= 2;
        }
        return Integer.parseInt(sb.reverse().toString(), 2);
    }

}
