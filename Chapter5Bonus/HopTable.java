//CSCI3200 - Chapter 5 Bonus - Hopscotch Hash Table
//Matthew Johnston

public class HopTable<E>{
	//Variables
	private int tableSize;
	private int hopRange;
	private int occupied;
	private int totalSize;
	private Entry<E>[] array;
	
	//Constructors
	public HopTable(){
		tableSize = 10;
		hopRange = 4;
		createArray(tableSize);
	}
	public HopTable(int hops){
		tableSize = 10;
		hopRange = hops;
		createArray(tableSize);
	}
	public HopTable(int hops, int size){
		tableSize = size;
		hopRange = hops;
		createArray(tableSize);
	}
	
	//Insert
	public boolean insert(E e){
		if(!isEmpty()){
			return false;
		}
		
		int currentPos = findPos(e);
		
		if(currentPos == -1){
			return false;
		}
		
		if(array[currentPos] != null){
			e = array[currentPos].element;
			array[currentPos].isActive = true;
		}
		
		String hope;
		if(array[currentPos] != null){
			hope = array[currentPos].hope;
			e = array[currentPos].element;
		}else{
			hope = "10000000";
		}
		
		array[currentPos] = new Entry<>(e, hope, true);
		totalSize++;
		
		return true;
	}
	
	private int myHash(E e){
		int hashVal = e.hashCode();
		
		hashVal %= array.length;
		if(hashVal < 0){
			hashVal += array.length;
		}
		return hashVal;
	}
	
	//Create array
	private void createArray(int size){
		array = new Entry[size];
	}
	
	//Empty Array
	private void emptyArray(){
		occupied = 0;
		for(int i = 0; i < array.length; i++){
			array[i] = null;
		}
	}
	
	private static class Entry<E>{
		public E element;
		public String hope;
		public boolean isActive;
		
		public Entry(E e){
			this(e, true);
		}
		public Entry(E e, boolean b){
			element = e;
			isActive = b;
		}
		public Entry(E e, String h, boolean b){
			element = e;
			hope = h;
			isActive = b;
		}
	}
}
