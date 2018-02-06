//CSCI3200 - Chapter 3 Assignment 3.2
//Matthew Johnston

public class ThreeDotTwo {
	public static void main(String[] args) {
		//Single Linked List Test
		/*
		System.out.println("===================================");
		System.out.println("Single Linked List Swap Method");
		System.out.println("===================================");
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
		*/
		
		System.out.println("===================================");
		System.out.println("Double Linked List Swap Method");
		System.out.println("===================================");

		//Double Linked List Test
		MyDoubleLinkedList<Integer> mdll = new MyDoubleLinkedList<>();
		mdll.add(1);
		mdll.add(2);
		mdll.add(3);
		mdll.add(4);
		mdll.add(5);
		System.out.println("Before Swap (Rev): " + mdll.printListRev());
		mdll.swap(0,1);
		System.out.println("Swapped (Rev): " + mdll.printListRev());
		System.out.println("===================================");
		System.out.println("Before Swap: " + mdll.printList());
		System.out.println("Before Swap (Rev): " + mdll.printListRev());
		mdll.swap(1,4);
		System.out.println("Swapped: " + mdll.printList());
		System.out.println("Swapped (Rev): " + mdll.printListRev());
	}
}