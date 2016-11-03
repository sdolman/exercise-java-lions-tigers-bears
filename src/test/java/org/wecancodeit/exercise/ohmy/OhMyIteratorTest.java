package org.wecancodeit.exercise.ohmy;

import java.util.Iterator;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.junit.Test;

public class OhMyIteratorTest {

	private static final String[] EMPTY_ARRAY = new String[] {};
	private static final String[] ANIMALS = { "lions", "tigers", "bears" };

	@Test
	public void shouldReturnFirstElement() {
		Iterator<String> underTest = new OhMyIterator(new String[] {"lions"});
		
		String first = underTest.next();
		
		Assert.assertEquals("lions", first);
	}
	
	@Test
	public void shouldReturnSecondElement()  {
		Iterator<String> underTest = new OhMyIterator(new String[] {"lions", "tigers"});
		
		underTest.next();
		String second = underTest.next();
		
		Assert.assertEquals("tigers", second);
	}
	
	@Test
	public void shouldHaveNextElement() {
		Iterator<String> underTest = new OhMyIterator(new String[] {"lions"});
		
		boolean hasNext = underTest.hasNext();
		
		Assert.assertTrue(hasNext);
		// which is the same as...
		Assert.assertEquals(true, hasNext);
	}
	
	@Test
	public void shouldNotHaveNextElement() {
		Iterator<String> underTest = new OhMyIterator(EMPTY_ARRAY);
		
		boolean hasNext = underTest.hasNext();
		
		Assert.assertFalse(hasNext);
		// which is the same as...
		Assert.assertEquals(false, hasNext);
	}
	
	@Test(expected=NoSuchElementException.class)
	public void shouldThrowExceptionIfNextIsNotAvailable() {
		Iterator<String> underTest = new OhMyIterator(EMPTY_ARRAY);
		underTest.next();
	}
	
	@Test
	public void shouldReadAllElements() {
		Iterator<String> underTest = new OhMyIterator(ANIMALS);
		
		String first = underTest.next();
		String second = underTest.next();
		String third = underTest.next();
		
		Assert.assertEquals("lions", first);
		Assert.assertEquals("tigers", second);
		Assert.assertEquals("bears", third);
	}
}
