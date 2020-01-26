package bj;
import java.util.*;
public class bj_11057 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long[][] d = new long[n+1][11];

		for(int i=0; i<10; i++)
		{
			d[1][i] = 1;
		}
		for(int i=2; i<=n; i++)
		{
			for(int j = 0; j<=9; j++)
			{
				for(int k =0; k<=j; k++)
				{	
					d[i][j] += d[i-1][k];
				}
			}
		}
		for(int i = 0; i<10; i++)
		{
			d[n][10] += d[n][i];
		}
		System.out.println(d[n][10] % 10007);
	}

}
