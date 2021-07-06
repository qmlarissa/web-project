package pageObject.web;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class GetData {
  WebDriver driver;

  public GetData(WebDriver driver) {
    this.driver = driver;
  }

  public void clickSend() {
    driver.findElement(By.xpath("//*[@id=\"wpforms-submit-24\"]")).click();
  }

  public void insertName(String title) {
    driver.findElement(By.xpath("//*[@id=\"wpforms-24-field_1\"]")).sendKeys(title);
  }

  public void insertLastName(String title) {
    driver.findElement(By.xpath("//*[@id=\"wpforms-24-field_1-last\"]")).sendKeys(title);
  }

  public void insertEmail(String title) {
    driver.findElement(By.xpath("//*[@id=\"wpforms-24-field_3\"]")).sendKeys(title);
  }

  public void insertEmailConfirmation(String title) {
    driver.findElement(By.xpath("//*[@id=\"wpforms-24-field_3-secondary\"]")).sendKeys(title);
  }

  public void insertPhoneNumber(String title) {
    driver.findElement(By.xpath("//*[@id=\"wpforms-24-field_10\"]")).sendKeys(title);
  }

  public void insertProgrammingLanguage(String title) {
    driver.findElement(By.xpath("//*[@id=\"wpforms-24-field_9\"]")).sendKeys(title);
  }

  public void clickMenuOption() {
    driver.findElement(By.xpath("//*[@id=\"menu-item-44\"]")).click();
  }

  public void clickAge() {
    driver.findElement(By.xpath("//*[@id=\"wpforms-24-field_5_2\"]")).click();
  }

  public void clickProgrammingLevel() {
    driver.findElement(By.xpath("//*[@id=\"wpforms-24-field_8\"]")).click();
  }
}