package bj;

import java.util.*;
public class wordReverse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Stack<String> stack = new Stack<String>();
		String[] strArray = (scan.nextLine()).split("");
		
		for(int i = 0; i < strArray.length; i++)
		{
			if(!strArray[i].equals(" "))
			{
				if(strArray[i].equals("<"))
				{
					if(!stack.isEmpty())
					{
						printStack(stack);
					}
					while(!strArray[i].equals(">"))
					{
						System.out.print(strArray[i]);
						i++;
					}
					System.out.print(strArray[i]);
				}
				else
				{
					stack.push(strArray[i]);
				}
			}
			else
			{
				printStack(stack);
				System.out.print(" ");
			}
		}
		printStack(stack);
		
	}
	
	static void printStack(Stack<String> s)
	{
		while(!s.isEmpty())
		{
			System.out.print(s.peek());
			s.pop();
		}
	}

}
