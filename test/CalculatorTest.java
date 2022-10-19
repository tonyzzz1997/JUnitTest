package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import javax.annotation.processing.Generated;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated(value = "org.junit-tools-1.1.0")
public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before All");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After All");
	}

	private Calculator createTestSubject() {
		return new Calculator();
	}

	@Test
	public void testAdd() throws Exception {
		Calculator testSubject;
		int a = 10;
		int b = 2;
		int result;
		int expected = 12;

		// default test
		testSubject = createTestSubject();
		result = testSubject.add(a, b);
		
		assertEquals(expected, result);
	}

	@Test
	public void testSub() throws Exception {
		Calculator testSubject;
		int a = 10;
		int b = 2;
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.sub(a, b);
		
		int expected = 8;
		assertEquals(expected, result);
	}

	@Test
	public void testMul() throws Exception {
		Calculator testSubject;
		int a = 10;
		int b = 2;
		int result;
		int expected = 20;

		// default test
		testSubject = createTestSubject();
		result = testSubject.mul(a, b);
		
		assertEquals(expected, result);
	}

	@Test
	public void testDev() throws Exception {
		Calculator testSubject;
		int a = 10;
		int b = 2;
		int result;
		
		// default test
		testSubject = createTestSubject();
		result = testSubject.dev(a, b);
		
		int expected = 5;
		assertEquals(expected, result);
	}
	@Test
	public void testDevWidthZero() throws Exception {
		Calculator testSubject;
		int a = 10;
		int b = 0;
		String expected = "by zero";
		// default test
		testSubject = createTestSubject();
		Exception ex = assertThrows(Exception.class, () -> testSubject.dev(a, b));
		
		assertEquals(expected, ex.getMessage());
	}
	
	@Test
	public void testDevWidthRound() throws Exception {
		Calculator testSubject;
		int a = 7;
		int b = 3;
		int expected = 3;
		// default test
		testSubject = createTestSubject();
		int result = testSubject.dev(a, b);
		
		assertEquals(expected, result);
	}
}