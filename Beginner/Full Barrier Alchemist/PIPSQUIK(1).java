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
	        
	        int n =sc.nextInt(),    h = sc.nextInt(),   y1 = sc.nextInt(),      y2 = sc.nextInt(),     l = sc.nextInt();
	        int barrier_crossed = 0;
	        
	        for (int i=0; i<n; i++){
	            int type = sc.nextInt();
	            int x = sc.nextInt();
	            
	            if (type == 1){
	                if (x >= (h-y1) && l > 0)
	                    barrier_crossed++;
	                else{
    	                l--;
    	                if (l > 0)
    	                    barrier_crossed++;
    	            }
	            }
	            
	            else if (type == 2){
	                if (x <= y2 && l > 0)
	                    barrier_crossed++;
	                else{
    	                l--;
    	                if (l > 0)
    	                    barrier_crossed++;
    	            }
	            }
	        }
	        
	        System.out.println(barrier_crossed);
	        
	    }//end of while
	}
}
