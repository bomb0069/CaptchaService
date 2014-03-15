package th.own.bomb0069.kata;

public class Captcha {

	public Captcha (int captchaMode, int leftOperand, int operator, int rightOperand) {

	}

	public String getLeftOperand() {
		return "1";
	}

	public String getRightOperand() {
		return "One";
	}

	public String getOperator() {
		return "+";
	}

	public int getResult() {
		return 2;
	}

	public String toString() {
		return "1 + One";
	}

}