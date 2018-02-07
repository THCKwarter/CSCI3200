//CSCI3200 - Chapter 3 Assignment 3.6
//Matthew Johnston

import java.util.Scanner;
import java.util.Random;
public class ThreeDotSix {
	public static void main(String[] args) {
		//Variables + Get N from user
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Enter number of people: ");
		int size = scan.nextInt();
		int remaining = size;
		int count = 0;
		int pos = 0;
		int m = rand.nextInt(size);
		System.out.println("M: " + m);

		//Add N people
		MySingleLinkedList<Integer> mll = new MySingleLinkedList<>();
		while(count < size){
			mll.add(count+1);
			count++;
		}
		System.out.println("Starting players: " + mll.printList());

		//Eliminate each Mth player
		count = 0;
		while(remaining > 1){ //O(N+N+N) = O(N)
			if(m == pos){
				System.out.println("Player " + mll.get(count) + " eliminated.");
				mll.delete(count);
				System.out.println("Remaining players: " + mll.printList());
				remaining--;
				size--;
				count--;
				pos = 0;
			}else{
				pos++;
			}
			if(count < (size-1)){
				count++;
			}else if(count >= (size-1)){
				count = 0;
			}
		}

		System.out.println("The winner is player " + mll.get(0));
		System.out.println("Solution runs in O(N) time.");
	}
}