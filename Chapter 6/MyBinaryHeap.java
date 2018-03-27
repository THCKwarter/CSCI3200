import java.util.Arrays;

public class MyBinaryHeap<E extends Comparable<? super E>> {
	private static final int DEFAULT_CAPACITY = 4;
	private int currentSize;
	private E[] heap;
	private int operationCount = 0;

	public MyBinaryHeap()
	{
		this(DEFAULT_CAPACITY);
	}
	public MyBinaryHeap(int size)
	{
		currentSize = 0;
		heap = (E[]) new Comparable[ nextSize(size) ];
	}
	public MyBinaryHeap(E[] items)
	{
		operationCount++;
		currentSize = items.length;
		//create heap with enough space
		operationCount++;
		heap = (E[]) new Comparable[ nextSize(items.length) ];
		//put all items into structure out of order
		operationCount++;//initialize i = 0
		operationCount++;//first comparison
		for(int i = 0; i < items.length; i++)
		{
			operationCount+=2;//add and assignment
			heap[i+1] = items[i];

			operationCount++;//increment i
			operationCount++;//comparison
		}
		//fix heap structure
		buildHeap();//add operation counts to this method
	}
	public String toString()
	{
		String output = "Size:" + currentSize + "\n";

		//output += Arrays.toString(heap);//for testing

		//only print valid values
		for(int i = 1; i <= currentSize; i++)
			output += heap[i] +", ";

		return output;
	}
	public void buildHeap()
	{
		//start with lowest parent
		for(int i = currentSize / 2; i > 0; i--)
		{
			percolateDown(i);
		}
	}

	public void insert(E item)
	{
		//array is currently full, add next depth
		if( currentSize == heap.length - 1 )
			growArray(heap.length * 2);

		currentSize++;
		int hole = currentSize;
		heap[0] = item;//store item in temporary location
		percolateUp(hole);

	}
	private void percolateUp(int pos)
	{
		E item = heap[0];
		//check if item is smaller than parent
		//pos/2 = parent, 11 and 10 divided by 2 = 5
		for(; item.compareTo(heap[pos/2]) < 0; pos = pos/2)
			heap[pos] = heap[pos/2];
		//put item in final position
		heap[pos] = item;
	}

	public E deleteMin()
	{
		if(currentSize == 0)
			return null;
		//smallest item
		E temp = heap[1];

		//move last item to the root
		heap[1] = heap[currentSize];
		currentSize--;

		//shift last item down to where it belongs
		percolateDown(1);

		//return smallest item
		return temp;
	}
	private void percolateDown(int pos)
	{
		int child;
		E temp = heap[pos];
		//check if there are children
		for(; pos*2 <= currentSize; pos = child)
		{
			child = pos*2;
			//is there 2 children
			//if there are check if second child is smaller
			if(child != currentSize &&
					heap[child+1].compareTo(heap[child]) < 0)
				child++;
			//smaller child compare to parent
			if(heap[child].compareTo(temp) < 0)
				heap[pos] = heap[child];
			else
				break;
		}
		heap[pos] = temp;
	}
	public E findMin()
	{
		if(currentSize == 0)
			return null;
		return heap[1];
	}

	public boolean isEmpty()
	{
		return currentSize == 0;
	}
	public void makeEmtpy()
	{
		currentSize = 0;

	}
	private void growArray()
	{
		growArray(heap.length << 1);
	}
	private void growArray(int newSize)
	{
		E[] old = heap;
		heap = (E []) new Comparable[ newSize ];
        for( int i = 1; i <= currentSize; i++ )
        	heap[ i ] = old[ i ];
	}
	private int nextSize()
	{
		return heap.length << 1;//same as heap.length * 2
	}
	private int nextSize(int size)
	{
		return 1 << Integer.toBinaryString(size).length();
	}
}