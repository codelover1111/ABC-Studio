package stepdefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;



public class SharedSD {

	private static final String URL = "https://abcstudios.go.com/";
	private static WebDriver driver = null;


	@Before
	public static void before() {

		 System.setProperty("webdriver.chrome.driver", "/Users/fatemaislam/Downloads/chromedriver");   
		 driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(URL);
	}

	
	@After
	public static void after() {
		if (driver != null) {
			driver.manage().deleteAllCookies();
			driver.quit();
		}
	}

	public static WebDriver getDriver() {
		return driver;
	}
}
