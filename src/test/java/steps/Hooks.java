package steps;



import org.junit.After;
import org.junit.Before;

import factory.WebDriverFactory;
public class Hooks {

	@Before()
	public void setUp() {
		WebDriverFactory.startChromeDriver();
	}

	
	
	@After()
	public void tearDown() {
		WebDriverFactory.killCurrentRunningDriver();

	}
}
