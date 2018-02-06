//CSCI3200 - Chapter 3 Assignment 3.2
//Matthew Johnston

public class ThreeDotTwo {
	public static void main(String[] args) {
		//Single Linked List Test
		MySingleLinkedList<Integer> mll = new MySingleLinkedList<>();
		mll.add(4);
		mll.add(9);
		mll.add(1);
		mll.add(0);
		mll.add(5);
		System.out.println("Before Swap: " + mll.printList());
		mll.swap(1,3);
		System.out.println("Swapped: " + mll.printList());
		mll.swap(0,4);
		System.out.println("Swapped: " + mll.printList());
		mll.swap(2,3);
		System.out.println("Swapped: " + mll.printList());

		//Double Linked List Test
		/*
		MyDoubleLinkedList<Integer> mdll = new MyDoubleLinkedList<>();
		mdll.add(0);
		mdll.add(7);
		mdll.add(3);
		System.out.println(mdll.printList());
		System.out.println(mdll.printListRev());
		//mdll.swap(0,1);
		System.out.println(mdll.printList());
		System.out.println(mdll.printListRev());
		*/
	}
}