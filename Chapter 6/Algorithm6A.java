//CSCI3200 - Chapter 6 Assignment - Algorithm 6A
//Matthew Johnston

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Algorithm6A{
	public static void main(String[] args){
		//Variables
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int sizePrompt = 0;
		int kValue = 0;
		int randRange = 0;
		
		//Get size of heap and value of k
		System.out.println("How big should the heap be? (Less than 100 recommended. The entire heap will be printed.)");
		sizePrompt = scan.nextInt();
		randRange = (sizePrompt*5);
		System.out.println("Select the kth smallest element to retrieve: (Range: 1-" + sizePrompt + ")");
		kValue = scan.nextInt();
		
		//Fill Array & Build Heap
		Integer[] arr = new Integer[sizePrompt];
		for(int i = 0; i < arr.length; i++){arr[i] = rand.nextInt(randRange);}
		MyBinaryHeap<Integer> mbh = new MyBinaryHeap<>(arr);
		
		//Show heap
		System.out.println("\n== Heap Contents ==");
		System.out.println(mbh);
		
		//Output kth element
		System.out.println("\n== Retrieving Kth ==");
		System.out.println("The kth (" + kValue + ") smallest element out of " + sizePrompt + " elements was: " + mbh.getKth(kValue));
	}
}