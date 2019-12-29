package novLongChallenge2019;

import java.io.*;
import java.util.*;

public class HardSequence {

	public static void main(String[] args)throws IOException, java.lang.Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test --> 0){
		    int n = Integer.parseInt(br.readLine());
		    int number_of_occurences = findNthElement(n);

		    System.out.println(number_of_occurences);
		   		    
		} // end while(test)
		
	}//end of main
	
	public static int findNthElement(int n) {
		int[] sequence = new int[n];
		
	    sequence[0] = 0;
	    int count_occurences = 0;
	    HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
	    HashMap<Integer, Integer> index = new HashMap<Integer, Integer>();
	    
	   if (count.isEmpty())
		   count.put(sequence[0], 1);
	    
	    for(int i=0; i<n-1; i++) {
	    	//if that element doesnt exist before in the sequence, put 0 else calculate distance
	    	if (count.get(sequence[i]) == 1) {
	    		sequence[i+1] = 0;
	    		int count_value = count.get(0);
	    		count.replace(0, ++count_value);	    		
	    	}
	    	else {
	    		int distance = i - index.get(sequence[i]);
	    		//System.out.println("distance: " + distance);
	    		sequence[i+1] = distance;
	    		
	    		//if distance_value exist then update it else create it
	    		if(count.containsKey(sequence[i+1])){
	    			int count_value = count.get(sequence[i+1]);
	    			count.replace(sequence[i+1], ++count_value);
	    		}
	    		else {
	    			count.put(distance, 1);
	    		}
	    	}
	    	//Update the index of the element
	    	if (index.containsKey(sequence[i])) {
	    		index.replace(sequence[i], i);
	    	}else {
	    		index.put(sequence[i], i);
	    	}
	    }//end of for loop

	    count_occurences = count.get(sequence[n-1]);
	    
	    return count_occurences;
	}//end of findNthElement()
}
