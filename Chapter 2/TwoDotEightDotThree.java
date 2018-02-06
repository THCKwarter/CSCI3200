//CSCI3200 - Chapter 2 Assignment 2.8.2
//Matthew Johnston

import java.util.Random;

public class TwoDotEightDotThree{
	public static void main(String[] args) {
		int count = 0;
		while(count < 10){
			System.out.println("===============================");
			System.out.println("Sample #" + (count+1) + ":");
			System.out.println("#1, N=25,000 Runtime: " + alg(25000));
			System.out.println("#1, N=50,000 Runtime: " + alg(50000));
			System.out.println("#1, N=100,000 Runtime: " + alg(100000));
			System.out.println("#1, N=200,000 Runtime: " + alg(200000));
			System.out.println("#1, N=400,000 Runtime: " + alg(400000));
			System.out.println("#1, N=800,000 Runtime: " + alg(800000));
			count++;
		}
		System.out.println("===============================");
	}

	public static String alg(int n){
		Random rand = new Random();
		long startTime = System.nanoTime();
		int[] arr = new int[n];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}

		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr[rand.nextInt(i+1)];
		}

		long endTime = System.nanoTime();
		String output = String.format("%12.5f",((endTime-startTime)/Math.pow(10,9)));
		return output;
	}
}