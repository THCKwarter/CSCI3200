import java.util.Comparator;

public class ASCII implements Comparable<ASCII>{
	int frequency;
	int asciiVal;
	
	public ASCII(int val) {
		asciiVal = val;
		frequency = 1;
	}
	
	public int getVal() {
		return asciiVal;
	}
	
	public int getFreq() {
		return frequency;
	}
	
	public void increaseFreq() {
		frequency++;
	}
	
	public void increaseFreq(int i) {
		frequency += i;
	}
	
	public String toString() {
		String output = "";
		output += "ASCII: " + asciiVal + ", Freq: " + frequency;
		return output;
	}

	@Override
	public int compareTo(ASCII a){
		if(this.frequency == a.getFreq()){
			if(this.asciiVal > a.getVal()) {
				return 1;
			}else if(this.asciiVal < a.getVal()) {
				return -1;
			}else {
				return 0;
			}
		}else if(this.frequency > a.getFreq()){
			return -1;
		}else {
			return 1;
		}
	}
}