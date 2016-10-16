package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatriotsTeam {
	
	WebDriver driver;
	public PatriotsTeam(WebDriver driver){
		this.driver=driver; }
	
	@FindBy(xpath="html/body/div[1]/div[4]/div/div/div[1]/tablecellpadding='0'/table/tbody/tr[45]/td[1]/a")
	public WebElement Srijay;
	@FindBy(xpath="//*[@id='ja-container-fl']/div/div/div[1]/tablecellpadding='0'/table/tbody/tr[49]/td[1]/a")
	public WebElement Suresh;
	@FindBy(xpath="//*[@id='ja-container-fl']/div/div/div[1]/tablecellpadding='0'/table/tbody/tr[51]/td[1]/a")
	public WebElement Vikas;
	
	
	public SrijayProfile clickSrijayProfile() {
		//driver.findElement(By.xpath("//*[@id='ja-container-fl']/div/div/div[1]/tablecellpadding='0'/table/tbody/tr[45]/td[1]/a")).click();
		//Srijay.click();	
		driver.get("http://accleague.org/index.php?option=com_omrcricsys&view=stats&layout=player_detail&vd=1&ua=59&ld=2345&Itemid=94");
		
		return PageFactory.initElements(driver, SrijayProfile.class);
	}
	public void sureshprof(){
		
		Suresh.click();	
	}
	public void vikasprof(){
	
	Vikas.click();	
	}
	

}
