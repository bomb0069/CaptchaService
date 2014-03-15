package th.own.bomb0069.kata;

import java.util.Map;
import java.util.HashMap;

public class Captcha {

	private int leftOperand;
	private int rightOperand;
	private Operator operator;

	private static Map<Integer, String> numberText;
    static
    {
        numberText = new HashMap<Integer, String>();
        numberText.put(1, "One");
        numberText.put(2, "Two");
        numberText.put(3, "Three");
        numberText.put(4, "Four");
        numberText.put(5, "Five");
        numberText.put(6, "Six");
        numberText.put(7, "Seven");
        numberText.put(8, "Eight");
        numberText.put(9, "Nine");
    }

	public Captcha (int captchaMode, int leftOperand, int operator, int rightOperand) {
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
		if (operator == 2 )
			this.operator = new MultiplyOperator();
		else if (operator == 3 )
			this.operator = new MinusOperator();
		else 
			this.operator = new PlusOperator();
	}

	public String getLeftOperand() {
		return leftOperand + "";
	}

	public String getRightOperand() {
		return numberText.get(rightOperand);
	}

	public String getOperator() {
		return operator.toString();
	}

	public int getResult() {
		return operator.operate(leftOperand, rightOperand);
	}

	public String toString() {
		return getLeftOperand() + " " + getOperator() + " " + getRightOperand();
	}

}