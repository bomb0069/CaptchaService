package th.own.bomb0069.kata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PlusOperatorTest {

	@Test
	public void testCreateNewPlusOperatorShouldBeInstanceOfOperatorInterace() {
		Operator plus = new PlusOperator();
		assertTrue(plus instanceof Operator);
	}

	@Test
	public void testCreateNewPlusOperatorShouldBeReturnPlusOnToString() {
		Operator plus = new PlusOperator();
		assertEquals("+", plus.toString());
	}

	@Test
	public void testOperate1And5ShouldBe6() {
		Operator plus = new PlusOperator();
		assertEquals(6, plus.operate(1, 5));
	}

}