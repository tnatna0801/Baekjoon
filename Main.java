package bj;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int command_num;
		int top = 0;
		String command;
		Scanner scan = new Scanner(System.in);

		command_num = scan.nextInt();
		int[] stack = new int[command_num];

		while (command_num-- > 0) {
			command = scan.next();
			// System.out.println(command);
			// String[] tmp = command.split(" ");
			if (command.equals("push")) {
				stack[top] = scan.nextInt();
				//System.out.println(stack[top]);
				top++;
			} else if (command.equals("pop")) {
				if (top != 0) {
					System.out.println(stack[top - 1]);
					top--;
				}
				else
				{
					System.out.println(-1);
				}
			} else if (command.equals("size")) {
				System.out.println(top);
			} else if (command.equals("empty")) {
				if (top == 0) {

					System.out.println(1);

				} else
					System.out.println(0);
			} else if (command.equals("top")) {
				if (top == 0)
					System.out.println(-1);
				else
					System.out.println(stack[top - 1]);
			}
		}
	}

}
