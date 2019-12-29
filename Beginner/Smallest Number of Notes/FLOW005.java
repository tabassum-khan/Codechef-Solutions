
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int[] denominations = {1,2,5,10,50,100};
		int length = denominations.length;
		//System.out.println(length);
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test -->0){
    		int num = sc.nextInt();
    		int notes = 0;
    		for (int i=length-1; i>=0; i--) {
    			while (num >= denominations[i]) {
    				//System.out.println(denominations[i]);
    				notes = notes+ (num/denominations[i]);
    				num=num%denominations[i];
    				//System.out.println("notes: " + notes + " num: " + num);
    			}
    			if (num==0)
    				break;
    		}
    		System.out.println(notes);
		}
	}
}
