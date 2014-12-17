/**
 * 
 */
package hashmap;

/**
 * @author Saranya
 *
 */
public class Hashmap {
	
	private int size;
	
	private float loadfactor = 0.5f;
	
	private int capacity;
	
	private LinkedListNode[] entries;
	
	public Hashmap()
	{
		size = 15;
		capacity = 0;
		entries = new LinkedListNode[size];
	}
	
	private int hashcode(int key)
	{
		int hashCode;
		
		if (key < size)
			return key;
		else{
			hashCode = key % 15;
			return hashCode;
		}
		
	}
	
	public int get(int key)
	{
		int hashCode = hashcode(key);
		int value = Integer.MIN_VALUE;
		
		LinkedListNode entry = entries[hashCode];
		
		if(entry == null)
			return value;
		else{
			while(entry != null)
			{
				if(entry.getKey() == key)
				{
					value = entry.getData();
					break;
				}
				
				entry = entry.getNext();
			}
		}
		
		return value;
	}
	
	
	public void put(int key, int data)
	{
		if (capacity < loadfactor*size)
		{
			rehashing();
		}
			
		int hashCode = hashcode(key);
		
		LinkedListNode entry = entries[hashCode];
		
		entries[hashCode] = createNewEntry(key,data);
		if (entry != null)
		{
		   entries[hashCode].setNext(entry);
		}
		
		capacity++;
	
	}
	
	private void rehashing()
	{
		LinkedListNode[] oldTable = entries;
		LinkedListNode[] newTable = new LinkedListNode[size*2];
		LinkedListNode entry,next;
		int hashcode;
		int i;
		
		size = size*2;
		
		
		for(i=0;i<oldTable.length;i++)
		{
			entry = oldTable[i];
			oldTable[i] = null;
			if(entry != null)
			{
				
				do{
					next = entry.getNext();
					hashcode = hashcode(entry.getKey());
					entry.setNext(newTable[hashcode]);
					newTable[hashcode] = entry;
					
					entry = next;
					
				}while(entry != null);
				
			}
		}
		
		entries = newTable;
	}
	
	private LinkedListNode createNewEntry(int key,int data)
	{
		LinkedListNode entry = new LinkedListNode();
		entry.setKey(key);
		entry.setData(data);
		entry.setNext(null);
		
		return entry;
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashmap map = new Hashmap();
		map.put(1, 10);
		map.put(31, 20);
		
		System.out.println(map.get(31));

	}

}
