package edu.unca.cl373.jatyas;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleStringTest {
	
	private char[] charArray = {'a','b','c','d','e','f','1','2','3','4'};
	private SimpleString ss;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
		ss = new SimpleString(this.charArray);
	}
	
//	@Test
//	public void testGetStringChars(){
//		assertEquals(ss.getStringChars(), this.charArray);
//	}

	@Test
	public void testSimpleString() {
		assertNotNull(ss.getCharContents());
	}

//	@Test
//	public void testCharAt() {
//		fail("Not yet implemented"); // TODO
//	}
//
//	@Test
//	public void testContains() {
//		fail("Not yet implemented"); // TODO
//	}
//
//	@Test
//	public void testIndexOf() {
//		fail("Not yet implemented"); // TODO
//	}
//
//	@Test
//	public void testIsEmpty() {
//		fail("Not yet implemented"); // TODO
//	}
//
//	@Test
//	public void testLength() {
//		fail("Not yet implemented"); // TODO
//	}
//
//	@Test
//	public void testConcat() {
//		fail("Not yet implemented"); // TODO
//	}
//
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
