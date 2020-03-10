/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		while(test --> 0){
		
		int n = Integer.parseInt(br.readLine());
	    String str = br.readLine();
	    
	    String new_str = "";
	    
	   // System.out.println(str);
	    
	    for(int i=0; i<n; i+=2){
	    	//System.out.println(str.charAt(i));
	        if (i == (n-1))
	            new_str += str.charAt(i);
	       else 
	            new_str += str.charAt(i+1) +""+ str.charAt(i);
	    }
	   // System.out.println(new_str);
	    
	    String msg = "";
	   
	    for(int i=0; i<n; i++){
	    	char new_char = (char) ('z' - ( new_str.charAt(i)- 'a' ));
	    	msg += new_char;    	
	    }
	    System.out.println(msg);
		}
	}
}
