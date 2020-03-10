
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
		    String num = br.readLine();
		    boolean flag = false;
		    if (num.charAt(0)!='0')
		        flag = palindrome(num);
		    if (flag == true)
		        System.out.println("wins");
		    else
		        System.out.println("losses");
		}
	}
	
	public static boolean palindrome(String num){
    	int i=0, j = num.length()-1;
    	while (i<=j){
    	    if (num.charAt(i)!=num.charAt(j))
    	        return false;
    	    i++; j--;
    	}
    	return true;
	}
}
