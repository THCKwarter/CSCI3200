//Matthew Johnston & Walker Stipe

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeSet;

public class Encoder {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "";
		String output = "";
		TreeSet<ASCII> charSet = new TreeSet<>();
		Hashtable<ASCII, Integer> charHash = new Hashtable<>();
		int ascii = 0;
		int maxFreq = 1;
		int binaryCount = 0;
		ASCII temp;
		
		//Test input: This is a test text.
		System.out.println("Enter your text to be encoded: ");
		input = scan.nextLine();
		
		System.out.println("Input: " + input);
		
		//Count characters and put their count into a TreeSet
		for(int i = 0; i < input.length(); i++){ //N
			ascii = (int)input.charAt(i); //2
			//System.out.println("ASCII Value: " + ascii);
			temp = new ASCII(ascii);
			
			if(charHash.containsKey(temp)){ //Hashtable methods run in constant time
				//System.out.println("Getting.");
				temp.increaseFreq(charHash.get(temp));
				charHash.remove(temp);
				charHash.put(temp, temp.getFreq());
				if(temp.getFreq() > maxFreq) {
					maxFreq = temp.getFreq();
					//System.out.println("Max: " + maxFreq);
				}
			}else {
				//System.out.println("Adding: " + temp);
				charHash.put(temp, 1);
			}
		}
		
		//Add Hashtable values to TreeSet to sort by frequency
		for(Entry<ASCII, Integer> a : charHash.entrySet()) { //N
			charSet.add(a.getKey());
		}
		
		//Assign each ASCII character a binary number
		for(ASCII a : charSet) { //N
			charHash.remove(a);
			charHash.put(a, binaryCount);
			binaryCount++;
		}
		
		//Encode original input into binary
		for(int i = 0; i < input.length(); i++) { //N
			ascii = (int)input.charAt(i);
			temp = new ASCII(ascii);
			ascii = charHash.get(temp);
			
			output += (Integer.toBinaryString(ascii) + " ");
		}
		
		//Total runtime = O(4N) = O(N)
		System.out.println("Output: " + output);
	}
}