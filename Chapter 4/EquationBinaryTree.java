public class EquationBinaryTree {
	private Node root;
	public EquationBinaryTree(){
		root = null;
	}

	//toInfix
	public String toInfix(){
		return toInfixHelper(root);
	}
	private String toInfixHelper(Node node){
		String output = "";
		if(node.leftChild != null){
			output += "(";
			output += toInfixHelper(node.leftChild);
			output += node;
			output += toInfixHelper(node.rightChild);
			output += ")";
		}else
			output += node;
		return output;
	}

	//toPrefix
	public String toPrefix(){
		return toPrefixHelper(root);
	}
	private String toPrefixHelper(Node node){
		String output = "";
		if(node.leftChild != null){
			output += node;
			output += toPrefixHelper(node.leftChild);
			output += toPrefixHelper(node.rightChild);
		}else
			output += node;
		return output;
	}

	//toPostfix
	public String toPostfix(){
		return toPostfixHelper(root);
	}
	private String toPostfixHelper(Node node){
		String output = "";
		if(node.leftChild != null){
			output += toPostfixHelper(node.leftChild);
			output += toPostfixHelper(node.rightChild);
			output += node;
		}else
			output += node;
		return output;
	}

	//======================================
	//Populate with infix function
	public void populateFromInfix(String infix){
		root = populateFromInfixHelper(infix);
	}
	private Node populateFromInfixHelper(String infix){
		String[] parts = infixBreakdownHelper(infix);
		Node temp = new Node(parts[1].charAt(0));
		if(parts[0].length() == 1)
			temp.leftChild = new Node(parts[0].charAt(0));
		else
			temp.leftChild = populateFromInfixHelper(parts[0]);

		if(parts[2].length() == 1)
			temp.rightChild = new Node(parts[2].charAt(0));
		else
			temp.rightChild = populateFromInfixHelper(parts[2]);
		return temp;
	}
	private String[] infixBreakdownHelper(String infix){
		String[] temp = new String[3];
		int pos = 0;
		int count = 0;
		for(int i = 1; i < infix.length(); i++){
			if(infix.charAt(i) == '(')
				count++;
			else if(infix.charAt(i) == ')')
				count--;
			if(count == 0){
				pos = i;
				break;
			}
		}
		temp[0] = infix.substring(1, pos+1);//left
		temp[1] = ""+infix.charAt(pos+1);//middle
		temp[2] = infix.substring(pos+2, infix.length()-1);//right
		return temp;
	}
	
	//======================================
	//Prefix - (+2+11) - (++a*bc*+*defg)
	public void populateFromPrefix(String pre){
		root = populateFromPrefixHelper(pre);
	}
	private Node populateFromPrefixHelper(String pre){
		String[] parts = prefixBreakdownHelper(pre);
		Node temp = new Node(parts[0].charAt(0));
		if(parts[1].length() == 1)
			temp.leftChild = new Node(parts[1].charAt(0));
		else
			temp.leftChild = populateFromPrefixHelper(parts[1]);

		if(parts[2].length() == 1)
			temp.rightChild = new Node(parts[2].charAt(0));
		else
			temp.rightChild = populateFromPrefixHelper(parts[2]);
		return temp;
	}
	private String[] prefixBreakdownHelper(String pre){
		System.out.println("String pre: " + pre);
		String[] temp = new String[3];
		int pos = 0;
		int count = 0;
		for(int i = 1; i < pre.length(); i++){
			if(pre.charAt(i) == '(')
				count++;
			else if(pre.charAt(i) == ')')
				count--;
			if(count == 0){
				pos = i;
				break;
			}
		}
		//(+(-ad)(*bc))
		//Left (Middle) = +
		//Middle (Left) = (-ad) - substring(2,6);
		//Right = (*bc) - 
		System.out.println("pos: " + pos);
		System.out.println("left: " + pre.charAt(pos));
		System.out.println("middle: " + pre.substring(pos+1,pos+6));
		System.out.println("right: " + pre.substring(pos+2, pre.length()-1));
		//temp[0] = pre.substring(1, pos+1);//left
		//temp[1] = "" + pre.charAt(pos+1);//middle
		//temp[2] = pre.substring(pos+2, pre.length()-1);//right
		return temp;
	}

	//======================================
	//Postfix
	public void populateFromPostfix(String post){
		root = populateFromPostfixHelper(post);
	}
	private Node populateFromPostfixHelper(String post){
		return null;
	}
	private String[] postfixBreakdownHelper(String post){
		return null;
	}

	//======================================
	//Node
	private class Node{
		public Node leftChild, rightChild;
		public char data;
		public Node(char data) {
			leftChild = null;
			rightChild = null;
			this.data = data;
		}
		public String toString(){
			return "" + data;
		}
	}
}