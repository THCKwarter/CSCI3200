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
		operationCount += 2;
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
	public E getKth(int k){
		E kth = null;
		int count = k;
		System.out.println("Count: " + count);
		
		while(count != 0){
			kth = this.deleteMin();
			count--;
		}
			
		if(kth == null){
			System.out.println("Kth value was out of range.");
			return null;
		}else{
			return kth;
		}
	}
	public int getOpCount(){
		return operationCount;
	}
	
	public String toString()
	{
		String output = "Size:" + currentSize + "\n";

		//only print valid values
		output += "[";
		for(int i = 1; i <= currentSize; i++) {
			if(heap[i+1] == null){
				output += heap[i] + "]";
			}else{
				output += heap[i] + ", ";
			}
		}

		return output;
	}
	public void buildHeap()
	{
		int outsideCount = (currentSize/2);
		int perCount = 0;
		//start with lowest parent
		operationCount++;
		for(int i = currentSize / 2; i > 0; i--)
		{
			perCount += percolateDown(i);
		}
		operationCount += (outsideCount*perCount);
	}

	public void insert(E item)
	{
		//array is currently full, add next depth
		operationCount++;
		if( currentSize == heap.length - 1 ) {
			growArray(heap.length * 2);
			operationCount++;
		}
		
		operationCount++;
		currentSize++;
		operationCount++;
		int hole = currentSize;
		operationCount++;
		heap[0] = item;//store item in temporary location
		percolateUp(hole);

	}
	private void percolateUp(int pos)
	{
		operationCount++;
		E item = heap[0];
		int outsideCount = currentSize + 1;
		int insideCount = 0;
		//check if item is smaller than parent
		//pos/2 = parent, 11 and 10 divided by 2 = 5
		for(; item.compareTo(heap[pos/2]) < 0; pos = pos/2) {
			heap[pos] = heap[pos/2];
			insideCount++;
		}
		operationCount += (outsideCount*insideCount);
		//put item in final position
		operationCount++;
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
	private int percolateDown(int pos)
	{
		int perDownOpCount = 0;
		perDownOpCount++;
		int child;
		perDownOpCount++;
		E temp = heap[pos];
		
		int outsideCount = pos;
		int insideCount = 0;
		//check if there are children
		for(; pos*2 <= currentSize; pos = child)
		{
			insideCount++;
			child = pos*2;
			//is there 2 children
			//if there are check if second child is smaller
			insideCount++;
			if(child != currentSize && heap[child+1].compareTo(heap[child]) < 0) {
				child++;
				insideCount++;
			}
				
			//smaller child compare to parent
			insideCount++;
			if(heap[child].compareTo(temp) < 0){
				insideCount++;
				heap[pos] = heap[child];
			}else{
				break;
			}
		}
		perDownOpCount++;
		heap[pos] = temp;
		
		perDownOpCount += (outsideCount*insideCount);
		return perDownOpCount;
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
		operationCount++;
		growArray(heap.length << 1);
	}
	private void growArray(int newSize)
	{
		operationCount++;
		E[] old = heap;
		operationCount++;
		heap = (E []) new Comparable[ newSize ];
		
		int insideCount = 0;
		int outsideCount = currentSize + 1;
        for( int i = 1; i <= currentSize; i++ ) {
        	insideCount++;
        	heap[ i ] = old[ i ];
        }
        operationCount += (outsideCount*insideCount);
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