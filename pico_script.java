package solution;

public class pico_script {
	public static void main(String args[])
	{
		System.out.print(generateString('R',733));
	}
	
	public static String generateString(char C,int num)
	{
		String r = "";
		for(int i=0;i<num;i++) {
			r += C;
		}
		
		return r;
	}
}
