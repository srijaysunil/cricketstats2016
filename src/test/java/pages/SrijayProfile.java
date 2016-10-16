package pages;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SrijayProfile {
	WebDriver driver;
	public SrijayProfile(WebDriver driver){
		this.driver=driver; }
	
	

	@FindBy(xpath="//*[@id='ja-container-fl']/div/div/div[1]/table[6]/tbody/tr[6]/td[4]")
	public WebElement runs;
	@FindBy(xpath="//*[@id='ja-container-fl']/div/div/div[1]/table[6]/tbody/tr[6]/td[5]")
	public  WebElement balls;
	@FindBy(xpath="//*[@id='ja-container-fl']/div/div/div[1]/table[7]/tbody/tr[6]/td[8]")
	public WebElement wickets;
	@FindBy(xpath="//*[@id='ja-container-fl']/div/div/div[1]/table[7]/tbody/tr[6]/td[4]")
	public  WebElement overs;
	
	// int myBallCounts = Integer.parseInt(balls.getText());
	
	public int getTotalRuns(){
		return Integer.parseInt(runs.getText());
	}
	public int getBallCount(){
		return Integer.parseInt(balls.getText());
	}
	
	
	public void bowling(){
	System.out.println("Did Srijay take any wickets this year?");
	
	
	int mywickets = Integer.parseInt(wickets.getText());
	int myovers = Integer.parseInt(overs.getText().substring(0, 2));
	if(mywickets<=0){
		System.out.println("No he Didnt");
		
		
	} else {
		System.out.println("Yes he did");
	}
	System.out.println("He got " +mywickets+ " wickets of " + myovers +" Overs");
	
	}
}
