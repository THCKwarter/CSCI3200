public class MyDoubleLinkedList<E> {
	private MyNode<E> start, end;
	private int size;

	//Constructor
	public MyDoubleLinkedList(){
		start = null;
		size = 0;
	}

	//Print List Method
	public String printList()
	{
		MyNode<E> current = start;
		String output = "[";
		while(current != null){
			if(current.next == null){
				output += current.toString();
			}else{
				output += current.toString() + ", ";
			}
			current = current.next;
		}
		output += "]";
		return output;
	}

	//Print List (in reverse) Method
	public String printListRev(){
		MyNode<E> current = end;
		String output = "[";
		while(current != null){
			if(current.prev == null){
				output += current.toString();
			}else{
				output += current.toString() + ", ";
			}
			current = current.prev;
		}
		output += "]";
		return output;
	}

	// =============================== //
	// Operation Methods
	// =============================== //
	//Insert Method
	public void insert(E obj, int index){
		MyNode<E> temp = new MyNode<E>(obj);
		if(index <= 0 || size == 0){ //insert at start
			if(start == null){
				start = temp;
				end = temp;
			}else{
				temp.next = start;
				start.prev = temp;
				start = temp;
			}
		}else if(index >= size){ //end
			temp.prev = end;
			end.next = temp;
			end = temp;
		}else{ //middle
			if(index > size)
				index = size;
			MyNode<E> current = start;
			for(int i = 1; i < index; i++){
				current = current.next;
			}
			temp.next = current.next;//rest of list comes after new value
			temp.prev = current;
			current.next = temp;//new value is after current
			temp.next.prev = temp;
		}
		size++;
	}

	//Add Method
	public void add(E obj){
		insert(obj, size);
	}

	/*
	 * Test edge cases:
	 * 0 -> 1 -> 2 -> 3
	 * delete 1 (middle)
	 * 0 -> 2 -> 3
	 * delete 0 (begin)
	 * 2 -> 3
	 * delete 3 (end)
	 * 2
	 */
	//Remove Method
	public E remove(E obj){
		if(start == null)//prevent runtime error on empty list
			return null;
		if(obj.equals(start.data)){ //first item needs to be deleted
			E temp = start.data;
			start = start.next;
			if(start != null){
				start.prev = null;
			}
			size--;
			return temp;
		}else{
			MyNode<E> current = start;
			while(current.next != null && !current.next.data.equals(obj)){
				current = current.next;
			}
			if(current.next != null){
				E temp = current.next.data;
				current.next = current.next.next;
				if(current.next != null){
					current.next.prev = current;
				}else{
					end = current;
				}
				size--;
				return temp;
			}
			else//end of list, did not find value to delete
				return null;
		}
	}

	//Delete Method
	public E delete(int index){
		if(index < 0 || index >= size)
			return null;
		else{
			if(index == 0){ //start
				E temp = start.data;
				start = start.next;
				if(start != null){
					start.prev = null;
				}
				else{ //if last item removed, list is now empty
					end = null;
				}
				size--;
				return temp;
			}else if(index == size-1){ //end
				E temp = end.data;
				end = end.prev;
				if(end != null){
					end.next = null;
				}
				size--;
				return temp;
			}
			else{ //middle
				MyNode<E> current = start;
				for(int i = 1; i < index; i++)
					current = current.next;
				E temp = current.next.data;
				current.next = current.next.next;
				current.next.prev = current;
				size--;
				return temp;
			}
		}
	}

	//Find Method
	public E find(E obj){
		if(start == null)//prevent runtime error on empty list
			return null;
		if(obj.equals(start.data)){ //first item needs to be deleted
			return start.data;
		}else{
			MyNode<E> current = start;
			while(current.next != null && !current.next.data.equals(obj)){
				current = current.next;
			}
			if(current.next != null){
				return current.next.data;
			}else//end of list, did not find value to delete
				return null;
		}
	}

	//Find Last Method
	public E findLast(E obj){
		if(start == null)//prevent runtime error on empty list
			return null;
		if(obj.equals(end.data)){ //first item needs to be deleted
			return end.data;
		}else{
			MyNode<E> current = end;
			while(current.prev != null && !current.prev.data.equals(obj)){
				current = current.prev;
			}
			if(current.prev != null){
				return current.prev.data;
			}else//end of list, did not find value to delete
				return null;
		}
	}

	//Get Method
	public E get(int index){
		if(index < 0 || index >= size)
			return null;
		else{
			if(index == 0){
				return start.data;
			}else{
				MyNode<E> current = start;
				for(int i = 1; i < index; i++)
					current = current.next;
				return current.next.data;
			}
		}
	}

	//Swap Method
	//Swap Method
	public E swap(int index1, int index2){
		if(index1 < 0 || index1 >= size || index2 < 0 || index2 >= size)
			return null;

		MyNode<E> temp1 = new MyNode<E>(get(index1));
		MyNode<E> temp2 = new MyNode<E>(get(index2));
		MyNode<E> current = start;
		System.out.println("Swapping: " + temp1 + " and " + temp2);
		
		if(index1 == 0){
			temp2.next = start.next;
			start = temp2;

			current = start;
			for(int i = 1; i < index2; i++){
				current = current.next;
			}
			temp1.next = current.next.next;
			current.next = temp1;
		}else if(index2 == 0){
			temp1.next = start.next;
			start = temp1;

			current = start;
			for(int i = 1; i < index1; i++){
				current = current.next;
			}
			temp2.next = current.next.next;
			current.next = temp2;
		}else{
			current = start;
			for(int i = 1; i < index1; i++){
				current = current.next;
			}
			temp2.next = current.next.next;
			current.next = temp2;

			current = start;
			for(int i = 1; i < index2; i++){
				current = current.next;
			}
			temp1.next = current.next.next;
			current.next = temp1;
		}
		return null;
	}

	//MyNode Class
	private class MyNode<E>{
		MyNode<E> next = null;
		MyNode<E> prev = null;
		E data = null;
		public MyNode(E obj){
			next = null;
			prev = null;
			data = obj;
		}

		public String toString(){
			return data.toString();
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			MyNode<E> other = (MyNode<E>) obj;
			return data.equals(other.data);
		}
	}
}