
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception,  NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
	    
	    while (test-->0){
		    String num = br.readLine();
		    int length = num.length();
		    int lastDigit = Integer.parseInt("" + num.charAt(length-1));
		    String reverse = "";
		    
		    while (lastDigit == 0) {
		    	num = num.substring(0, num.length()-1);
		    	length = num.length();
		    	lastDigit = Integer.parseInt("" + num.charAt(length-1));
		    }
		    
		    //System.out.println(num + " " + length);
		    
			for (int i=length-1; i>=0; i--){ 
				reverse =  reverse + num.charAt(i); 
			} 
			
			System.out.println(reverse);

		}
	}
}
