package com.sg.numbers;

import com.sg.numbers.RationalNumber;

import junit.framework.TestCase;

public class RationalNumberTest extends TestCase {

	public void testSum() {
		//fail("Not yet implemented");
		RationalNumber r1=new RationalNumber(3,4);
		RationalNumber r2=new RationalNumber(12,7);
		RationalNumber r3= r1.sum(r2);
		assertEquals(69, r3.getNumerator());
		assertEquals(28, r3.getDenominator());
	}
	

}
