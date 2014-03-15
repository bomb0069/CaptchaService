package th.own.bomb0069.kata.operator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Before;

public class MultiplyOperatorTest {

	Operator multiply;

	@Before
	public void setUp () {
		multiply = new MultiplyOperator();
	}

	@Test
	public void testCreateNewMultiplyOperatorShouldBeInstanceOfOperatorInterace() {
		assertTrue(multiply instanceof Operator);
	}

	@Test
	public void testCreateNewMultiplyOperatorShouldBeReturnMultiplyOnToString() {
		assertEquals("*", multiply.toString());
	}

	@Test
	public void testOperate4And5ShouldBe20() {
		assertEquals(20, multiply.operate(4, 5));
	}

}