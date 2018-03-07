//CSCI3200 - Chapter 5.20 Map
//Matthew Johnston

class Map<K,V>{
	//Variables
	private QuadraticProbingHashTable<Entry<K,V>> items;

	//Constructor
	public Map(){
		items = new QuadraticProbingHashTable<Entry<K,V>>();
	}

	//Put and Get methods
	public void put(K key, V val){
		items.insert(new Entry(key, val));
	}
	public V get(K key){
		V val = items.get(new Entry(key)).value;
		return val;
	}

	//isEmpty and makeEmpty methods
	public boolean isEmpty(){
		if(items.capacity() != 0){
			return false;
		}
		return true;
	}
	public void makeEmpty(){
		items.makeEmpty();
	}
	
	private static class Entry<K,V>{
		K key;
		public V value;
		
		//Constructor
		Entry(K k, V v){
			this.key = k;
			this.value = v;
		}
		Entry(K k){
			this.key = k;
			this.value = null;
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((key == null) ? 0 : key.hashCode());
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
			Entry other = (Entry) obj;
			if (key == null) {
				if (other.key != null)
					return false;
			} else if (!key.equals(other.key))
				return false;
			return true;
		}
		public String toString(){
			return "" + value;
		}
	}
}