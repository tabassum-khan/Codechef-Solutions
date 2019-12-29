
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while (test-->0){
		    int num = Integer.parseInt(br.readLine());
		    int reverse= 0, i=num;
		    
		    while (i!=0){
		        reverse = (reverse*10) + (i%10);
		        i /= 10;
		    }
		    
		   //System.out.println(num + " , "+ reverse);
		   if (num==reverse)
		        System.out.println("wins");
		   else 
		        System.out.println("losses");
		}
	}
}
