
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader buffer= new BufferedReader(new InputStreamReader(System.in));
		
		//System.out.print("Enter the number of tests: ");
		int test = Integer.parseInt(buffer.readLine());
		
		while (test --> 0) {
			//System.out.print("\nEnter the number: " );
			String num = buffer.readLine();
			int length = num.length();
			//System.out.println("length"+ length);
			int count =0;
			for(int i=0; i<length;i++) {
				int n = Integer.parseInt ("" + num.charAt(i));
				if (n==4)
					count++;
			}
			System.out.println(count);
		}
	}
}
