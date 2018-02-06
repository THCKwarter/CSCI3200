//CSCI3200 - Chapter 1 Assignment 1.1
//Matthew Johnston

import java.util.Random;

public class OneDotOne{
	public static void main(String[] args) {
		//Variables
		Random rand = new Random();
		String k10, k100, k1000, k10000 = "";

		/* ============================= */
		//N = 10
		//Populate array of size n with random numbers
		int[] arrTen = new int[10];
		for(int i = 0; i < arrTen.length; i++) {
		    arrTen[i] = (rand.nextInt(10000) + 1);
		}

		//Begin timer and find kth element
		long startTime = System.nanoTime();
		arrTen = sortArray(arrTen);

		//End timer and store string
		long endTime = System.nanoTime();
		k10 = String.format("%12.5f",((endTime-startTime)/Math.pow(10,9)));

		/* ============================= */
		//N = 100
		//Populate array of size n with random numbers
		int[] arrHundred = new int[100];
		for(int i = 0; i < arrHundred.length; i++) {
		    arrHundred[i] = (rand.nextInt(10000) + 1);
		}

		//Begin timer and find kth element
		startTime = System.nanoTime();
		arrHundred = sortArray(arrHundred);

		//End timer and store string
		endTime = System.nanoTime();
		k100 = String.format("%12.5f",((endTime-startTime)/Math.pow(10,9)));

		/* ============================= */
		//N = 1000
		int[] arrThousand = new int[1000];
		for(int i = 0; i < arrThousand.length; i++) {
		    arrThousand[i] = (rand.nextInt(10000) + 1);
		}

		//Begin timer and find kth element
		startTime = System.nanoTime();
		arrThousand = sortArray(arrThousand);

		//End timer and store string
		endTime = System.nanoTime();
		k1000 = String.format("%12.5f",((endTime-startTime)/Math.pow(10,9)));

		/* ============================= */
		//N = 10000
		int[] arrHundThousand = new int[10000];
		for(int i = 0; i < arrHundThousand.length; i++) {
		    arrHundThousand[i] = (rand.nextInt(10000) + 1);
		}

		//Begin timer and find kth element
		startTime = System.nanoTime();
		arrHundThousand = sortArray(arrHundThousand);

		//End timer and store string
		endTime = System.nanoTime();
		k10000 = String.format("%12.5f",((endTime-startTime)/Math.pow(10,9)));

		/* ============================= */
		System.out.println("n     |      Runtime");
		System.out.println("====================");
		System.out.println("10    | " + k10);
		System.out.println("100   | " + k100);
		System.out.println("1000  | " + k1000);
		System.out.println("10000 | " + k10000);
	}

	public static int[] sortArray(int[] arr){
		for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) 
                    index = j;
      
            int smallerNumber = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
	}
}