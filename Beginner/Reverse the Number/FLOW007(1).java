
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
		    int reverse = 0, rem;
		    
		    while (num!=0){
		        rem = num%10;
		        reverse = reverse*10+rem;
		        num = num/10;
		    }
		    System.out.println(reverse);
		}
	}
}
