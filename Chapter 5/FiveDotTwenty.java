//CSCI3200 - Chapter 5.20 Map Driver
//Matthew Johnston

public class FiveDotTwenty{
	public static void main(String[] args){
		Map<String, Integer> m = new Map<>();
		
		m.put("Matt", 22);
		m.put("Liza", 23);
		System.out.println("Get value: ");
		System.out.println(m.get("Matt"));
		System.out.println(m.get("Liza"));
	}
}