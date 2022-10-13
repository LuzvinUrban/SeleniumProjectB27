package com.cydeo.test.userstory;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UserStory10 {
    WebDriver driver;

    @BeforeMethod

    public void setUp(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);

    }
    @Test
    public void Test1 (){
       driver.get("https://qa1.vytrack.com/user/login\n" +"\n");
             //user log in
        WebElement username = driver.findElement(By.xpath("//input[@id='prependedInput']"));

        username.sendKeys("user178");
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("UserUser123");
        WebElement clickButton = driver.findElement(By.xpath("//button[@type='submit']"));
        clickButton.click();

        WebElement fleetModule = driver.findElement(By.xpath("//span[@class='title title-level-1']"));
        fleetModule.click();
        WebElement vehicleModule = driver.findElement(By.xpath(""));
        //Select vehicleModule = new Select()





    }

}
