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
	        int[] arr = new int[n];
	        
	        for (int i=0; i<n; i++){
	            arr[i] = i+1;    
	        }
	        
	        int temp = arr[k];
	        arr[k] = arr[n-1];
	        arr[n-1] = temp;
	        
	        for (int i=0; i<n; i++){
	            System.out.print(arr[i] + " ");  
	        }
	    }//end while
	}
}
