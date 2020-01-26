package bj;

import java.util.Scanner;
import java.util.Stack;

public class VPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		Scanner scan = new Scanner(System.in);
		boolean check = true;
		int testNum = scan.nextInt();
		scan.skip("(\r\n|[\r\n\u2028\u2029\u0085])?");
		
		
		while(testNum-- > 0)
		{
			String str = scan.nextLine();
			String[] tmp = str.split("");
			
			for(int i = 0; i < tmp.length; i++)
			{
				if(tmp[i].equals("("))
				{
					stack.push(tmp[i]);
				}
				else if(tmp[i].equals(")"))
				{
					if(!stack.isEmpty())
					{
						stack.pop();
					}
					else
					{
						check = false;
						break;
					}
				}
			}
			
			if(check && stack.isEmpty())
			{
				System.out.println("yes");
			}
			else
			{
				System.out.println("no");
			}
			check = true;
		}
	}

}
