package pages;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	WebDriver driver;
	public Homepage(WebDriver driver){
		this.driver=driver;
	}
	

	@FindBy(id="menu82")
	public WebElement AboutAcc;
	@FindBy(id="menu94")
	public WebElement tours;
	@FindBy(css="$$('.menu-item3')")
	public WebElement venues;
	@FindBy(xpath="//*[@id=\"ja-container-fl\"]/div/div/div[1]/table[2]/tbody/tr[14]/td[1]/a")
	public WebElement bigBash;
	


	public BigBashLandingPage clickTournamentsPageAndBigBash() throws InterruptedException {
		tours.click();
		Thread.sleep(3000);
		bigBash.click();
		return PageFactory.initElements(driver, BigBashLandingPage.class);
	}

	public void lctions(){
		venues.click();
	}
	
}
