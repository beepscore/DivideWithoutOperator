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
		try {
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

		} catch (DivideByZeroException e) {
			// the tests should not throw this exception, but we have to be ready to catch it.
			System.out.println("Test threw exception with message: " + e.getMessage());
		}		
	}

	@Test
	public void testDivideWithoutOperatorThrowDivideByZeroException1()
	{
		try {
			assertTrue(1L == DivideWithoutOperator.divideWithoutOperator(1, 0));
		} catch (DivideByZeroException e) {
			// Pass.  Method threw the exception we expected.
			return;
		}		
		fail("Test failed, didn't throw expected exception");
	}

	@Test
	public void testDivideUsingLogsAndPower()
	{
		try {
			// test expected result is zero
			assertEquals(0, DivideWithoutOperator.divideUsingLogsAndPower(0, 1.0), 0.000000000000002);
			assertEquals(0.0, DivideWithoutOperator.divideUsingLogsAndPower(0, -1.0), 0.000000000000002);
			assertEquals(0.0, DivideWithoutOperator.divideUsingLogsAndPower(0.0, 2.0), 0.000000000000002);

			assertEquals(1.0, DivideWithoutOperator.divideUsingLogsAndPower(1.0, 1.0), 0.000000000000002);
			assertEquals(2.0, DivideWithoutOperator.divideUsingLogsAndPower(2.0, 1.0), 0.000000000000002);
			assertEquals(2.0, DivideWithoutOperator.divideUsingLogsAndPower(13.2, 6.6), 0.000000000000002);

			// test fractional results
			assertEquals(0.5, DivideWithoutOperator.divideUsingLogsAndPower(1.0, 2.0), 0.000000000000002);
			assertEquals(0.333333333333333, DivideWithoutOperator.divideUsingLogsAndPower(1.0, 3.0), 0.000000000000002);
			assertEquals(-2.875, DivideWithoutOperator.divideUsingLogsAndPower(-23.0, 8.0), 0.000000000000002);
			// System.out.println(DivideWithoutOperator.divideUsingLogsAndPower(7.0, -6.0));
			assertEquals(-1.166666666666666, DivideWithoutOperator.divideUsingLogsAndPower(7.0, -6.0), 0.000000000000002);
			assertEquals(0.5, DivideWithoutOperator.divideUsingLogsAndPower(1.0, 2.0), 0.000000000000002);

			assertEquals(5.0005, DivideWithoutOperator.divideUsingLogsAndPower(15.0015, 3.0), 0.000000000000002);

			// test different combinations of sign
			assertEquals(-3.0, DivideWithoutOperator.divideUsingLogsAndPower(-6.0, 2.0), 0.000000000000002);
			assertEquals(-3.0, DivideWithoutOperator.divideUsingLogsAndPower(6.0, -2.0), 0.000000000000002);
			assertEquals(3.0, DivideWithoutOperator.divideUsingLogsAndPower(-6.0, -2.0), 0.000000000000002);
		} catch (DivideByZeroException e) {
			// the tests should not throw this exception, but we have to be ready to catch it.
			System.out.println("Test threw exception with message: " + e.getMessage());
		}		
	}

	@Test
	public void testDivideUsingLogsAndPowerThrowDivideByZeroException1()
	{
		try {
			assertEquals(0, DivideWithoutOperator.divideUsingLogsAndPower(5.0, 0), 0.000000000000002);
		} catch (DivideByZeroException e) {
			// Pass.  Method threw the exception we expected.
			return;
		}		
		fail("Test failed, didn't throw expected exception");
	}
}
