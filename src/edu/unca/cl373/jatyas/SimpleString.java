package edu.unca.cl373.jatyas;

import java.util.*;

public class SimpleString {
	
	static final String NOT_IMPLEMENTED_ERROR = "This function is not yet implemented.";

	List<Character> charContents;
	
	public SimpleString(char[] letters) {
		this.charContents = toCharacterList(letters);
	}
	
	private List<Character> toCharacterList(char[] letters){
		ArrayList<Character> l = new ArrayList<>(letters.length);
		for (int i = 0; i < letters.length; i++) {
			l.add(letters[i]);
		}
		return l;
	}
	
	public List<Character> getCharContents() {
		return this.charContents;
	}

	public char[] getStringChars() {
		if (this.charContents != null) {
			char[] cArray = new char[getCharContents().size()];
			for (int i = 0; i < getCharContents().size(); i++) {
				cArray[i] = getCharContents().get(i);
			}
			return cArray;
		}
		else
			return new char[0];
	}

	public char charAt(int index){
		return getCharContents().get(index).charValue();
	}
	
	public boolean contains(char c){
		throw new UnsupportedOperationException(NOT_IMPLEMENTED_ERROR);
	}
	
	public int indexOf(char c){
		throw new UnsupportedOperationException(NOT_IMPLEMENTED_ERROR);
	}
	
	public boolean isEmpty(){
		throw new UnsupportedOperationException(NOT_IMPLEMENTED_ERROR);
	}
	
	public int length(){
		throw new UnsupportedOperationException(NOT_IMPLEMENTED_ERROR);
	}
	
	public SimpleString concat(SimpleString s){
		throw new UnsupportedOperationException(NOT_IMPLEMENTED_ERROR);
	}
	
	public SimpleString subString(int startIndex, int endIndex){
		throw new UnsupportedOperationException(NOT_IMPLEMENTED_ERROR);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((charContents == null) ? 0 : charContents.hashCode());
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
		if (charContents == null) {
			if (other.charContents != null) {
				return false;
			}
		} else if (!charContents.equals(other.charContents)) {
			return false;
		}
		return true;
	}
	
	
}
	