package th.own.bomb0069.kata.operator;

public class MultiplyOperator implements Operator{
	public String toString() {
		return "*";
	}

	@Override
	public int operate (int leftOperand, int rightOperand) {
		return leftOperand * rightOperand;
	}
}