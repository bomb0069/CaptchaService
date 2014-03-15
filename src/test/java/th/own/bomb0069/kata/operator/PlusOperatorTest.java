package th.own.bomb0069.kata.operator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Before;

public class PlusOperatorTest {

	Operator plus;

	@Before
	public void setUp () {
		plus = new PlusOperator();
	}

	@Test
	public void testCreateNewPlusOperatorShouldBeInstanceOfOperatorInterace() {
		assertTrue(plus instanceof Operator);
	}

	@Test
	public void testCreateNewPlusOperatorShouldBeReturnPlusOnToString() {
		assertEquals("+", plus.toString());
	}

	@Test
	public void testOperate1And5ShouldBe6() {
		assertEquals(6, plus.operate(1, 5));
	}

}