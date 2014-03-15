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

}