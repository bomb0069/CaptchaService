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

}