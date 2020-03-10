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
		
		while (test--> 0){
		    int n = sc.nextInt();
    		int[] arr = new int[n];
    		
    		for (int i=0; i<n; i++) {
    			arr[i] = sc.nextInt();
    		}
    	    String range = "";
    		int i=0, j=0;
    		while(i < n) {
    			while (j < n-1 && arr[j+1] == (arr[j] + 1))
    				j++;
    			//System.out.println("arr i : " + arr[i] + " arr j : " + arr[j] +  " Value of i & j: " + i + " "+ j);
    			if ( arr[j] >= (arr[i] + 2) ) {
    				range += arr[i] + "..." + arr[j] + ",";
    				i = ++j;
    			}
    			else {
    				range += "" + arr[i] + ",";
    				j= ++i;
    			}
	    	}
	    	
            System.out.println( range.substring(0, range.length()-1) );
            
		}//end of taste
	}
}
