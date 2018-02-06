//CSCI3200 - Chapter 2 Assignment 2.8.1
//Matthew Johnston

import java.util.Random;

public class TwoDotEight{
	public static void main(String[] args) {
		int count = 0;
		while(count < 10){
			System.out.println("===============================");
			System.out.println("Sample #" + (count+1) + ":");
			System.out.println("#1, N=250 Runtime: " + alg(250));
			System.out.println("#1, N=500 Runtime: " + alg(500));
			System.out.println("#1, N=1,000 Runtime: " + alg(1000));
			System.out.println("#1, N=2,000 Runtime: " + alg(2000));
			count++;
		}
	}

	public static String alg(int n){
		Random rand = new Random();
		long startTime = System.nanoTime();
		int[] arr = new int[n];

		for(int i = 0; i < arr.length; i++) {
			int r = rand.nextInt(n+1);
			if(r == arr[i]){
				while(r == arr[i]){
					r = rand.nextInt(n+1);
				}
			}
			arr[i] = r;
		}

		long endTime = System.nanoTime();
		String output = String.format("%12.5f",((endTime-startTime)/Math.pow(10,9)));

		/* Testing print statement
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}*/
		return output;
	}
}