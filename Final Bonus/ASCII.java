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
		if(this.frequency == a.getFreq()) {
			if(this.asciiVal == a.getVal()) {
				return 0;
			}else if(this.asciiVal < a.getVal()) {
				return -1;
			}else {
				return 1;
			}
		}else if(this.frequency < a.getFreq()) {
			if(this.asciiVal == a.getVal()) {
				return 0;
			}else {
				return 1;
			}
		}else {
			if(this.asciiVal == a.getVal()) {
				return 0;
			}else {
				return -1;
			}
		}
	}

	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + asciiVal;
		return result;
	}

	@Override
	public boolean equals(Object obj){
		ASCII other = (ASCII) obj;
		if(asciiVal != other.asciiVal)
			return false;
		return true;
	}
}