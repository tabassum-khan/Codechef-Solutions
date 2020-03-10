/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner (System.in);
	    int test = sc.nextInt();
	    
	    while(test --> 0){
	        
	        int n = sc.nextInt(), k = sc.nextInt();
	        
	        for (int i=(n-k); i<=n; i++)
	            System.out.print(i + " ");
	            
	        for (int i=1; i<(n-k); i++)
	            System.out.print(i + " ");
	    }//end while
	}
}
