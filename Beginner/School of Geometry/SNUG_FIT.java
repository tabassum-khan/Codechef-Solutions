/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int test;
		int n;
		Scanner sc=new Scanner(System.in);
		test=sc.nextInt();
		for(int x=0;x<test;x++){
		   long s=0;
		   n=sc.nextInt();
		  long  a[]=new long[n];
		   long b[]=new long[n];
		   for(int i=0;i<n;i++){
			   a[i]=sc.nextLong();
		   }
		 
		   for(int j=0;j<n;j++){
			   b[j]=sc.nextLong();
		   }
		   Arrays.sort(a);
		   Arrays.sort(b);
		   for(int k=0;k<n;k++){
			   if(a[k]>b[k]){
				   s+=b[k];
			   }
			   else
			   s+=a[k];
		   }
		   System.out.println(s);
					
	    }//end while loop
	}
}
