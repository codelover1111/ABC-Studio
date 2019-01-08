package framework;

import org.openqa.selenium.By;

public class NewsPage extends BasePage{
	private By news = By.xpath("//span[contains(text(),'news')]");
	
	private By recentPressRelease=By.xpath("//span[contains(text(),'Recent Press Releases')]");


	public void clickOnNewsButton() {
		clickOn(news);
	}
  public String verifyTitle() {
	 return verifyNewsPage(recentPressRelease);
	
  }

}
