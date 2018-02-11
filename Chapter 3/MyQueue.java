//CSCI3200 - Chapter 3 Assignment MyQueue
//Matthew Johnston
/*
public class MyQueue<E>{
	private MyNode<E> start;
	private int size;

	public MyQueue(){
		first = null;
		size = 0;
	}

	//Print List
	private String printList(){
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

	//Add new object to queue
	public void push(E obj){
		insert(obj, 0);//constant runtime
	}

	private void insert(E obj, int index){
		MyNode<E> temp = new MyNode<E>(obj);
		if(index <= 0 || size == 0){
			if(start == null)
				start = temp;
			else{
				temp.next = start;
				start = temp;
			}
		size++;
	}

	//MyNode
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
}*/