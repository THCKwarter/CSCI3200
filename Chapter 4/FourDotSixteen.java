//CSCI3200 - 4.16
//Matthew Johnston

public class FourDotSixteen {
	public static void main(String[] args) {
		BinaryTree416<Integer> bt = new BinaryTree416<>();
		bt.insert(5);
		bt.insert(3);
		bt.insert(1);
		bt.insert(9);
		bt.insert(7);
		bt.insert(10);
		System.out.println(bt);
		bt.printInOrder();
		System.out.println(bt);
		bt.remove(5);
		System.out.println(bt);
	}
}