//CSCI3200 - Chapter 3 Bonus Infix/Postfix
//Matthew Johnston

import java.util.Scanner;
public class FormatConverter {
	public static void main(String[] args) {
		MyStack<Character> stack = new MyStack<>();
		Scanner scan = new Scanner(System.in);
		String input = "";
		System.out.println("What format are you inputting? (infix/postfix)");
		String choice = scan.nextLine();
		System.out.println(choice);
		
		//1+2*(3-4)/5
		if(choice.equals("infix")){
			System.out.println("Input your infix function: ");
			input = scan.nextLine();
			System.out.println(stack.infix(input));
		}else if(choice.equals("postfix")){
			System.out.println("Input your infix function: ");
			input = scan.nextLine();
			System.out.println(stack.postfix(input));
		}else{
			System.out.println("Invalid command.");
		}
	}
}