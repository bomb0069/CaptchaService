package th.own.bomb0069.kata.operator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Before;

public class MinusOperatorTest {

	Operator minus = new MinusOperator();

	@Before
	public void setUp() {
		minus = new MinusOperator();
	}


	@Test
	public void testCreateNewMinusOperatorShouldBeInstanceOfOperatorInterace() {
		assertTrue(minus instanceof Operator);
	}

	@Test
	public void testCreateNewMinusOperatorShouldBeReturnMinusOnToString() {
		assertEquals("-", minus.toString());
	}

	@Test
	public void testOperate8And5ShouldBe3() {
		assertEquals(3, minus.operate(8, 5));
	}

}