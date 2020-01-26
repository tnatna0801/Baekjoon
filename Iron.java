package bj;
import java.util.*;
public class Iron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Stack<String> stack = new Stack<String>();
		int size = 0;
		int number = 1;
		
		String[] laser = (scan.nextLine()).split("");
		
		for(String str : laser)
		{
			if(str.equals("("))
			{
				stack.push(str);
			}
			else if(str.equals(")"))
			{
				if(stack.peek().equals("("))
				{
					if(size > 1)
					{
						number++;
					}
				}
				else
				{
					size++; //막대기 길이
				}
			}
		}
	}

}
