package mainPage;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import Page.MainPage;

import util.BrowserFactory;


public class mainPageTest {

	WebDriver driver;
	
	@Test
	public void mainPageTest1() throws InterruptedException {
		driver = BrowserFactory.init();

		MainPage login = PageFactory.initElements(driver, MainPage.class);
		login.toggleAll();
		login.loginTest1();
		login.AllCheckBox();
		login.removeCheckbox();
		login.toggleAllRemove();
	}
		@After
		public void tarDown() {
		BrowserFactory.tearDown();
		
	}
}
