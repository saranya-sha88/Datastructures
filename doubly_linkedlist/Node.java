package doubly_linkedlist;

public class Node<K,V> {
	
	private K k;
	
	private V v;
	
	private Node<K,V> previous;
	
	private Node<K,V> next;

	public K getK() {
		return k;
	}

	public void setK(K k) {
		this.k = k;
	}

	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}

	public Node<K, V> getPrevious() {
		return previous;
	}

	public void setPrevious(Node<K, V> previous) {
		this.previous = previous;
	}

	public Node<K, V> getNext() {
		return next;
	}

	public void setNext(Node<K, V> next) {
		this.next = next;
	}
	
	
}
