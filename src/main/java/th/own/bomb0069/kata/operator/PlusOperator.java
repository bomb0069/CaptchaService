package th.own.bomb0069.kata.operator;

public class PlusOperator implements Operator{
	public String toString() {
		return "+";
	}

	@Override
	public int operate (int leftOperand, int rightOperand) {
		return leftOperand + rightOperand;
	}
}