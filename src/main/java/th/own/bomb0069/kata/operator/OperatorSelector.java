package th.own.bomb0069.kata.operator;

public class OperatorSelector {
	public Operator getOperator (int operator) {
		if (operator == 1)
			return new PlusOperator();
		else if (operator == 2) 
			return new MultiplyOperator();
		else 
			return new MinusOperator();
	}
}