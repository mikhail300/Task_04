 package by.htp.les13.view;

import by.htp.les13.entity.Fraction;

public class FractionView {
	
	public void printSimpleFraction(Fraction fr) {
		System.out.print(fr.getNumerator() + "/" + fr.getDenominator());
	}
	
	public void printAddExpression(Fraction fr1, Fraction fr2, Fraction sum) {
		System.out.print("[");
		printSimpleFraction(fr1);
		System.out.print(" + ");
		printSimpleFraction(fr2);
		System.out.print(" = ");
		printSimpleFraction(sum);
		System.out.println("]");
	}
	
	public void printSubExpression(Fraction fr1, Fraction fr2, Fraction sum) {
		System.out.print("[");
		printSimpleFraction(fr1);
		System.out.print(" - ");
		printSimpleFraction(fr2);
		System.out.print(" = ");
		printSimpleFraction(sum);
		System.out.println("]");
	}
	
	public void printMulExpression(Fraction fr1, Fraction fr2, Fraction sum) {
		System.out.print("[");
		printSimpleFraction(fr1);
		System.out.print(" * ");
		printSimpleFraction(fr2);
		System.out.print(" = ");
		printSimpleFraction(sum);
		System.out.println("]");
	}

	public void printDivExpression(Fraction fr1, Fraction fr2, Fraction sum) {
		System.out.print("[");
		printSimpleFraction(fr1);
		System.out.print(" * ");
		printSimpleFraction(fr2);
		System.out.print(" = ");
		printSimpleFraction(sum);
		System.out.println("]");
	}
}
