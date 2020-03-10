
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try
			{
			    Scanner sc=new Scanner(System.in);
			    int t=sc.nextInt();
			    while(t-->0)
			    {
			        int n = sc.nextInt();
                    int fact = fact(n);
			        System.out.println(fact);
			     }
			}catch (Exception e) {
				System.out.println(e);
			}
	}
	private static int fact(int num){
	    if (num==0 || num==1)
	        return 1;
	   else 
	        return num*fact(num-1);
	}
}
