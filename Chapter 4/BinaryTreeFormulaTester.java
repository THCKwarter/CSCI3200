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
		System.out.println("What -fix format are you inputting? (in/pre/post)");
		choice = scan.nextLine();
		System.out.println("Input your " + choice + "fix formula: ");
		input = scan.nextLine();

		//infix - ((a-d)+(b*c))
		//prefix - (+(-ad)(*bc))
		//postfix ((ad-)(bc*)+)
		if(choice.equals("in")){
			EquationBinaryTree inTree = new EquationBinaryTree();
			inTree.populateFromInfix(input);
			System.out.println("Infix: " + inTree.toInfix());
			System.out.println("Prefix: " + inTree.toPrefix());
			System.out.println("Postfix: " + inTree.toPostfix());
		}else if(choice.equals("pre")){
			EquationBinaryTree preTree = new EquationBinaryTree();
			preTree.populateFromPrefix(input);
			System.out.println("Infix: " + preTree.toInfix());
			System.out.println("Prefix: " + preTree.toPrefix());
			System.out.println("Postfix: " + preTree.toPostfix());
		}else if(choice.equals("post")){
			EquationBinaryTree postTree = new EquationBinaryTree();
			postTree.populateFromPostfix(input);
		}else{
			System.out.println("Invalid input.");
		}
	}
}