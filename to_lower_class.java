package solution;

import java.util.HashMap;

public class to_lower_class {
    public static void main(String args[]) {
    		System.out.println(toLowerCase("LOVELY"));
    }
	
	public static String toLowerCase(String str) {
        HashMap<String, String> map = new HashMap<String, String>(); 
        map.put("A","a");
        map.put("B","b");
        map.put("C","c");
        map.put("D","d");
        map.put("E","e");
        map.put("F","f");
        map.put("G","g");
        map.put("H","h");
        map.put("I","i");
        map.put("J","j");
        map.put("K","k");
        map.put("L","l");
        map.put("M","m");
        map.put("N","n");
        map.put("O","o");
        map.put("P","p");
        map.put("Q","q");
        map.put("R","r");
        map.put("S","s");
        map.put("T","t");
        map.put("U","u");
        map.put("V","v");
        map.put("W","w");
        map.put("X","x");
        map.put("Y","y");
        map.put("Z","z");
        String result = "";
			
        for(int i=0; i < str.length(); i++)
		{
			if(map.containsKey(str.charAt(i)+""))
				result += map.get(str.charAt(i)+"");
			else
				result += str.charAt(i);
					
		}
				
		return result;
    }

}
