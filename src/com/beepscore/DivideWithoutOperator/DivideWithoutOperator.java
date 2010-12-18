/**
 * 
 */
package com.beepscore.DivideWithoutOperator;

/**
 * @author stevebaker
 *
 */
public class DivideWithoutOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// TODO:
	// Could re-implement long division algorithm used when calculating by hand.
	// This would enable type double arguments and result.
	// Start at most significant digit.
	// Increment guess for quotient digit, multiply divisor* quotient digit,
	// subtract intermediate result from dividend to get remainder
	// Loop until remainder is less than divisor.
	// Then move to next digit to right.

	// We can overload this method, changing the signature with different parameter lists.
	// http://download.oracle.com/javase/tutorial/java/javaOO/methods.html
	public static long divideWithoutOperator(long dividend, long divisor) throws DivideByZeroException
	{	
		// If divisor is zero, throw checked exception.
		if (0 == divisor)
		{
			DivideByZeroException divideByZeroException 
			= new DivideByZeroException("Can't divide by zero.");
			throw divideByZeroException;
		}		

		long increment;
		if ( -1 == (Math.signum(divisor) * Math.signum(dividend)) )
		{
			// quotient will be negative
			increment = -1;
		} else {
			// quotient will be zero or positive
			increment = 1;
		}
		long quotient;
		for ( quotient = 0; (Math.abs(quotient) < Math.abs(dividend)); quotient += increment)
		{
			if ( Math.abs(quotient*divisor) >= Math.abs(dividend) )
			{
				return quotient;
			}
		}
		// default fall through if loop condition doesn't work
		return quotient;
	}


	// divide the way a slide rule divides, by subtracting logs
	public static double divideUsingLogsAndPower(double dividend, double divisor) throws DivideByZeroException
	{	
		// If divisor is zero, throw checked exception.
		if (0 == divisor)
		{
			DivideByZeroException divideByZeroException 
			= new DivideByZeroException("Can't divide by zero.");
			throw divideByZeroException;
		} 
		else if (0 == dividend)
		{
			return 0;
		}
		else
		{			
			// calculate sign of the result as 1 or -1
			int quotientSign;

			if ( -1 == (Math.signum(divisor) * Math.signum(dividend)) )
			{
				// quotient will be negative
				quotientSign = -1;
			} else {
				// quotient will be zero or positive
				quotientSign = 1;
			}

			// Math.log is natural log base e
			double logDividend = Math.log(Math.abs(dividend));
			double logDivisor = Math.log(Math.abs(divisor));

			double logQuotient = (logDividend - logDivisor);

			double quotient = quotientSign * Math.exp(logQuotient);

			return quotient;
		}
	}

}
