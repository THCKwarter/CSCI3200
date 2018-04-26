//Matthew Johnston & Walker Stipe

import java.util.Scanner;
import java.util.TreeSet;

public class Encoder {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "";
		String output = "";
		TreeSet<ASCII> charSet = new TreeSet<>();
		int ascii = 0;
		ASCII temp;
		
		//Test input: This is a test text.
		System.out.println("Enter your text to be encoded: ");
		input = scan.nextLine();
		
		System.out.println("Input: " + input);
		
		//Count characters and put their count into a TreeSet
		for(int i = 0; i < input.length(); i++){ 
			ascii = (int)input.charAt(i);
			//System.out.println("ASCII Value: " + ascii);
			temp = new ASCII(ascii);
			
			if(charSet.contains(temp)){
				
			}else {
				charSet.add(temp);
			}
		}
		
		//Print TreeSet
		System.out.println("Print TreeSet: ");
		for(ASCII a: charSet){
			System.out.println(a);
		}
	}
}