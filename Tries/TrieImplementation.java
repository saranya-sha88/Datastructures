package Tries;

import java.util.List;

public class TrieImplementation {
	
	private Trie root = new Trie('0');

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TrieImplementation trie = new TrieImplementation();
       trie.insert("a");
       trie.insert("all");
       trie.insert("als");
       trie.insert("as");
       System.out.println(trie.search("as"));
	}
	
	public void insert(String s)
	{
		int level = s.length();
		int i;
		Trie crawl = root;
		Trie temp, newTire;
		
		if(s == null || s.equals(""))
			return;
		
		for(i = 0; i < level;i++)
		{
			char c = s.charAt(i);
			temp = findMatchingNode(crawl.getTrieList(),c);
			if( temp != null )
			{
				//crawl.getTrieList().add(temp);
				crawl = temp;
			}else{
				newTire = new Trie(c);
				crawl.getTrieList().add(newTire);
				crawl = newTire;
			}
		}
		
		crawl.setWordEnd(true);
		
	}
	
	public boolean search(String key)
	{
		int level,i;
		Trie crawl = root,temp;
		
		if(key == null || key.equals(""))
			return false;
		
		level = key.length();
		for(i=0;i<level;i++)
		{
			char c = key.charAt(i);
		
			temp = findMatchingNode(crawl.getTrieList(),c);
			if(temp == null)
				return false;
			
			crawl = temp;
			
		}
		
		if(crawl.isWordEnd())
			return true;
		
		return false;
		
	}
	
	private Trie findMatchingNode(List<Trie> trieList, char c)
	{
		Trie newTrieNode = null;
		for(Trie trie : trieList)
		{
			if(c == trie.getCharacter())
				newTrieNode = trie;
				
		}
		
		return newTrieNode;
	}
	
	

}
