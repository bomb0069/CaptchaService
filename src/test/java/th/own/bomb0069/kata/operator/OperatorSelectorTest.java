package th.own.bomb0069.kata.operator;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OperatorSelectorTest {
	@Test
	public void testSelect1ShouldBeReturnPlusOperator() {
		OperatorSelector selector = new OperatorSelector();
		assertTrue(selector.getOperator(1) instanceof PlusOperator);
	}

	@Test
	public void testSelect2ShouldBeReturnMultiplyOperator() {
		OperatorSelector selector = new OperatorSelector();
		assertTrue(selector.getOperator(2) instanceof MultiplyOperator);
	}

	@Test
	public void testSelect3ShouldBeReturnMinusOperator() {
		OperatorSelector selector = new OperatorSelector();
		assertTrue(selector.getOperator(3) instanceof MinusOperator);
	}
}