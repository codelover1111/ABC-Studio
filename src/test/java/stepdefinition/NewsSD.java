package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.utils.TakeScreenShot;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.NewsPage;

public class NewsSD {
	
	private NewsPage newsPage = new NewsPage();
	
	
	/*
	 * This method is being used for verify "Title"
	 */
	
	@Given("^user is home page of abcstudios\\.go\\.com$")
	
	public void userIsHomePageOfAbcstudiosGoCom() throws Throwable {
	Assert.assertEquals(SharedSD.getDriver().getTitle(), "ABC Studios", "Invalid Home Page"); 
	}
	
	/*
	 * This method is being used for "Clicking on News"
	 */
	@When("^user click to news$")
	public void userClickToNews() throws Throwable {
		newsPage.clickOnNewsButton();
	   
	}
 
	/*
	 * This method is being used for verify "Recent Press Releases" text
	 */
	@Then("^user able to see resent present realese$")
	public void userAbleToSeeResentPresentRealese() throws Throwable {
		Assert.assertEquals(newsPage.verifyTitle(),"Recent Press Releases");
	}
	
	@Then("^user able to take screen Shot of news page$")
	public void userAbleToTakeScreenShotOfHomePage() throws Throwable {
		TakeScreenShot.captureScreenShot(SharedSD.getDriver(), "news page");
	}

	
}
