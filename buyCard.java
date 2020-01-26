package bj;

import java.util.*;

public class buyCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for (int i=1; i<=n; i++) {
            a[i] = sc.nextInt();
        }
        int[] d = new int[n+1];
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                if (d[i] < d[i-j] + a[j]) {
                    d[i] = d[i-j] + a[j];
                }
            }
        }
        System.out.println(d[n]);
    }

}
