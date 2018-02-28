//CSCI3200 - 4.46
//Matthew Johnston

public class FourDotFourtySix {
	public static void main(String[] args) {
		BinaryTree441<Integer> bt1 = new BinaryTree441<>();
		BinaryTree441<Integer> bt2 = new BinaryTree441<>();

		bt1.insert(1);
		bt1.insert(2);
		bt1.insert(3);
		bt2.insert(4);
		bt2.insert(5);
		bt2.insert(6);
		
		System.out.println(bt1.compareWith(bt2.getRoot()));
	}
}