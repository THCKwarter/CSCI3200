import java.util.Scanner;

//Matthew Johnston & Walker Stipe

public class CuckooHashing{
	public static void main(String[] args){
		int testCases = 0;
		int size = 0;
		int elementCount = 0;
		String input = "";
		String[] elements;
		
		Scanner scan = new Scanner(System.in);
		
		//Get inputs
		System.out.println("Enter the number of test cases: ");
		testCases = scan.nextInt();
		
		System.out.println("Enter the size of the arrays: ");
		size = scan.nextInt();
		elements = new String[size];
		
		System.out.println("Enter the number of elements to be inserted: ");
		elementCount = scan.nextInt();
		
		System.out.println("Enter elements as a group. ID, Location 1, Location 2, like this: X05. Press enter after each group. (Type 'done' when finished.)");
		scan.next();
		input = scan.nextLine();
		elements[0] = input;
	}
}