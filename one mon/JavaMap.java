//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
        HashMap<String,Integer> map = new HashMap<>();
		int n=in.nextInt();
        int k =0;
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
            in.nextLine();
			map.put(name,phone);
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            k=map.getOrDefault(s,0);
            if(k==0){
                System.out.println("Not found");
            }
            else{
                System.out.println(s+"="+k);
            }
		}
	}
}
