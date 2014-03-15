package th.own.bomb0069.kata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MinusOperatorTest {

	@Test
	public void testCreateNewMinusOperatorShouldBeInstanceOfOperatorInterace() {
		Operator minus = new MinusOperator();
		assertTrue(minus instanceof Operator);
	}

	@Test
	public void testCreateNewMinusOperatorShouldBeReturnMinusOnToString() {
		Operator minus = new MinusOperator();
		assertEquals("-", minus.toString());
	}

	@Test
	public void testOperate8And5ShouldBe3() {
		Operator minus = new MinusOperator();
		assertEquals(3, minus.operate(8, 5));
	}

}