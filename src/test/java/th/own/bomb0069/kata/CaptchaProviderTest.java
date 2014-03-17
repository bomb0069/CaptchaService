package th.own.bomb0069.kata;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CaptchaProviderTest {

	@Test
	public void testCreateCaptchaProviderShouldBeReturnCaptchaProvider() {
		CaptchaProvider captchaProvider = new CaptchaProvider();
		assertTrue(captchaProvider instanceof CaptchaProvider);
	}

	@Test
	public void testGetCaptchaShouldBeReturnInstanceOfCaptcha() {
		CaptchaProvider captchaProvider = new CaptchaProvider();
		assertTrue(captchaProvider.getCaptcha() instanceof Captcha);
	}
}