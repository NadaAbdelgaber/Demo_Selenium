package page;

import org.openqa.selenium.By;

import static utilities.selenium.DriverFactory.driver;

public class Logout {
    public  void logoutUser(){
        driver.findElement(By.cssSelector("a[href='/logout']")).click();



    }
}
