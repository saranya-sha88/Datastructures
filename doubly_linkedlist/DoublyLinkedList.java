package doubly_linkedlist;

public class DoublyLinkedList<K,V> {
	
	private Node<K,V> head;
	
	private Node<K,V> tail;
	
	public void push(K k,V v)
	{
		
		Node<K,V> temp;
		
		if(head == null)
		{
			head = createNewNode(k,v,null);
			tail = head;
		}
		else{
		
		temp = createNewNode(k,v,null);
		temp.setNext(head);
		head.setPrevious(temp);
		head = temp;
		}
			
	}
	
	public Node<K,V> pop()
	{
		Node<K,V> temp = tail;
		if(temp == null)
		{
			System.out.println("List is Empty");
		}
		
		if(temp.getPrevious() != null)
		{
		tail = tail.getPrevious();
		tail.setNext(null);
		temp.setPrevious(null);
		}else{
			
			tail = null;
		}
		
		return temp;
		
	}
	
	public V findKey(K k)
	{
		Node<K,V> temp = head,temp1;
		while(temp != null)
		{
			if(temp.getK().equals(k))
			{
				temp1 = temp.getPrevious();
				if(temp1 != null)
				{
					temp1.setNext(temp.getNext());
					if(temp.getNext() != null)
					temp.getNext().setPrevious(temp1);
					push(temp.getK(),temp.getV());
				}
				return temp.getV();
			}
		}
		
		return null;
	}
	
	public int getSize()
	{
		Node<K,V> temp = head;
		int count =0;
		while(temp != null)
		{
			temp = temp.getNext();
			count++;
		}
		return count;
		
	}
	
	private Node<K,V> createNewNode(K k,V v, Node<K,V> previous)
	{
		Node<K,V> newNode = new Node<K,V>();
		newNode.setK(k);
		newNode.setV(v);
		newNode.setPrevious(previous);
		newNode.setNext(null);
		return newNode;
	}

	public static void main(String[] args) {
		DoublyLinkedList<String,Integer> llist = new DoublyLinkedList<String,Integer>();
		
		llist.push("1", 1);
		System.out.println(llist.pop().getK());
	}

}
