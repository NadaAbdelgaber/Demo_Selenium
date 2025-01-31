package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.selenium.DriverFactory;

import static utilities.selenium.DriverFactory.driver;


public class Regestration {
public void Register(){
    driver= DriverFactory.getDriver();

    driver.get("https://www.automationexercise.com/login");
 driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("NadatkGafar");
 driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("NTA@gmail.com");
 driver.findElement(By.xpath("//button[normalize-space()='Signup']")).click();
 driver.findElement(By.id("id_gender2")).click();
 driver.findElement(By.id("password")).sendKeys("Car@879875777");
    driver.findElement(By.id("days")).sendKeys(Keys.ENTER);

driver.findElement(By.id("days")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("days")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("days")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("days")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("days")).sendKeys(Keys.ENTER);
driver.findElement(By.id("months")).sendKeys(Keys.ENTER);
driver.findElement(By.id("months")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("months")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("months")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("months")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("months")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("months")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("months")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("months")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("months")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("months")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("months")).sendKeys(Keys.ENTER);
    driver.findElement(By.id("years")).sendKeys(Keys.ENTER);
    driver.findElement(By.id("years")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("years")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("years")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("years")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("years")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("years")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("years")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("years")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("years")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("years")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("years")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("years")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("years")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("years")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("years")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("years")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("years")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("years")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("years")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("years")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("years")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("years")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("years")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("years")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("years")).sendKeys(Keys.ENTER);
    driver.findElement(By.id("newsletter")).click();
    driver.findElement(By.id("first_name")).sendKeys("Nada");
    driver.findElement(By.id("last_name")).sendKeys("Tarek");
    driver.findElement(By.id("last_name")).sendKeys("EtisalatMasr");
    driver.findElement(By.id("address1")).sendKeys("Giza");
    driver.findElement(By.id("address2")).sendKeys("Faysal");
driver.findElement(By.id("country")).sendKeys(Keys.ENTER);
driver.findElement(By.id("country")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("country")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("country")).sendKeys(Keys.ARROW_DOWN);
    driver.findElement(By.id("country")).sendKeys(Keys.ENTER);
driver.findElement(By.id("state")).sendKeys("Egypt");
driver.findElement(By.id("city")).sendKeys("Giza");
driver.findElement(By.id("zipcode")).sendKeys("02");
driver.findElement(By.id("mobile_number")).sendKeys("01118005140");
driver.findElement(By.xpath("//button[normalize-space()='Create Account']")).click();
driver.findElement(By.cssSelector("a[href='/login']")).sendKeys(Keys.ENTER);






}

}
