import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
    int t=0;
    if(sc.hasNext())
        t=sc.nextInt();
    while(t-->0){
    int n=0;
    if(sc.hasNext()){
        n=sc.nextInt();
    }
    int r=n%8;
    if(r==0)
            System.out.println((n-1)+"SL");
    if(r==1)
            System.out.println((n+3)+"LB");
    if(r==2)
            System.out.println((n+3)+"MB");
    if(r==3)
            System.out.println((n+3)+"UB");
    if(r==4)
            System.out.println((n-3)+"LB");
    if(r==5)
            System.out.println((n-3)+"MB");
    if(r==6)
            System.out.println((n-3)+"UB");
    if(r==7)
            System.out.println((n+1)+"SU");
    
    
    
    }  
	}
}

