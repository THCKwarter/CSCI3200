public class BinaryTree416<E extends Comparable<? super E>>{
	private Node root;
	public BinaryTree416(){
		root = null;
	}
	public boolean contains(E val){
		return contains(val, root);
	}
	private boolean contains(E val, Node curr){
		if(curr == null || curr.deleted)
			return false;
		int compare = val.compareTo(curr.data);//zero = same, positive = greater, negative = smaller

		if(compare == 0){
			return true;
		}else if(compare > 0){
			return contains(val, curr.right);
		}else{
			return contains(val, curr.left);
		}
	}
	public E findMin(){ //Recursive
		if(root == null || root.deleted){
			return null;
		}else{
			return findMin(root).data;
		}
	}
	private Node findMin(Node curr){ //Recursive
		if(curr.left != null || curr.left.deleted){
			return findMin(curr.left);
		}else{
			return curr;
		}
	}
	public E findMax(){ //Recursive
		if(root == null){
			return null;
		}else{
			return findMax(root).data;
		}
	}
	private Node findMax(Node curr){ //Recursive
		if(curr.right != null){
			return findMin(curr.right);
		}else{
			return curr;
		}
	}
	public void insert(E val){
		root = insert(val, root);
	}
	private Node insert(E val, Node curr){
		if(curr == null || curr.deleted)
			return new Node(val);
		int compare = val.compareTo(curr.data);//zero = same, positive = greater, negative = smaller

		if(compare == 0 || curr.deleted){ //update
			curr.data = val;
			return curr;
		}else if(compare > 0){
			curr.right = insert(val, curr.right);
			return curr;
		}else{
			curr.left = insert(val, curr.left);
			return curr;
		}
	}
	public void printInOrder(){
		printInOrder(root);
		System.out.println();
	}
	private void printInOrder(Node curr){
		if(curr.deleted == false || curr != null){
		//left
			printInOrder(curr.left);
		//curr
			System.out.print(curr.data+", ");
		//right
			printInOrder(curr.right);
		}
	}

	public String toString(){
		return toString(root);
	}
	private String toString(Node curr){
		if(curr == null || curr.deleted)
			return "";
		else{
			return curr.data.toString() + ": LEFT:" + toString(curr.left) + ": RIGHT:" + toString(curr.right);
		}
	}
	public void remove(E val){
		root = remove(val, root);
	}
	public Node remove(E val, Node curr){
		if(curr == null || curr.deleted)
			return null;
		int compare = val.compareTo(curr.data);//zero = same, positive = greater, negative = smaller
		if(compare > 0){
			curr.right = remove(val, curr.right);
			return curr;
		}else if(compare < 0){
			curr.left = remove(val, curr.left);
			return curr;
		}else{
			//no children
			if((curr.left == null && curr.right == null) || (curr.left.deleted && curr.right.deleted)){
				return null;
			}else if(curr.left == null || curr.right == null || curr.left.deleted || curr.right.deleted){ //one child
				return (curr.left != null || curr.left.deleted)? curr.left : curr.right;
			}else{ //two children
				curr.data = findMin(curr.right).data;
				curr.right.deleted = true;

				return curr;
			}

		}
	}

	private class Node{
		E data;
		boolean deleted;
		Node left, right;
		public Node(E d){
			data = d;
			deleted = false;
			left = null;
			right = null;
		}
	}
}