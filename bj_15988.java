package bj;

import java.util.*;

public class bj_15988 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		long[] d = new long[1000001];
		d[0] = 1;

        for (int i=1; i<=1000000; i++) {
            for (int j=1; j<=3; j++) {
                if (i-j >= 0) {
                    d[i] += d[i-j];
                }
            }
			d[i] %= 1000000009;
		}

		while (T-- > 0) {
			int n = scan.nextInt();
			System.out.println(d[n]);
		}

	}

}
