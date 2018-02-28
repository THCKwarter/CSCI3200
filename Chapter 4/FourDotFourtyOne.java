//CSCI3200 - 4.41
//Matthew Johnston

public class FourDotFourtyOne {
	public static void main(String[] args) {
		BinaryTree441<Integer> bt = new BinaryTree441<>();

		bt.insert(5);
		bt.insert(3);
		bt.insert(1);
		bt.insert(9);
		bt.insert(7);
		bt.insert(10);
		
		System.out.println(bt.printByLevel());
	}
}