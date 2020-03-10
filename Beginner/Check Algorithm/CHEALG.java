/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
	    int test = Integer.parseInt(br.readLine());
	    
	    while(test --> 0){
	        
	        String str = br.readLine();
	        int l = str.length();
	        
	        String new_str = "";
	        
	        for (int i=0; i<l; i++){
	            int count = 1;
	            char ch = str.charAt(i);
	           // System.out.println(ch);
	            while (i<l-1 && (ch == str.charAt(i+1))){
	                count++;
	                i++;
	            }
	            new_str += ch + "" + count;
	        }
	        
	       // System.out.println(new_str);
	       
	       if (new_str.length() < l)
	            System.out.println("YES");
	       else
	            System.out.println("NO");
	        
	    }//end while
	}
}
