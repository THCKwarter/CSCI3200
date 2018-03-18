//CSCI3200 - Chapter 4 BinaryTreeFormula
//Matthew Johnston

/*
BinaryTreeFormula - Create methods for reading postfix and prefix formulas and storing them in the tree.
DO NOT convert prefix/postfix to infix before storing in the tree. 
Make the methods as efficient as possible. 
Include a tester class and make sure the tree is printed in all 3 formats after being populated from any of the three. 
Include Big-Oh notation for all 3 populate methods, and all 3 print methods.
*/

import java.util.Scanner;
public class BinaryTreeFormulaTester{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String choice = "";
		String input = "";

		//Get formula type and formula
		System.out.println("Select your format: (in/pre/post)");
		choice = scan.nextLine();
		System.out.println("Input your " + choice + "fix formula: ");
		input = scan.nextLine();

		//infix - ((a-d)+(b*c))
		//prefix - ++a*bc*+*defg
		//postfix abc*+de*f+g*+
		EquationBinaryTree tree = new EquationBinaryTree();
		if(choice.equals("in")){
			tree.populateFromInfix(input);
			System.out.println("==========================");
			System.out.println("Infix: " + tree.toInfix());
			System.out.println("Prefix: " + tree.toPrefix());
			System.out.println("Postfix: " + tree.toPostfix());
		}else if(choice.equals("pre")){
			tree.populateFromPrefix(input);
			System.out.println("==========================");
			System.out.println("Infix: " + tree.toInfix());
			System.out.println("Prefix: " + tree.toPrefix());
			System.out.println("Postfix: " + tree.toPostfix());
		}else if(choice.equals("post")){
			tree.populateFromPostfix(input);
			System.out.println("==========================");
			System.out.println("Infix: " + tree.toInfix());
			System.out.println("Prefix: " + tree.toPrefix());
			System.out.println("Postfix: " + tree.toPostfix());
		}else{
			System.out.println("Invalid input.");
		}
	}
}