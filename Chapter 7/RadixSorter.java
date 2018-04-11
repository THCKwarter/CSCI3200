//CSCI3200 - Chapter 6 Assignment - RadixSort
//Matthew Johnston

import java.util.Arrays;

public class RadixSorter{
	public static void main(String[] args){
		/*Homework*/
		//{"abe", "bac", "abc", "bcaz", "bcaa"}
		String[] a2 = new String[]{"abe", "bac", "abc", "bcaz", "bcaa"};
		System.out.println("          Unsorted: " + Arrays.toString(a2) + "\n\n");
		SortingMethods.radixSortStringDiffLength(a2);
		System.out.println(" Radix Diff Length: " + Arrays.toString(a2) + "\n\n");
	}
}