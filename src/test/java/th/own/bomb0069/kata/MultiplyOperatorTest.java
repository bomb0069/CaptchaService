package th.own.bomb0069.kata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MultiplyOperatorTest {

	@Test
	public void testCreateNewMultiplyOperatorShouldBeInstanceOfOperatorInterace() {
		Operator multiply = new MultiplyOperator();
		assertTrue(multiply instanceof Operator);
	}

	@Test
	public void testCreateNewMultiplyOperatorShouldBeReturnMultiplyOnToString() {
		Operator multiply = new MultiplyOperator();
		assertEquals("*", multiply.toString());
	}

	@Test
	public void testOperate4And5ShouldBe20() {
		Operator multiply = new MultiplyOperator();
		assertEquals(20, multiply.operate(4, 5));
	}

}