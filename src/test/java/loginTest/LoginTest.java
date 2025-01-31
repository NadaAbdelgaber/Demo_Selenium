package loginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import page.Login;

import java.time.Duration;

import static utilities.selenium.DriverFactory.driver;

public class LoginTest {
    final Login Login = new Login();
    @Test
    public void loginWithValidCredentails(){
        Reporter.log("");
        Login.loginValidUser();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement ErrorMassageElemnt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > section:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > form:nth-child(2) > p:nth-child(4)")));
        String ErrorMassage=ErrorMassageElemnt.getText();
        Assert.assertEquals("Your email or password is incorrect!",ErrorMassage);

    }
}
