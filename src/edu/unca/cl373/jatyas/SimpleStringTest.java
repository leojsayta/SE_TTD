package edu.unca.cl373.jatyas;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleStringTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		char[] arr = {'a','b','c','d','e','f','1','2','3','4'};
		SimpleString ss = new SimpleString(arr);
	}

	@Test
	public void testHashCode() {
		
	}

//	@Test
//	public void testSimpleString() {
//		fail("Not yet implemented"); // TODO
//	}
//
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

}
