package th.own.bomb0069.kata;

public class MinusOperator implements Operator{
	public String toString() {
		return "-";
	}

	@Override
	public int operate (int leftOperand, int rightOperand) {
		return leftOperand - rightOperand;
	}
}