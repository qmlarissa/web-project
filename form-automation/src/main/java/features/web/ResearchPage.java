package features.web;

import org.openqa.selenium.WebDriver;
import pageObject.web.*;

public class ResearchPage {
  public WebDriver driver;

  public ResearchPage(WebDriver driver) {
    this.driver = driver;
  }

  public void getData() {
    GetData getData = new GetData(driver);

    getData.clickMenuOption();
    getData.insertName("Nome");
    getData.insertLastName("Last Name");
    getData.insertEmail("test@gmail.com");
    getData.insertEmailConfirmation("test@gmail.com");
    getData.insertPhoneNumber("999999999");
    getData.clickAge();
    getData.insertProgrammingLanguage("Java");
    getData.clickProgrammingLevel();
    getData.clickSend();
  }



}
