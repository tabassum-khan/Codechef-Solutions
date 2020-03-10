package novLongChallenge2019;

import java.util.*;
public class HrdSeq {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-->0) {
			int n = sc.nextInt();
			
			int count[] = new int[n];
			
			int sequence[] = new int[n];
			sequence[0] = 0;
			count[0] = 1;
			
			//int no_of_occurences = 0;
			
			for(int i=0; i<n-1; i++) {
				int index =-1;
				//System.out.println("Sequence: " + sequence[i]);
				for(int j=i-1; j>=0; j--) {
					if (sequence[j] == sequence[i]) {
						index = j;
						break;
					}
				}
				if (index == -1) {
					sequence[i+1] = 0;
					count[0] += 1;
				}
				else {
					//System.out.println("count: " + count + " index " + index);
					int distance = i - index;
					sequence[i+1] = distance;
					count[distance] += 1;
				}
			}
			
			//System.out.println(Arrays.toString(sequence));
//			for (int i=0; i<n; i++) {
//				//System.out.println(sequence[i]);
//				if (sequence[i] == sequence[n-1])
//					no_of_occurences++;
//			}
//			System.out.println(no_of_occurences);
			
			System.out.println(count[sequence[n-1]]);
			
		}//end of while
	}
}
