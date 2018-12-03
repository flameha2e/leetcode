package solution;

import java.util.Arrays;

public class unique_email_addresses {
	
	static public void main(String args[]) 
	{
		String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		System.out.println(numUniqueEmails(emails));
	}
	
    static public int numUniqueEmails(String[] emails) 
    {
    		if(emails.length==0)
    			return 0;
    		
    		String[] uniqueEmails = new String[emails.length];
    		int uniqueCount = 0;
    		for(int i=0; i<emails.length; i++)
    		{
    			String temp = emails[i];
    			while(temp.contains(".") && temp.indexOf('.')<temp.indexOf('@')) 
    			{
    				temp = temp.substring(0, temp.indexOf('.'))+temp.substring(temp.indexOf('.')+1, temp.length());
    			}
    			
    			if(temp.contains("+"))
    			{
    				temp = temp.substring(0, temp.indexOf('+'))+temp.substring(temp.indexOf('@')+1, temp.length());
    			}
    			
    			if(!Arrays.asList(uniqueEmails).contains(temp))
    			{
	    			uniqueEmails[uniqueCount++] = temp;
    			}	
    		}
    			
    		return uniqueCount;
    }

}
