package th.own.bomb0069.kata;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class CaptchaTest {
	@Test
	public void testCreateNewCaptchaShouldBeReturnCaptchaObject () {
		Captcha captcha = new Captcha();
		assertTrue(captcha instanceof Captcha);
	}
}