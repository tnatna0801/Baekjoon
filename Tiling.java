package bj;

import java.util.*;
public class Tiling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] d = new int[1001];
		d[0] = d[1] = 1;
		for(int i = 2; i<=n; i++)
		{
			d[i] = d[i-1] + d[i-2];
			d[i] %= 10007;
		}
		
		System.out.println(d[n]);
		
	}

}
