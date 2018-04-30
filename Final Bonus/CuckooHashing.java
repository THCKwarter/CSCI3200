//Matthew Johnston & Walker Stipe

import java.util.Scanner;

public class CuckooHashing {
	public static void main(String[] args) {
		int testCases = 0;
		int size = 0;
		int elementCount = 0;
		int count = 1;
		String input = "";
		String[] elements;
		
		Scanner scan = new Scanner(System.in);
		
		//Get inputs
		System.out.println("Enter the number of test cases: ");
		testCases = scan.nextInt();
		
		System.out.println("Enter the size of the arrays: ");
		size = scan.nextInt();
		String[] arr1 = new String[size];
		String[] arr2 = new String[size];
		
		System.out.println("Enter the number of elements to be inserted: ");
		elementCount = scan.nextInt();
		elements = new String[elementCount];
		scan.nextLine();
		
		System.out.println("Enter elements as a group. Location 1, Location 2, like this: 05. Press enter after each group.");
		input = scan.nextLine();
		elements[0] = input;
		
		//Get all elements
		while(elementCount != 1) {
			System.out.println("Enter next element.");
			input = scan.nextLine();
			elements[count] = input;
			count++;
			elementCount--;
		}
		
		//Print elements - FOR TESTING
		/*
		System.out.print("{");
		for(String s : elements){
			System.out.print(s + ", ");
		}
		System.out.println("}");*/
		
		//Check elements for collisions
		int pos1 = 0;
		int pos2 = 0;
		boolean posOneOcc = false;
		boolean posTwoOcc = false;
		for(String e : elements) {
			pos1 = e.charAt(0);
			pos2 = e.charAt(1);
			
			//Check pos1 first
			if(arr1[pos1] != null) {
				posOneOcc = true;
			}else {
				arr1[pos1] = "Element";
			}
			
			//Check pos2
			if(arr2[pos2] != null) {
				posOneOcc = true;
			}else {
				arr2[pos2] = "Element";
			}
		}
	}
}