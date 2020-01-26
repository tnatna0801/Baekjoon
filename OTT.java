package bj;

import java.util.*;
public class OTT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = Integer.parseInt(scan.nextLine());
		int[] d = new int[12];
		d[1] = 1;
		d[2] = 2;
		d[3] = 4;
		
		while(T-- > 0)
		{
			int x = Integer.parseInt(scan.nextLine());
			for(int i = 4; i <= x; i++)
			{
				d[i] = d[i-3] + d[i-2] + d[i-1];
			}
			System.out.println(d[x]);
		}
		
	}

}
