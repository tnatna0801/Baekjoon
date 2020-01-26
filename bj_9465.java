package bj;
import java.util.*;
public class bj_9465 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T= sc.nextInt();
		int n = sc.nextInt();
		int[][]	a = new int[2][n+1];
		int[]d = new int[n+1];
		
		for(int i = 0; i<2; i++)
		{
			for(int j = 0; j<=n; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i<2; i++)
		{
			for(int j = 1; j<=n; j++)
			{
				d[j] = Math.max(a[0][j-1], a[1][j-1]); 
			}
		}
	}

}
