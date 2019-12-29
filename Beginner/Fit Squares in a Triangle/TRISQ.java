
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
    	Scanner sc = new Scanner(System.in);
		
		//System.out.println("Enter the number of test cases");
		
		int t = sc.nextInt();
		
		while(t-->0) {
			int base = sc.nextInt();
			int squares = squaresInTriangle(base,0);
			System.out.println(squares);
		}		
		sc.close();
	}
	private static int squaresInTriangle(int base, int x) {
		if (base<=3)
			return x;
		else {
			if (base%2==0) {
				x = x + base-2;
				return squaresInTriangle(base-4, x-1);
			}
			else {
				x= x + base-3;
				return squaresInTriangle(base-4, x-1);
			}
		}
	}
}
