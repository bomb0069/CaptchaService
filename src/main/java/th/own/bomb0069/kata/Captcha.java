package th.own.bomb0069.kata;

import java.util.Map;
import java.util.HashMap;

import th.own.bomb0069.kata.operator.*;

public class Captcha {

	private int captchaMode;
	private int leftOperand;
	private int rightOperand;
	private OperatorSelector operatorSelector;
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
		operatorSelector = new OperatorSelector();

		this.captchaMode = captchaMode;
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
		this.operator = operatorSelector.getOperator(operator);
	}

	public String getLeftOperand() {
		if (captchaMode == 1)
			return leftOperand + "";
		return numberText.get(leftOperand);
	}

	public String getRightOperand() {
		if (captchaMode == 2)
			return rightOperand + "";
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