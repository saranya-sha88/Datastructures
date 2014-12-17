package Tries;

import java.util.LinkedList;
import java.util.List;

public class Trie {
	
	private char character;
	
    private List<Trie> trieList;
	
	private boolean isWordEnd;
	
	public char getCharacter() {
		return character;
	}

	public void setCharacter(char character) {
		this.character = character;
	}

	public List<Trie> getTrieList() {
		return trieList;
	}

	public void setTrieList(List<Trie> trieList) {
		this.trieList = trieList;
	}

	public boolean isWordEnd() {
		return isWordEnd;
	}

	public void setWordEnd(boolean isWordEnd) {
		this.isWordEnd = isWordEnd;
	}

	
	
	public Trie(char c)
	{
		this.character = c;
		trieList = new LinkedList<Trie>();
	}
}
