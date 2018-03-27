//CSCI3200 - Chapter 6 Assignment - Heaps
//Matthew Johnston

public class SixDotTwoSlashThree{
	public static void main(String[] args){
		System.out.println("== Start 6.2 ==");
		System.out.println("== Single Inserts ==");
		MyBinaryHeap<Integer> mbh = new MyBinaryHeap<>(2);
		mbh.insert(1);
		mbh.insert(5);
		mbh.insert(3);
		mbh.insert(2);
		mbh.insert(9);
		System.out.println(mbh);
		
		System.out.println("== Bulk Inserts ==");
		MyBinaryHeap<Integer> mbh2 = new MyBinaryHeap<>(new Integer[]{10,45,11,2,6});
		System.out.println(mbh2);
		System.out.println("== End 6.2 == \n\n");
		
		System.out.println("== Start 6.3 ==");
		System.out.println("== Heap 1/2 ==");
		System.out.println("deleteMin 1/3: " + mbh.deleteMin());
		System.out.println(mbh);
		System.out.println("deleteMin 2/3: " + mbh.deleteMin());
		System.out.println(mbh);
		System.out.println("deleteMin 3/3: " + mbh.deleteMin());
		System.out.println(mbh + "\n");

		System.out.println("== Heap 2/2 ==");
		System.out.println("deleteMin 1/3: " + mbh2.deleteMin());
		System.out.println(mbh2);
		System.out.println("deleteMin 2/3: " + mbh2.deleteMin());
		System.out.println(mbh2);
		System.out.println("deleteMin 3/3: " + mbh2.deleteMin());
		System.out.println(mbh2 + "\n");
	}
}
