package bj;

import java.util.*;
public class bj_2193 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] d = new long[n+1];
		
		d[1] = 1;
		if(n >= 2)
		{
			d[2] = 1;
		}
		for(int i = 3; i<=n; i++)
		{
			d[i] = d[i-1]  + d[i-2];
		}
		System.out.println(d[n]);
	}
}
