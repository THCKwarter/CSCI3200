//CSCI3200 - Chapter 4 TreeMap
//Matthew Johnston

import java.util.TreeMap;
import java.util.Scanner;
public class Ch4TreeMap{
	public static void main(String[] args){
		boolean done = false;
		Scanner scan = new Scanner(System.in);
		String input = "";
		int vCount = 0;
		TreeMap<String, Integer> names = new TreeMap<>();

		do{
			System.out.println("Enter a name, or \"end\" to stop: ");
			input = scan.nextLine();
			if(input.equals("end")){
				done = true;
				System.out.println("Printing TreeMap.");
				System.out.println("============================");
			}else{
				vCount = vowelCount(input);
				names.put(input, vCount);
			}
		}while(done == false);

		for(String key : names.keySet()){
			System.out.println("Name: " + key + " | Vowels: " + names.get(key));
		}
	}
	
	public static int vowelCount(String s){
		int count = 0;
		s = s.toLowerCase();
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
				count++;
			}
		}
		return count;
	}
}