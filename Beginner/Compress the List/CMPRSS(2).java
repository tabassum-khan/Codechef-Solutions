import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int t=Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    int n=Integer.parseInt(br.readLine());
		    String str[]=br.readLine().split(" ");
		    int a[]=new int[n];
            int i,j;
		    for(i=0;i<n;i++)
		    {
		        a[i]=Integer.parseInt(str[i]);
		    }
		for(i=0;i<n;i++){
		    for(j=i+1;j<n;j++){
		        if(a[j]!=a[i]+(j-i))
		        break;
		    }
		    if((j-i)>=3){
		        bw.write(a[i]+"..."+a[j-1]);
		        i=j-1;
		    }
		    else if((j-i)>=2){
		        bw.write(a[i]+","+a[j-1]);
		        i=j-1;
		    }
		    else
		        bw.write(a[i]+"");
		    if(i!=n-1)
		        bw.write(",");
		}
		    bw.newLine();
		}
		bw.close();
	}
}