
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static int RANGE = 1000;
	public static void main(String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i=0; i<n; i++)
				arr[i] = sc.nextInt();
			
			int[] count = new int[RANGE];

			int l=-1, b=-1;
			for (int i=0; i<n ; i++) 
				count[arr[i]]++;
				
			
			  for (int i=RANGE-1; i>=0;i--) {
				  if(count[i]>3 && l==-1 && b==-1) {
					  l=i; b=i;
					  break;
				  }
				  if (count[i]>1 && l==-1) {
					  l=i;
					  count[i] = count[i]-2;
				  }
				  if (count[i]>1 && b==-1) {
					  b=i;
					  count[i] = count[i]-2;
				  }
			  }
			  
			  if (l==-1 || b==-1) 
				  System.out.println("-1"); 
			  else 
				  System.out.println(l*b);
			 
		}
	}
}
