package codechef;

import java.util.*;

public class PIPSQUIK {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		 int n =sc.nextInt(),    h = sc.nextInt(),   y1 = sc.nextInt(),      y2 = sc.nextInt(),     l = sc.nextInt();
	     int barrier_crossed = 0;
	     
	     for (int i=0; i<n; i++) {
	    	 int type = sc.nextInt();
	    	 int x = sc.nextInt();
	    	 //System.out.println("Crossed : " + barrier_crossed);
	    	 if (l<0)
	    		continue;
	    	 if (type == 1 && x < (h-y1))
	    		 l--;
	    	 else if (type == 2 && x > y2)
	    		 l--;
	    	 if (l>0)
	    		 barrier_crossed++;
	     }
	     System.out.println(barrier_crossed);
	}
}	
