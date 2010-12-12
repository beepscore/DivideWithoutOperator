package com.beepscore.DivideWithoutOperator;
//import com.beepscore.DivideWithoutOperator.DivideWithoutOperator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DivideWithoutOperatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDivideWithoutOperator()
	{
		// TODO: test if divisor is 0, method returns error
		// currently method returns type long, no fractional part
		
		assertTrue(1L == DivideWithoutOperator.divideWithoutOperator(1, 1));

		// test expected result is zero
		assertTrue(0L == DivideWithoutOperator.divideWithoutOperator(0, 1));
		assertTrue(0L == DivideWithoutOperator.divideWithoutOperator(0, -1));
		// 0/2 passes, because result 0 is type long.
		assertTrue(0L == DivideWithoutOperator.divideWithoutOperator(0, 2));

		// test truncate fractional portion of quotient
		// TODO: Overload method to accept and return type double.
		
		// TODO: 1/2  should return 0.
		// Currently it returns 1
		//assertTrue(0L == DivideWithoutOperator.divideWithoutOperator(1, 2));
		
		assertTrue(2L == DivideWithoutOperator.divideWithoutOperator(2, 1));
		assertTrue(3L == DivideWithoutOperator.divideWithoutOperator(3, 1));

		
		// test different combinations of sign
		assertTrue(-3L == DivideWithoutOperator.divideWithoutOperator(-6, 2));
		assertTrue(-3L == DivideWithoutOperator.divideWithoutOperator(6, -2));
		assertTrue(3L == DivideWithoutOperator.divideWithoutOperator(-6, -2));
}
	
	@Test
	public void testdivideUsingLogsAndPower()
	{
		// TODO: test if divisor is 0, method returns error
			
		// test expected result is zero
		assertEquals(0, DivideWithoutOperator.divideUsingLogsAndPower(0, 1.0), 0.000000000000002);
		assertEquals(0.0, DivideWithoutOperator.divideUsingLogsAndPower(0, -1.0), 0.000000000000002);
		assertEquals(0.0, DivideWithoutOperator.divideUsingLogsAndPower(0.0, 2.0), 0.000000000000002);

		assertEquals(1.0, DivideWithoutOperator.divideUsingLogsAndPower(1.0, 1.0), 0.000000000000002);

		assertEquals(0.5, DivideWithoutOperator.divideUsingLogsAndPower(1.0, 2.0), 0.000000000000002);
		
		assertEquals(2.0, DivideWithoutOperator.divideUsingLogsAndPower(2.0, 1.0), 0.000000000000002);
		assertEquals(3.0, DivideWithoutOperator.divideUsingLogsAndPower(3.0, 1.0), 0.000000000000002);
		
		// test different combinations of sign
		// System.out.println(DivideWithoutOperator.divideUsingLogsAndPower(-6.0, 2.0));
		assertEquals(-3.0, DivideWithoutOperator.divideUsingLogsAndPower(-6.0, 2.0), 0.000000000000002);
		assertEquals(-3.0, DivideWithoutOperator.divideUsingLogsAndPower(6.0, -2.0), 0.000000000000002);
		assertEquals(3.0, DivideWithoutOperator.divideUsingLogsAndPower(-6.0, -2.0), 0.000000000000002);

	}

}
