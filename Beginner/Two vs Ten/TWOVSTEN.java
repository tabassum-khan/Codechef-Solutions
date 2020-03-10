import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		while(test --> 0){
		    int num = sc.nextInt();
		    
		    if(num%10 == 0)
		        System.out.println(0);
		    else if (num%10 == 5)
		        System.out.println(1);
		    else
		        System.out.println(-1);
		}//end while
		
	}
}
