import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(ir);
		StringTokenizer st;
		int noOfTestCases = Integer.parseInt(bf.readLine());
		int n, h, y1, y2, l, t, x;
		int counter = 0;
		for(int i = 0; i < noOfTestCases; i++){
		    st = new StringTokenizer(bf.readLine());
		    n = Integer.parseInt(st.nextToken());
		    h = Integer.parseInt(st.nextToken());
		    y1 = Integer.parseInt(st.nextToken());
		    y2 = Integer.parseInt(st.nextToken());
		    l = Integer.parseInt(st.nextToken());
		    
		    for(int j = 0; j < n; j++){
		        st = new StringTokenizer(bf.readLine());
		        t = Integer.parseInt(st.nextToken());
		        x = Integer.parseInt(st.nextToken());
		        
		        if((t == 1 && h - y1 > x) || (t == 2 &&  y2 < x)){
		            l--;
		        }
		        counter++;
		        
		        if(l < 1){
		            counter--;
		            for(int k = j+1; k < n; k++){
		                st = new StringTokenizer(bf.readLine());
		                t = Integer.parseInt(st.nextToken());
		                x = Integer.parseInt(st.nextToken()); 
		            }
		            break;
		           
		        }
		        
		    }
		    System.out.println(counter);
		    counter = 0;
		}
		
		bf.close();
	}
}
