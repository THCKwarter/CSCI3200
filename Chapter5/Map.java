class Map<K,V>{
	//Variables
	private QuadraticProbingHashTable<Entry<K,V>> items;

	//Constructor
	public Map(){

	}

	//Put and Get methods
	public void put(K key, V val){
		items.insert(new Entry(key, val));
	}
	public V get(K key){
		V val = items.get(key);
		return null;
	}

	//isEmpty and makeEmpty methods
	public boolean isEmpty(){
		return true;
	}
	public void makeEmpty(){
		//Code
	}
	
	private static class Entry<K,V>{
		K key;
		V value;
		
		//Constructors
		Entry(K key, V value){
			
		}
	}
	
	//hashCode and equals methods
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((items == null) ? 0 : items.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Map other = (Map) obj;
		if (items == null) {
			if (other.items != null)
				return false;
		} else if (!items.equals(other.items))
			return false;
		return true;
	}
	
	//toString
	@Override
	public String toString() {
		return "Map [items=" + items + "]";
	}
}