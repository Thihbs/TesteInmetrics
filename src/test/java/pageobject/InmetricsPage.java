package pageobject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import factory.WebDriverFactory;

public class InmetricsPage  extends BasePage{
	
	

	
	public InmetricsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "linkcarreiras")
	@CacheLookup
	private WebElement BotãoLinkCarreiras;
	
	
	@FindBy(xpath = "//a[@href='https://inmetrics.gupy.io']")
	@CacheLookup
	private WebElement BotãoConfiraVagas;
	
	@FindBy(id = "menu-jobs")
	@CacheLookup
	private WebElement BotãoVagas;
	
	public InmetricsPage ClickBotãoCarreira() {
		click(BotãoLinkCarreiras );
		return this;
	}
	
	
	public InmetricsPage ClickBotãoConfiraVagas() throws InterruptedException {
		Thread.sleep(10000);
		click(BotãoConfiraVagas);
		return this;
	}
	
	public void BotãoVagas() {
		Assert.assertTrue(BotãoVagas.isDisplayed());
	}
	
	

}
