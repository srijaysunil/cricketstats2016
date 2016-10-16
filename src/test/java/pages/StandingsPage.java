package pages;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StandingsPage {
	
	WebDriver driver;
	public StandingsPage(WebDriver driver){
		this.driver=driver;
	}

	
	
	@FindBy(css=".menu-item2")
	public WebElement tournaments;
	@FindBy(css=".menu-item3")
	public WebElement fields;
	@FindBy(className=".menu-item23")
	public WebElement photos;
	@FindBy(xpath="//*[@id='ja-container-fl']/div/div/div[1]/table[2]/tbody/tr[14]/td[1]/a")
	public WebElement bigbash;
	
	
	@Test
	public BigBashLandingPage tournament(){
		tournaments.click();
		bigbash.click();
		
		return PageFactory.initElements(driver, BigBashLandingPage.class);
	}
	@Test
	public void locations(){
		fields.click();
	}
	@Test
	public void gallery(){
		photos.click();
	}
	
}
