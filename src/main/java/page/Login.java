package page;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static utilities.selenium.DriverFactory.driver;


public class Login {
    public  void loginValidUser(){
driver.findElement(By.cssSelector("a[href='/login']")).sendKeys(Keys.ENTER);
driver.findElement(By.cssSelector("input[data-qa='login-email']")).sendKeys("nadatarekabdelgaber@gmail.com");
driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("123456");
driver.findElement(By.cssSelector("button[data-qa='login-button']")).click();



    }


}
