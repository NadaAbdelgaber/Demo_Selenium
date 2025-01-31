package logout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.Logout;

import java.time.Duration;

import static utilities.selenium.DriverFactory.driver;

public class logoutTest {
    final Logout logout=new Logout();
    @Test
    public void logOutUser(){
        logout.logoutUser();

    }

}
