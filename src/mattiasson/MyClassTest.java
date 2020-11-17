package mattiasson;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class MyClassTest {

	// 1
	// Was missing @Test and AssertEquals start with lowercase a. Change test name.
	// Added ".
	@Test
	public void testReverseString() {
		StringBuilder b = new StringBuilder("Jag");
		assertEquals("gaJ", b.reverse().toString());
	}

	// 2
	// Should be void
	@Test
	public void testjustASimpleAssert() {
		String name = "My name";
		assertEquals("My name", name);
	}

	// 3
	// Created individual methods
	public class Person {
		String firstname = "first name";
		String lastname = "last name";
		int phonenumber = 0701111111;
		String streetaddress = "my cool street";
	}

	Person pers = new Person();

	@Test
	public void testFirstName() {
		assertEquals("first name", pers.firstname);
	}

	@Test
	public void testLastName() {
		assertEquals("last name", pers.lastname);
	}

	@Test
	public void testPhoneNumber() {
		assertEquals(0701111111, pers.phonenumber);
	}

	@Test
	public void testStreetAdress() {
		assertEquals("my cool street", pers.streetaddress);
	}

	// 4
	// Passes when there is nothing to fail.
	@Test
	public void testAsSimpleAsPossible() {
		System.out.println("Junit 5");
		assertEquals(7, ("Junit 5").length());
	}

	// 5
	// Add @Test
	@Test
	public void testGiveMeASimpleVerification() {
		assertEquals(100, 100);
	}

	// 6
	// Fails because it does not refer to same string
	@Test
	public void testCheckingSame() {
		String s1 = new String("S1");
		String s2 = s1;
		assertSame(s1, s2);
	}

	// 7
	@Test
	public void testCheckingBytes() {
		byte smallByte1 = 100;
		byte smallByte2 = smallByte1;
		assertTrue(smallByte1 == smallByte2);
	}

	// 9
	@Test
	public void testCheckingTrue() {
		Object obj1 = new Object();
		Object obj2 = obj1;
		assertTrue(obj1 == obj2);
	}

	// 10
	@Test
	public void testCheckingFalse() {
		Object obj1 = new Object();
		Object obj2 = new Object();
		assertFalse(obj1 == obj2);
	}
}
