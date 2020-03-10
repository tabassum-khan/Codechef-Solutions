
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
			        int fact =1;
            		while (n!=0) {
            			fact = fact*n;
            			n--;
            		}
			        System.out.println(fact);
			     }
			}catch (Exception e) {
				System.out.println(e);
			}
	}
	
}
