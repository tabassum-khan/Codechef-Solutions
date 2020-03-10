
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int test = sc.nextInt();
		
		while(test --> 0){
		    
		    int n = sc.nextInt();   int m = sc.nextInt();
		    int x = sc.nextInt(),   y = sc.nextInt(),   s = sc.nextInt();
		    int x_arr[] = new int[x],   y_arr[] = new int[y];
		    
		    if (x!=0)
		        for (int i=0; i<x; i++)
		            x_arr[i] = sc.nextInt();
		            
		    if (y!=0)
		        for (int i=0; i<y; i++)
		            y_arr[i] = sc.nextInt();
		            
		    int x_units = 0, y_units = 0; //no of units that can be built in x & y direction respectively
		    
		    if (x==0)
		        x_units = n/s; //if no rivers are flowing
		    else{
		        for (int i=0; i<x; i++){
		            if (i==0)
		                x_units += ((x_arr[i] - 1) / s) ;
		            else
		                x_units += ((x_arr[i] - (x_arr[i-1] + 1)) / s);
		        }
		        
		        //if no river is flowing in the last row
		        if (x_arr[x - 1] != n)
		            x_units += ((n - x_arr[x-1]) / s);
		    }
		    
		     if (y==0)
		        y_units = m/s; //if no rivers are flowing
		    else{
		        for (int i=0; i<y; i++){
		            if (i==0)
		                y_units += ((y_arr[i] - 1) / s) ;
		            else
		                y_units += ((y_arr[i] - (y_arr[i-1] + 1)) / s);
		        }
		        
		        //if no river is flowing in the last row
		        if (y_arr[y - 1] != m)
		            y_units += ((m - y_arr[y-1]) / s);
		    }
		    
		    System.out.println(x_units * y_units);
		    
		} //end of while
	}
}
