/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		while(test --> 0){
		    
		    int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), 
		        c = sc.nextInt(), d = sc.nextInt(), p = sc.nextInt(), 
		        q = sc.nextInt(), y = sc.nextInt();
		    
		    int[] loc = new int[n];
		    
		    for (int i=0; i<n; i++)
		        loc[i] = sc.nextInt();
		    
		    int time_walk = Math.abs((loc[b-1] - loc[a-1]) * p);
		  //  System.out.println(time_walk);
		    
		    int time_ac = Math.abs((loc[c-1] - loc[a-1]) * p);
		    int time_cd = Math.abs((loc[d-1] - loc[c-1]) * q);
		    int time_db = Math.abs((loc[d-1] - loc[b-1]) * p);
		    
		    int time_train = y + time_cd + time_db;
		    
		    if (time_ac <= y)
		        System.out.println(Math.min(time_walk, time_train));
		    else
		        System.out.println(time_walk);
		    
		}// end while
		
	}
}
