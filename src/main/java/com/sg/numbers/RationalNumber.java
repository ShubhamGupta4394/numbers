package com.sg.numbers;

public class RationalNumber {
	private int numerator, denominator;

	public RationalNumber(int numerator, int denominator) {
		if(denominator==0) {
			throw new IllegalArgumentException();
		}
		this.numerator = numerator;
		this.denominator = denominator;
		
	}

	public int getDenominator() {
		return denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public RationalNumber sum(RationalNumber r2) {
		int numerator, denominator;
		denominator = this.getDenominator() * r2.getDenominator();
		numerator = this.getNumerator() * r2.getDenominator() + r2.getNumerator() * this.getDenominator();
		RationalNumber r3 = new RationalNumber(numerator, denominator);
		int a=r3.gcd(numerator,denominator);
		numerator=numerator/a;
		denominator=denominator/a;
		RationalNumber r4 = new RationalNumber(numerator, denominator);
		return r4;
	}

	private int gcd(int numerator, int denominator) {
		int num, den;
		num = this.numerator;
		den = this.denominator;
		int r = 0, a, b;
		a = (num > den) ? num : den;
		b = (num < den) ? num : den;
		r = b;
		while (a % b != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		return r;
	}
}
