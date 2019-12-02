
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		int test = Integer.parseInt(br.readLine());
		
		while(test --> 0){
		    
		    String num = br.readLine();
		    
		    int min_price = Integer.MAX_VALUE;
		    
		    for (int i=0; i<num.length(); i++){
		        StringBuilder num2 = new StringBuilder(num);
		        num2.delete (i, i+1);
		        
		        if (Integer.parseInt(num2.toString()) < min_price){
		            min_price = Integer.parseInt(num2.toString());
		        }
		        
		    }
		    System.out.println(min_price);
		}
	}
}
