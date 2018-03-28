
public class MyStack<E> {
	private MyNode<E> start;
	private int size;

	public MyStack(){
		start = null;
		size = 0;
	}
	public void push(E obj){
		insert(obj, 0);//constant runtime
	}
	public E pop(){
		return delete(0);//constant runtime
	}
	public E peek(){
		return get(0);//constant runtime
	}
	public boolean isEmpty(){
		return size == 0;
	}
	private String printList(){
		MyNode<E> current = start;
		String output = "[";
		while(current != null)
		{
			output += current.toString() + ", ";
			current = current.next;
		}
		output += "]";
		return output;
	}
	private void insert(E obj, int index){
		MyNode<E> temp = new MyNode<E>(obj);
		if(index <= 0 || size == 0){ //Insert at start
			if(start == null)
				start = temp;
			else{
				temp.next = start;
				start = temp;
			}
		}else{
			if(index > size)
				index = size;
			MyNode<E> current = start;
			for(int i = 1; i < index; i++){
				current = current.next;
			}
			temp.next = current.next;//rest of list comes after new value
			current.next = temp;//new value is after current
		}
		size++;
	}
	private void add(E obj){
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
	private E remove(E obj){
		if(start == null)//prevent runtime error on empty list
			return null;
		if(obj.equals(start.data)){ //first item needs to be deleted
			E temp = start.data;
			start = start.next;
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
				size--;
				return temp;
			}else//end of list, did not find value to delete
				return null;
		}
	}
	private E delete(int index){
		if(index < 0 || index >= size)
			return null;
		else{
			if(index == 0){
				E temp = start.data;
				start = start.next;
				size--;
				return temp;
			}else{
				MyNode<E> current = start;
				for(int i = 1; i < index; i++)
					current = current.next;
				E temp = current.next.data;
				current.next = current.next.next;
				size--;
				return temp;
			}
		}
	}
	private E find(E obj){
		if(start == null)//prevent runtime error on empty list
			return null;
		if(obj.equals(start.data)){
			return start.data;
		}else{
			MyNode<E> current = start;
			while(current.next != null && !current.next.data.equals(obj)){
				current = current.next;
			}
			if(current.next != null){
				return current.next.data;
			}
			else//end of list, did not find value to delete
				return null;
		}
	}
	private E get(int index){
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

	//Infix
	public String infix(String in){
		for(int i = 0; i < input.length; i++){
			char c = in.charAt(i);
			switch(c){
				case '(':
					push(c);
					break;
				case ')':
					break;
				case '+':
					break;
				case '-':
					break;
				case '*':
					break;
				case '/':
					break;
				default:
					break;
			}
		}
		return input;
	}
	
	//Postfix
	public String postfix(String input){
		return input;
	}

	private class MyNode<E>{
		MyNode<E> next = null;
		E data = null;
		public MyNode(E obj){
			next = null;
			data = obj;
		}
		public String toString(){
			return data.toString();
		}
		@Override
		public boolean equals(Object obj){
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