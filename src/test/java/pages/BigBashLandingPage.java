package pages;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BigBashLandingPage {
	WebDriver driver;
	public BigBashLandingPage(WebDriver driver){
		this.driver=driver;
	}
	
	@FindBy(xpath="//*[@id='ja-container-fl']/div/div/div[1]/div[2]/div/table/tbody/tr/td/div/div[1]/div")
	public WebElement games;
	@FindBy(xpath="//*[@id='ja-container-fl']/div/div/div[1]/div[2]/div/table/tbody/tr/td/div/div[2]/div/a")
	public WebElement schdl;
	@FindBy(xpath="//*[@id='ja-container-fl']/div/div/div[1]/div[2]/div/table/tbody/tr/td/div/div[3]/div/a")
	public WebElement topbat;
	@FindBy(xpath="//*[@id='ja-container-fl']/div/div/div[1]/div[2]/div/table/tbody/tr/td/div/div[4]/div/a")
	public WebElement topbowl;
	@FindBy(xpath="//*[@id='ja-container-fl']/div/div/div[1]/div[2]/div/table/tbody/tr/td/div/div[5]/div/a")

	public WebElement teamstand12;
	
	@Test
	public void matches(){
		games.click();
	}
	@Test
	public void schdls(){
		schdl.click();
	}
	@Test
	public void topbatters(){
		topbat.click();
		
	}
	@Test
	public void topbowlers(){
		topbowl.click();
	}
	@Test
	public PatriotsTeam clickTeamStandingsAndClickMyTeam(){
		teamstand12.click();
		WebElement teamname = driver.findElement((By.xpath("//*[@id='ja-container-fl']/div/div/div[1]/table[2]/tbody/tr[22]/td[2]/a")));
		teamname.click();
		
		return PageFactory.initElements(driver, PatriotsTeam.class);
		
		
		
	}
}
