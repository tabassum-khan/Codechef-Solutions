
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception, NumberFormatException, IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());        
        //System.out.println("test: " + test);
        while (test!=0){
            String num = br.readLine ();
            int first = Integer.parseInt("" + num.charAt(0));
            int last = Integer.parseInt("" + num.charAt(num.length()-1));
            
            System.out.println(first + last);
            test--;
        }
	}
}
