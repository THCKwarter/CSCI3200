//CSCI3200 - Chapter 6.12 Assignment - Heaps
//Matthew Johnston
//Hopefully you use the dark theme,
//otherwise this is going to be
//a little bright on the eyes.

import java.util.Arrays;
import java.util.Random;
public class SixDotTwelve{
	public static void main(String[] args){
		//Variables
		Random rand = new Random();
		Integer[] n10 = new Integer[10];
		Integer[] n25 = new Integer[25];
		Integer[] n50 = new Integer[50];
		Integer[] n100 = new Integer[100];
		MyBinaryHeap<Integer> mbh10 = new MyBinaryHeap<>(10);
		MyBinaryHeap<Integer> mbh25 = new MyBinaryHeap<>(25);
		MyBinaryHeap<Integer> mbh50 = new MyBinaryHeap<>(50);
		MyBinaryHeap<Integer> mbh100 = new MyBinaryHeap<>(100);
		
		//Fill arrays
		for(int i = 0; i < n10.length; i++){n10[i] = rand.nextInt(50);}
		for(int i = 0; i < n25.length; i++){n25[i] = rand.nextInt(125);}
		for(int i = 0; i < n50.length; i++){n50[i] = rand.nextInt(250);}
		for(int i = 0; i < n100.length; i++){n100[i] = rand.nextInt(500);}
		
		//Single Insert
		for(int i = 0; i < n10.length; i++){mbh10.insert(n10[i]);}
		for(int i = 0; i < n25.length; i++){mbh25.insert(n25[i]);}
		for(int i = 0; i < n50.length; i++){mbh50.insert(n50[i]);}
		for(int i = 0; i < n100.length; i++){mbh100.insert(n100[i]);}
		
		//Bulk Insert
		MyBinaryHeap<Integer> mbh10B = new MyBinaryHeap<>(n10);
		MyBinaryHeap<Integer> mbh25B = new MyBinaryHeap<>(n25);
		MyBinaryHeap<Integer> mbh50B = new MyBinaryHeap<>(n50);
		MyBinaryHeap<Integer> mbh100B = new MyBinaryHeap<>(n100);
	}
}