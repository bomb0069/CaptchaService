package th.own.bomb0069.kata;

import java.util.Map;
import java.util.HashMap;

import th.own.bomb0069.kata.operator.*;

public class Captcha {

	private int captchaMode;
	private int leftOperand;
	private int rightOperand;
	private Operator operator;

	private static final int MODE_NUMBER_WITH_TEXT = 1;
	private static final int MODE_TEXT_WITH_NUMBER = 2;

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
		OperatorSelector operatorSelector = new OperatorSelector();

		this.captchaMode = captchaMode;
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
		this.operator = operatorSelector.getOperator(operator);
	}

	public String getLeftOperand() {
		String leftOperandText = "";
		if (captchaMode == MODE_NUMBER_WITH_TEXT)
			leftOperandText = leftOperand + "";
		else 
			leftOperandText = numberText.get(leftOperand);

		return leftOperandText;
	}

	public String getRightOperand() {
		String rightOperandText = "";
		if (captchaMode == MODE_TEXT_WITH_NUMBER)
			rightOperandText = rightOperand + "";
		else
			rightOperandText = numberText.get(rightOperand);
		return rightOperandText;
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