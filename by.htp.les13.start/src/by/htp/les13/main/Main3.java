package by.htp.les13.main;

import by.htp.les13.entity.Fraction;
import by.htp.les13.logic.FractionLogic;
import by.htp.les13.view.FractionView;

public class Main3 {

	public static void main(String[] args) {
		Fraction fr1 = new Fraction(2,2);
		Fraction fr2 = new Fraction(1,2);
		Fraction fr3;
		
		FractionLogic logic = new FractionLogic();
		FractionView view = new FractionView();
		
		fr3 = logic.add(fr1, fr2);
		view.printAddExpression(fr1, fr2, fr3);
		
		fr3 = logic.sub(fr1, fr2);
		view.printSubExpression(fr1, fr2, fr3);
		
		fr3 = logic.mul(fr1, fr2);
		view.printMulExpression(fr1, fr2, fr3);
		
		fr3 = logic.div(fr1, fr2);
		view.printMulExpression(fr1, fr2, fr3);
	}

}
