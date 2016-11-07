package org.wecancodeit.exercise.ohmy;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class OhMyIterator implements Iterator<String> {

	private String[] elements;
	private int currentIndex;

	public OhMyIterator(String[] elements) {
		this.elements = elements;
	}

	@Override
	public boolean hasNext() {
		return (elements.length - 1 >= currentIndex);
	}

	@Override
	public String next() {
		if (hasNext()) {
			String current = elements[currentIndex];
			currentIndex++;
			return current;
		}
		throw new NoSuchElementException();
	}
}
