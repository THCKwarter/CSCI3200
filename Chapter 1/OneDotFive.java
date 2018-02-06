//CSCI3200 - Chapter 1 Assignment 1.5
//Matthew Johnston

import java.util.Scanner;

public class OneDotFive {
	public static void main(String[] args) {
		//Read in a number and convert to int
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a positive number: ");
		String input = scan.nextLine();
		int num = Integer.parseInt(input);

		//Recursive conversion to binary
		int oneCount = 0;
		oneCount = recur(num, oneCount);

		//Print result
		System.out.println("In binary, your number contains " + oneCount + " one(s).");
	}

	//Recursive function
	public static int recur(int n, int count){
		if(n == 0){
			return count;
		}else if(n == 1){
			count++;
			return count;
		}else{
			if(n%2 == 0){
				n = n/2;
			}else{
				count++;
				n = n/2;
			}
			return recur(n, count);
		}
	}
}