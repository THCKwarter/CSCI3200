import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class SortingMethods {

	public static void insertSort(Comparable[] arr)
	{
		int hole = 0;
		int moveCount = 0;
		for(int position = 1; position < arr.length; position++)
		{
			Comparable temp = arr[position];
			for(hole = position; hole > 0 && temp.compareTo(arr[hole-1]) < 0;hole--)
			{
				arr[hole] = arr[hole-1];//move item before hole one space over
				moveCount++;
			}
			arr[hole] = temp;
		}
		//System.out.println("Move Count:" + moveCount);
	}
	public static void shellSort(Comparable[] arr)
	{
		//sort a shell at a time
		int hole;
		int moveCount = 0;
		for(int sequence = arr.length/2; sequence > 0; sequence /= 2)
		{
			//System.out.println("Shell:" + sequence);
			for(int i = sequence; i < arr.length; i++)//loop for each sub-list
			{
				Comparable temp = arr[i];
				for(hole = i; hole >= sequence &&
						temp.compareTo(arr[hole-sequence]) < 0; hole -= sequence)
				{
					arr[hole] = arr[hole-sequence];
					moveCount++;
				}
				arr[hole] = temp;
			}
		}
		//System.out.println("Shellsort Move Count:" + moveCount);
	}
	public static void heapSort(Comparable[] arr)
	{
		PriorityQueue<Comparable> heap = new PriorityQueue<>();
		heap.addAll(Arrays.asList(arr));
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = heap.poll();
		}
	}
	public static void mergeSort(Comparable[] arr)
	{
		//call mergeSort(arr, temp[], 0, length-1)
		mergeSort(arr, new Comparable[arr.length], 0, arr.length-1);
	}
	public static void mergeSort(Comparable[] arr, Comparable[] temp, int left, int right)
	{
		//if left < right
		if(left < right)
		{
			//find center
			int center = (left+right)/2;
			//call mergeSort on left half (left,center)
			mergeSort(arr, temp, left, center);
			//call mergeSort on right half (center+1,right)
			mergeSort(arr, temp, center+1, right);
			//call merge over left/right halves
			merge(arr, temp, left, center+1, right);
		}
	}
	public static void merge(Comparable[] arr, Comparable[] temp, int leftStart, int rightStart, int rightEnd)
	{
		//determine leftEnd
		int leftEnd = rightStart-1;
		//set temp array position (same as left start)
		int tempPos = leftStart;
		//determine number of elements (end - start + 1)
		int count = rightEnd - leftStart + 1;
		//while items left in both lists
		while(leftStart <= leftEnd && rightStart <= rightEnd)
		{
			//put smaller into temp array, move pointers forward
			if(arr[leftStart].compareTo(arr[rightStart]) < 0)
			{
				temp[tempPos] = arr[leftStart];
				tempPos++;
				leftStart++;
			}
			else
			{
				temp[tempPos] = arr[rightStart];
				tempPos++;
				rightStart++;
			}
		}
		//while items left in either list
		while(leftStart <= leftEnd)
		{
			//add left over items to end of temp array
			temp[tempPos] = arr[leftStart];
			tempPos++;
			leftStart++;
		}
		while(rightStart <= rightEnd)
		{
			//add left over items to end of temp array
			temp[tempPos] = arr[rightStart];
			tempPos++;
			rightStart++;
		}
		//merge temp data to original using number of items and rightEnd
		for(int i = 0; i < count; i++)
		{
			arr[rightEnd] = temp[rightEnd];
			rightEnd--;
		}
	}
	public static void quickSort(Comparable[] arr)
	{
		//convert array to list for processing
		//List<Integer> temp = Arrays.asList(arr);
		List<Comparable> temp = new ArrayList<>(arr.length);
		for(Comparable t : arr)
			temp.add(t);
		quickSort(temp);
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = temp.get(i);
		}
	}
	public static void quickSort(List<Comparable> list)
	{
		//if list has more than 1 item
		if(list.size() > 1)
		{
			//create 3 lists (smaller, same, larger)
			List<Comparable> smaller = new ArrayList<>();
			List<Comparable> same = new ArrayList<>();
			List<Comparable> larger = new ArrayList<>();

			//pick item for middle
			Comparable middle = list.get(0);

			//loop through list putting items into correct containers
			for(int i = 0; i < list.size(); i++)
			{
				if(middle.compareTo(list.get(i)) == 0)
				{
					same.add(list.get(i));
				}
				else if(middle.compareTo(list.get(i)) < 0)
				{
					larger.add(list.get(i));
				}
				else
				{
					smaller.add(list.get(i));
				}
			}

			//recursively sort smaller/larger
			quickSort(smaller);
			quickSort(larger);

			//put all items into original list [.clear(), .addAll()]
			list.clear();
			list.addAll(smaller);
			list.addAll(same);
			list.addAll(larger);
			/*
			int pos = 0;
			for(Integer temp : smaller)
			{
				list.set(pos, temp);
				pos++;
			}
			for(Integer temp : same)
			{
				list.set(pos, temp);
				pos++;
			}
			for(Integer temp : larger)
			{
				list.set(pos, temp);
				pos++;
			}
			*/
		}
	}
	public static void bucketSort(Integer[] arr, int min, int max)
	{
		//number of buckets
		int maxBuckets = max-min+1;
		//create buckets for range
		int[] buckets = new int[maxBuckets];
		//add each item from array to correct bucket counter (shift if needed)
		for(int i = 0; i < arr.length; i++)
		{
			buckets[arr[i]-min]++;
		}
		//run through buckets to refill array in correct order (shift back if needed)
		int index = 0;
		for(int i = 0; i < buckets.length; i++)
		{
			for(int j = 0; j < buckets[i]; j++, index++)
			{
				arr[index] = i+min;
				//index++;
			}
		}
	}
	public static void radixSortStringSameLength(String[] arr, int len)
	{
		//System.out.println("Initial:"+Arrays.toString(arr));
		//number of buckets (256 in character set)
		int maxBuckets = 256;

		//buckets need to be lists instead of counters
		ArrayList<String>[] buckets = new ArrayList[maxBuckets];

		//loop from end to beginning of strings (sort by last character first)
		for(int i = len-1; i >= 0; i--)
		{
			//loop through each string
			for(int j = 0; j < arr.length; j++)
			{
				if(buckets[arr[j].charAt(i)] == null)
					buckets[arr[j].charAt(i)] = new ArrayList<>();
				//add to appropriate bucket
				buckets[arr[j].charAt(i)].add(arr[j]);
			}
			//loop through buckets
			int index = 0;
			for(int j = 0; j < buckets.length; j++)
			{
				//add each string back to original
				for(int k = 0; buckets[j] != null && k < buckets[j].size(); k++, index++)
				{
					arr[index] = buckets[j].get(k);
					//index++;
				}
				if(buckets[j] != null)
					buckets[j].clear();
				//clear bucket
			}
			//System.out.println(i+":"+Arrays.toString(arr));
		}
	}
	public static void radixSortStringDiffLength(String[] arr)
	{
		//Use other radix sort method as a starting point
		//do not add any additional data structures/variables, but you can increase the number of buckets if you need to
	}
}