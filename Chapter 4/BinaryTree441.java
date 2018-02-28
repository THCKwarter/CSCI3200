import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree441<E extends Comparable<? super E>>
{
	private Node root;
	public BinaryTree441()
	{
		root = null;
	}
	
	//Level Print
	/*
	 * add a method to print all the nodes in level order (root, all nodes at depth 1[root's children], 
	 * all nodes at depth 2, etc) Make sure the method runs in O(N), and show that it does with comments 
	 * about runtime at each step in your method.
	 */
	
    //Iterative method to do level order traversal line by line
	public String printByLevel(){
		return printLevelOrder(root);
	}
    private String printLevelOrder(Node root){
    	Queue<Node> q =new LinkedList<Node>();
    	String output = "";
    	
        //Base case
        if(root == null){
        	return "Empty tree";
        }
        
        q.add(root);

        while(true){
            int nodeCount = q.size(); //# of nodes at current level
            if(nodeCount == 0)
                break;

            while(nodeCount > 0){ //Dequeue current level, enqueue next level
                Node node = q.peek();
                output += node.data + " ";
                q.remove();
                if(node.left != null)
                    q.add(node.left);
                if(node.right != null)
                    q.add(node.right);
                nodeCount--;
            }
            output += "\n";
            return output;
        }
        return "How?";
    }
	
	public boolean contains(E val)
	{
		return contains(val, root);
	}
	private boolean contains(E val, Node curr)
	{
		if(curr == null)
			return false;
		int compare = val.compareTo(curr.data);//zero = same, positive = greater, negative = smaller

		if(compare == 0)
		{
			return true;
		}
		else if(compare > 0)
		{
			return contains(val, curr.right);
		}
		else
		{
			return contains(val, curr.left);
		}
	}
	public E findMin()
	{
		if(root == null)
		{
			return null;
		}
		else
		{
			return findMin(root).data;
		}
	}
	private Node findMin(Node curr)
	{
		if(curr.left != null)
		{
			return findMin(curr.left);
		}
		else
		{
			return curr;
		}
	}
	public E findMax()
	{
		if(root == null)
		{
			return null;
		}
		else
		{
			return findMax(root).data;
		}
	}
	private Node findMax(Node curr)
	{
		if(curr.right != null)
		{
			return findMin(curr.right);
		}
		else
		{
			return curr;
		}
	}
	public void insert(E val)
	{
		root = insert(val, root);
	}
	private Node insert(E val, Node curr)
	{
		if(curr == null)
			return new Node(val);
		int compare = val.compareTo(curr.data);//zero = same, positive = greater, negative = smaller

		if(compare == 0)//update
		{
			curr.data = val;
			return curr;
		}
		else if(compare > 0)
		{
			curr.right = insert(val, curr.right);
			return curr;
		}
		else
		{
			curr.left = insert(val, curr.left);
			return curr;
		}
	}
	public void printInOrder()
	{
		printInOrder(root);
		System.out.println();
	}
	private void printInOrder(Node curr)
	{
		if(curr != null)
		{
		//left
			printInOrder(curr.left);
		//curr
			System.out.print(curr.data+", ");
		//right
			printInOrder(curr.right);
		}
	}

	public String toString()
	{
		return toString(root);
	}
	private String toString(Node curr)
	{
		if(curr == null)
			return "";
		else{
			return curr.data.toString() + ": LEFT:" + toString(curr.left) + ": RIGHT:" + toString(curr.right);
		}
	}
	public void remove(E val)
	{
		root = remove(val, root);
	}
	public Node remove(E val, Node curr)
	{
		if(curr == null)
			return null;
		int compare = val.compareTo(curr.data);//zero = same, positive = greater, negative = smaller
		if(compare > 0)
		{
			curr.right = remove(val, curr.right);
			return curr;
		}
		else if(compare < 0)
		{
			curr.left = remove(val, curr.left);
			return curr;
		}
		else
		{
			//no children
			if(curr.left == null && curr.right == null)
			{
				return null;
			}
			else if(curr.left == null || curr.right == null)//one child
			{
				return (curr.left != null)? curr.left : curr.right;
			}
			else//two children
			{
				curr.data = findMin(curr.right).data;
				curr.right = remove(curr.data, curr.right);

				return curr;
			}

		}
	}

	private class Node{
		E data;
		Node left, right;
		public Node(E d)
		{
			data = d;
			left = null;
			right = null;
		}
	}
}