package edu.unca.cl373.jatyas;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleStringTest {
	
	private char[] cArray1 = {'a','b','c','d','e','f','1','2','3','4'};
	private char[] cArray2 = new char[0];
	private char[] cArray3 = {'x','y','z','8','9','0'};
	private char[] cArray4 = {'a','b','c','d','e','f','1','2','3','4','x','y','z','8','9','0'};
	private char[] cArray5 = {'e','f','1','2'};
	private SimpleString ss1a;
	private SimpleString ss1b;
	private SimpleString ss2;
	private SimpleString ss3;
	private SimpleString ss4;
	private SimpleString ss5;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		ss1a = new SimpleString(cArray1);
		ss1b = new SimpleString(cArray1);
		ss2 = new SimpleString(cArray2);
		ss3 = new SimpleString(cArray3);
		ss4 = new SimpleString(cArray4);
		ss5 = new SimpleString(cArray5);
	}
	
	@Test
	public void testGetStringChars(){
		assertArrayEquals(cArray1, ss1a.getStringChars());
	}

	@Test
	public void testSimpleString() {
		assertNotNull(ss1a.getCharacterList());
		assertArrayEquals(cArray1, ss1a.getStringChars());
	}

	@Test
	public void testCharAt() {
		assertEquals('e', ss1a.charAt(4));
	}

	@Test
	public void testContains() {
		assertTrue(ss1a.contains('c'));
		assertFalse(ss1a.contains('5'));
	}

	@Test
	public void testIndexOf() {
		assertEquals(5, ss1a.indexOf('f'));
		assertEquals(-1, ss1a.indexOf('7'));
	}

	@Test
	public void testIsEmpty() {
		assertFalse(ss1a.isEmpty());
		assertTrue(ss2.isEmpty());
	}

	@Test
	public void testLength() {
		assertEquals(cArray1.length, ss1a.length());
		assertEquals(0, ss2.length());
	}

	@Test	
	public void testConcat() {
		assertArrayEquals(cArray4, (ss1a.concat(ss3)).getStringChars());
		assertArrayEquals(cArray1, (ss1b.concat(ss2)).getStringChars());
	}

	@Test
	public void testSubString() {
		assertArrayEquals(cArray5, ss4.subString(4, 8).getStringChars());
		assertArrayEquals(cArray1, ss4.subString(0, 10).getStringChars());
	}

	@Test
	public void testEqualsObject() {
		assertNotEquals(null, ss1a);
		assertEquals(ss1a, ss1b);
		assertNotEquals(ss1a, ss2);
		assertNotEquals(ss1a, ss4);
		assertNotEquals(ss4, ss5);
	}
	
	@Test
	public void testHashCode() {
		assertEquals(ss1a.hashCode(), ss1b.hashCode());
		assertNotEquals(ss3.hashCode(), ss4.hashCode());
	}

}
