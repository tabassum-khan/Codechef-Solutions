
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
		    int x_arr[] = new int[n],   y_arr[] = new int[m];
		    
		    for (int i=0; i<n; i++)
		        x_arr[i] = 0;
		        
		     for (int i=0; i<m; i++)
		        y_arr[i] = 0;
		        
		    int x_units = 0; //no of houses(units) that can be built in horizontal direction
		    int y_units = 0; //no of houses(units) that can be built in vertical direction
		    
		    if (x!=0){  //if rivers are flowing in horizontal direction
		        for (int i=0; i<x; i++){
		            int river = sc.nextInt();
		            x_arr[river-1] = -1; //put -1 for the row where the river is flowing
		        }
		    }
		    
		    if (y!=0){ //if rivers are flowing in vertical direction
		        for (int i=0; i<y; i++){
		            int river = sc.nextInt();
		            y_arr[river-1] = -1; //put -1 for the col where the river is flowing
		        }
		    }
		    
		    if (x==0)
		        x_units = n/s;
		    else{
		        int count = 0;
		        
		        // check the x_arr if rivers are flowing or not and count the units
		        for (int i=0; i<n; i++){
		            if (x_arr[i]==0 && count < s)
		                count++;
		            else if (x_arr[i] == -1)
		                count = 0;
		            
		            //if we have found the total unit required to built a house, increase x_units
		            if (count == s){ 
		                x_units++;
		                count = 0;
		            }
		        }
		    }
		    
		    if (y==0)
		        y_units = m/s;
		    else{
		        int count = 0;
		        
		        // check the y_arr if rivers are flowing or not and count the units
		        for (int i=0; i<m; i++){
		            if (y_arr[i]==0 && count < s)
		                count++;
		            else if (y_arr[i] == -1)
		                count = 0;
		            
		            //if we have found the total unit required to built a house, increase x_units
		            if (count == s){ 
		                y_units++;
		                count = 0;
		            }
		        }
		    }
		    
		    System.out.println(x_units * y_units);
		    
		} //end of while
	}
}
