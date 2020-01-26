package bj;

import java.util.*;
public class bj_1912 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] ans = new int[n];
		int[] d = new int[n];
		//String[] tmp = (scan.nextLine()).split(" ");
		int r = -9999;
		
		for(int i = 0; i<n; i++)
		{
			d[i] = scan.nextInt();
		}
		
		ans[0] = d[0];
		
		for(int i = 1; i<n; i++)
		{
			ans[i] = Math.max(ans[i-1]+d[i], d[i]);
		}
		
		for(int i = 0; i<n; i++)
		{
			r = Math.max(ans[i], r);
		}
		System.out.println(r);
	}

}
