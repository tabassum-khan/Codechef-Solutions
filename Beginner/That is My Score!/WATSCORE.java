/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        
        while(test --> 0){
            
            int n = sc.nextInt();
            int[] arr = new int[8];
            
            for (int i=0; i<n; i++){
                int p = sc.nextInt();
                int s = sc.nextInt();
                
                if (p==9 || p==10 || p==11)
                    continue;
                else if ( s > arr[p-1])
                    arr[p-1] = s;
            }
            //System.out.println(Arrays.toString(arr));
            
            int maxScore = 0;
            for (int i=0; i<arr.length; i++){
                maxScore += arr[i];
            }
            System.out.println(maxScore);
        }
	}
}
