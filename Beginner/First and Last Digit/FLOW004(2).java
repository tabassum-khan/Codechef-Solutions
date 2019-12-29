
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{   
	    int first=0;
	    
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        
        while (test --> 0){
            int num = sc.nextInt();
    	    int last = num%10;
    	    for (int i=num; i!=0; i/=10){
    	        first = i%10;
    	    }
    	    System.out.println(first + last);
        }
	}
}
