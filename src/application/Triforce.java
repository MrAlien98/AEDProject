package application;

public class Triforce<K, V, T> {

	private K key;
	private V value;
	private T order;
	
	public Triforce(K key, V value, T order) {
		this.key=key;
		this.value=value;
		this.order=order;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	/**
	 * @return the order
	 */
	public T getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(T order) {
		this.order = order;
	}
	
	
	
}
