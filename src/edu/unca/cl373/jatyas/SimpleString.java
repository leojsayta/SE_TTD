package edu.unca.cl373.jatyas;

import java.util.*;

public class SimpleString {
	
	static final String NOT_IMPLEMENTED_ERROR = "This function is not yet implemented.";

	List<Character> characterList;
	
	public SimpleString(char[] letters) {
		this.characterList = toCharacterList(letters);
	}
	
	private List<Character> toCharacterList(char[] letters){
		ArrayList<Character> l = new ArrayList<>(letters.length);
		for (int i = 0; i < letters.length; i++) {
			l.add(letters[i]);
		}
		return l;
	}
	
	private char[] toCharArray(List<Character> cList){
		char[] cArr = new char[cList.size()];
		for (int i = 0; i < cList.size(); i++) {
			cArr[i] = cList.get(i).charValue();
		}
		return cArr;
	}
	
	protected List<Character> getCharacterList() {
		return this.characterList;
	}

	public char[] getStringChars() {
		if (this.characterList != null) {
			char[] cArray = new char[getCharacterList().size()];
			for (int i = 0; i < getCharacterList().size(); i++) {
				cArray[i] = getCharacterList().get(i);
			}
			return cArray;
		}
		else
			return new char[0];
	}

	public char charAt(int index){
		return getCharacterList().get(index).charValue();
	}
	
	public boolean contains(char c){
		return getCharacterList().contains(Character.valueOf(c));
	}
	
	public int indexOf(char c){
		return getCharacterList().indexOf(Character.valueOf(c));
	}
	
	public boolean isEmpty(){
		return getCharacterList().isEmpty();
	}
	
	public int length(){
		return getCharacterList().size();
	}
	
	public SimpleString concat(SimpleString s){
		List<Character> lc = getCharacterList();
		lc.addAll(s.getCharacterList());
		char[] cArr = toCharArray(lc);
		return new SimpleString(cArr);
	}
	
	public SimpleString subString(int startIndex, int endIndex){
		throw new UnsupportedOperationException(NOT_IMPLEMENTED_ERROR);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((characterList == null) ? 0 : characterList.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof SimpleString)) {
			return false;
		}
		SimpleString other = (SimpleString) obj;
		if (characterList == null) {
			if (other.characterList != null) {
				return false;
			}
		} else if (!characterList.equals(other.characterList)) {
			return false;
		}
		return true;
	}
	
	
}
	