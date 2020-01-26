package bj;
import java.util.*;
public class bj_11054 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+1];
		int[] d = new int[n+1];
		
		d[0] = 1;
		for(int i = 1; i<=n; i++)
		{
			a[i] = sc.nextInt();
		}
		
		d[1] = a[1];
		for(int i = 2; i<=n; i++)
		{
			d[i] = 1;
		}
	}

}
