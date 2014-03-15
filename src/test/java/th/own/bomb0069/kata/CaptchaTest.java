package th.own.bomb0069.kata;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CaptchaTest {
	@Test
	public void testCreateNewCaptchaShouldBeReturnCaptchaObject () {
		Captcha captcha = new Captcha(1, 1, 1, 1);
		assertTrue(captcha instanceof Captcha);
	}

	@Test
	public void testCreateCaptchaWith1111ShouldBeReturn1PlusOne () {
		Captcha captcha = new Captcha(1, 1, 1, 1);
		assertEquals("1", captcha.getLeftOperand());
		assertEquals("+", captcha.getOperator());
		assertEquals("One", captcha.getRightOperand());
		assertEquals("1 + One", captcha.toString());
		assertEquals(2, captcha.getResult());
	}

	@Test
	public void testCreateCaptchaWith1311ShouldBeReturn3PlusOne () {
		Captcha captcha = new Captcha(1, 3, 1, 1);
		assertEquals("3", captcha.getLeftOperand());
		assertEquals("+", captcha.getOperator());
		assertEquals("One", captcha.getRightOperand());
		assertEquals("3 + One", captcha.toString());
		assertEquals(4, captcha.getResult());
	}

	@Test
	public void testCreateCaptchaWith1315ShouldBeReturn3PlusFive () {
		Captcha captcha = new Captcha(1, 3, 1, 5);
		assertEquals("3", captcha.getLeftOperand());
		assertEquals("+", captcha.getOperator());
		assertEquals("Five", captcha.getRightOperand());
		assertEquals("3 + Five", captcha.toString());
		assertEquals(8, captcha.getResult());
	}

	@Test
	public void testCreateCaptchaWith1325ShouldBeReturn3MultipleFive () {
		Captcha captcha = new Captcha(1, 3, 2, 5);
		assertEquals("3", captcha.getLeftOperand());
		assertEquals("*", captcha.getOperator());
		assertEquals("Five", captcha.getRightOperand());
		assertEquals("3 * Five", captcha.toString());
		assertEquals(15, captcha.getResult());
	}

	@Test
	public void testCreateCaptchaWith1822ShouldBeReturn8MultipleTwo () {
		Captcha captcha = new Captcha(1, 8, 2, 2);
		assertEquals("8", captcha.getLeftOperand());
		assertEquals("*", captcha.getOperator());
		assertEquals("Two", captcha.getRightOperand());
		assertEquals("8 * Two", captcha.toString());
		assertEquals(16, captcha.getResult());
	}

	@Test
	public void testCreateCaptchaWith1413ShouldBeReturn4PlusThree () {
		Captcha captcha = new Captcha(1, 4, 1, 3);
		assertEquals("4", captcha.getLeftOperand());
		assertEquals("+", captcha.getOperator());
		assertEquals("Three", captcha.getRightOperand());
		assertEquals("4 + Three", captcha.toString());
		assertEquals(7, captcha.getResult());
	}

	@Test
	public void testCreateCaptchaWith1433ShouldBeReturn4MinusThree () {
		Captcha captcha = new Captcha(1, 4, 3, 3);
		assertEquals("4", captcha.getLeftOperand());
		assertEquals("-", captcha.getOperator());
		assertEquals("Three", captcha.getRightOperand());
		assertEquals("4 - Three", captcha.toString());
		assertEquals(1, captcha.getResult());
	}

}