package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.BigBashLandingPage;
import pages.Homepage;
import pages.PatriotsTeam;
import pages.SrijayProfile;

/**
 * Created by Srijays on 10/16/16.
 */
public class SrijayProfileTest {
   private Homepage homepage;
    private WebDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "/Users/Srijays/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://accleague.org");
        homepage = PageFactory.initElements(driver, Homepage.class);
    }

    @Test
    public void srijayHasAtleast150Balls() throws InterruptedException {
        BigBashLandingPage bigBashLandingPage = homepage.clickTournamentsPageAndBigBash();
        PatriotsTeam patriotsTeam = bigBashLandingPage.clickTeamStandingsAndClickMyTeam();
        SrijayProfile srijayProfile = patriotsTeam.clickSrijayProfile();
        assert (srijayProfile.getBallCount() >= 150);
    }

    @Test
    public void srijayHasAtleast150Runs() throws InterruptedException {
        BigBashLandingPage bigBashLandingPage = homepage.clickTournamentsPageAndBigBash();
        PatriotsTeam patriotsTeam = bigBashLandingPage.clickTeamStandingsAndClickMyTeam();
        SrijayProfile srijayProfile = patriotsTeam.clickSrijayProfile();
        assert (srijayProfile.getTotalRuns() >= 150);
    }

    @After
    public void cleanUp(){
        driver.close();
    }
}
