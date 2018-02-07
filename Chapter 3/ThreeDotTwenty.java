//CSCI3200 - Chapter 3 Assignment 3.20
//Matthew Johnston

public class ThreeDotTwenty {
	public static void main(String[] args) {
		MyLazyDoubleLinkedList<Integer> lazy = new MyLazyDoubleLinkedList<>();
		
		lazy.add(1);
		lazy.add(2);
		lazy.add(3);
		lazy.add(4);
		lazy.add(5);
		lazy.add(6);
		System.out.println("Before operations: " + lazy.printList());
		lazy.remove(2);
		lazy.remove(4);
		System.out.println("Removed evens: " + lazy.printList());
		//Use this to print out list with deletions marked as (D)
		System.out.println("List with deletions: " + lazy.printFullList()); 
		System.out.println("Find 2: " + lazy.find(2) + " (Deleted value)");
		System.out.println("Get index 4: " + lazy.get(4) + " (Get was larger than size, so got end node instead.)");
		System.out.println("List with deletions: " + lazy.printFullList()); 
		lazy.insert(9,1);
		lazy.insert(8,3);
		System.out.println(lazy.printFullList() + " (Inserted two new values onto the deleted values)");
		lazy.remove(5);
		lazy.remove(9);
		System.out.println("List with deletions: " + lazy.printFullList()); 
		lazy.remove(8);
		System.out.println("Testing trueRemove: " + lazy.printFullList());
	}
}