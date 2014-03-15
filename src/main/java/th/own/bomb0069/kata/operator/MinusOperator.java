package th.own.bomb0069.kata.operator;

public class MinusOperator implements Operator{
	public String toString() {
		return "-";
	}

	@Override
	public int operate (int leftOperand, int rightOperand) {
		if (leftOperand < rightOperand)
			throw new InvalidAgrumentToMinusException();
		return leftOperand - rightOperand;
	}
}