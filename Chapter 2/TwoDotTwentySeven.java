//CSCI3200 - Chapter 2 Assignment 2.27
//Matthew Johnston

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class TwoDotTwentySeven {
	public static void main(String[] args) {
		//Declare variables, and get matrix size
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter N for matrix size: ");
		int num = input.nextInt();
		boolean found = false;

		//Generate matrix
		int[][] matrix = new int[num][num];
		int[] ans = new int[2];
		int temp = 0;

		for (int i = 0; i < matrix.length; i++){
     		for (int j = 0; j < matrix[i].length; j++){
     			matrix[i][j] = temp;
     			temp++;
     		}
     	}
		
		//Get target value from user
		System.out.println("Enter a number to search for: ");
     	int target = input.nextInt();
     	
     	//Search for target and print results
     	ans = search(matrix, num-1, 0, target);
     	if(ans[0] == -1 || ans[1] == -1){
     		System.out.println(target  + " not found.");
     	}else{
     		System.out.println("Value found at index: " + "{" + ans[0] + ", " + ans[1] + "}");
     	}
     	
     	System.out.println("Matrix: ");
     	System.out.println(Arrays.deepToString(matrix).replace("], ", "]\n"));
	}

	public static int[] search(int[][] arr, int row, int col, int tar){
		int ans[] = {-1, -1};
     	if(row < 0 || col >= arr[row].length){
     		return ans;
     	}
	    if(arr[row][col] == tar){
	    	ans[0] = row;
	    	ans[1] = col;
	    	return ans;
	    }else if(arr[row][col] > tar){
	    	return search(arr, row-1, col, tar);
	    }
	    return search(arr, row, col+1, tar);
	}
}