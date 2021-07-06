package mainTest;

import features.web.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import static settings.Constants.*;


public class Automation {
  public WebDriver driverWeb;


  //Pages portal web
  public ResearchPage researchPage;


  @BeforeGroups("web")
  public void setup() {
    System.setProperty(DRIVER, DRIVER_PATH);
    driverWeb = new ChromeDriver();
    driverWeb.manage().window().maximize();
    driverWeb.navigate().to(TEST_URL);
    driverWeb.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    researchPage = new ResearchPage(driverWeb);

  }

  //Web - Survey
  @Test(groups = "web")
  public void test() {
    researchPage.getData();
  }


}