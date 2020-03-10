package novLongChallenge2019;

import java.io.*;

public class MaxWeaponValue {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test --> 0){
		    int n = Integer.parseInt(br.readLine());
		    String[] str = new String[n];
		    for (int i=0; i<n; i++){
		        str[i] = br.readLine();
		    }
		     
		   int count_max_weapons = maxWeapon(str);	
		   System.out.println(count_max_weapons);
		} // end while(test)
	} //end main

	public static int maxWeapon(String[] str) {
		StringBuilder winner = new StringBuilder(str[0]);
		int count =0;
		
		for(int i=1; i<str.length; i++) {
			String string = str[i];	
			//comparing 2 strings;
			for(int j=0; j<10; j++) {
				if(winner.charAt(j) != string.charAt(j)) {
					winner.setCharAt(j, '1');
				}
				else {
					winner.setCharAt(j, '0');
				}
			}
		}//end for loop
		
		
		for (int j=0; j<10; j++) {
			if (winner.charAt(j) == '1')
				count++;
		}
		
		return count;
	}//end maxWeapon()
}
