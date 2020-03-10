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
	        int n = sc.nextInt();
	        int k = sc.nextInt();
	        int[] arr = new int[n];
	        
	        for (int i=0;i<n; i++)
	            arr[i] = sc.nextInt();
	            
	        Arrays.sort(arr);
	        //System.out.println(Arrays.toString(arr));
	        
	        int last_elem = arr[k-1];
	        int n1 = 0, r = 0;
	        
	        for (int i=0; i<n; i++){
	            if (arr[i] == last_elem){
	               if (i<k)
	                    r++;
	               n1++;
	            }
	        }
	       // System.out.println(r + " " + n1);
	        long count_subsequence = nCr (n1, r);
	        System.out.println(count_subsequence);
	    }
	}
	
	static long nCr(int n,int r)
    {
        long p=1,q=1;
        long m;
       
       while(r!=0 && n>r) 
       {
           p=p*n;
           q=q*r;
           m=gcd(p,q);
           p=p/m;
           q=q/m;
           n--;
           r--;
       }
      
       return p ;
    }
    static long gcd(long p,long q)
    {
        if(p==0)
            return q;
        return gcd(q%p, p);
    }
}
