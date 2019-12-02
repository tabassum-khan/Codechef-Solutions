
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		while(test --> 0){
		    int n = Integer.parseInt(br.readLine());
		    HashMap <String, Integer> spam = new HashMap <>();
		    HashMap <String, Integer> not_spam = new HashMap <>(); 
		    int count_training_set = 0;
		    
		    for (int i=0; i<n; i++){
		        String str = br.readLine();
		        String[] str_split = str.split(" ");
		        //System.out.println(Arrays.toString(str_split) + " : " + str_split[1].getClass().getName());
		        
		        if (Integer.parseInt(str_split[1]) == 1){
		            if (spam.containsKey(str_split[0]))
		                spam.replace(str_split[0], spam.get(str_split[0])+1);
		            else {
		                spam.put (str_split[0], 1);
		                not_spam.put(str_split[0], 0);
		            }
		        }
		        else{
		             if (not_spam.containsKey(str_split[0]))
		                not_spam.replace(str_split[0], not_spam.get(str_split[0])+1);
		            else {
		                not_spam.put (str_split[0], 1);
		                spam.put(str_split[0], 0);
		            }
		        }
		    }
		    
		  //  spam.forEach((k, v) -> System.out.println(k + " : " + v)); 
		  //  not_spam.forEach((k, v) -> System.out.println(k + " : " + v)); 
		    
		    for (String s: spam.keySet()) {
		    	if (spam.get(s) > not_spam.get(s))
		    		count_training_set += spam.get(s);
		    	else
		    		count_training_set += not_spam.get(s);
		    }
		    
		    System.out.println(count_training_set);
		    
		}
		
	}
}
