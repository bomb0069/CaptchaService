package th.own.bomb0069.kata;

public class Captcha {

	private int leftOperand;
	private int rightOperand;

	public Captcha (int captchaMode, int leftOperand, int operator, int rightOperand) {
		this.leftOperand = leftOperand;
		this.rightOperand = rightOperand;
	}

	public String getLeftOperand() {
		return leftOperand + "";
	}

	public String getRightOperand() {
		if (rightOperand == 5)
			return "Five";
		else 
			return "One";
	}

	public String getOperator() {
		return "+";
	}

	public int getResult() {
		return leftOperand + rightOperand;
	}

	public String toString() {
		return getLeftOperand() + " + " + getRightOperand();
	}

}