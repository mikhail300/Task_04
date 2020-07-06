package by.htp.les13.entity;

public class Fraction {
	
	private int numerator; // числитель
	private int denominator; // знаменатель

	public Fraction() {
		numerator = denominator = 1;
	}

	public Fraction(int num, int den) {
		numerator = num;
		denominator = den;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	
	}