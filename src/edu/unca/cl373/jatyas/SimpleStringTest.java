package edu.unca.cl373.jatyas;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleStringTest {
	
	private char[] cArray1 = {'a','b','c','d','e','f','1','2','3','4'};
	private char[] cArray2 = new char[0];
	private char[] cArray3 = {'x','y','z','8','9','0'};
	private char[] cArray4 = {'a','b','c','d','e','f','1','2','3','4','x','y','z','8','9','0'};
	private SimpleString ss1a;
	private SimpleString ss1b;
	private SimpleString ss2;
	private SimpleString ss3;
	private SimpleString ss4;

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
	}
	
	@Test
	public void testGetStringChars(){
		assertArrayEquals(ss1a.getStringChars(), cArray1);
	}

	@Test
	public void testSimpleString() {
		assertNotNull(ss1a.getCharacterList());
		assertArrayEquals(ss1a.getStringChars(), cArray1);
	}

	@Test
	public void testCharAt() {
		assertEquals(ss1a.charAt(4), 'e');
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
		assertEquals(ss1a.length(), this.cArray1.length);
		assertEquals(ss2.length(), 0);
	}

	@Test
	public void testConcat() {
		assertArrayEquals((ss1a.concat(ss3)).getStringChars(), cArray4);
		assertArrayEquals((ss1b.concat(ss2)).getStringChars(), cArray1);
	}

//	@Test
//	public void testSubString() {
//		fail("Not yet implemented"); // TODO
//	}
//
//	@Test
//	public void testEqualsObject() {
//		fail("Not yet implemented"); // TODO
//	}
	
//	@Test
//	public void testHashCode() {
//		
//	}


}
