package com.cydeo.test.day2_locators_getAttribute_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryAppLogin {
    public static void main(String[] args) {
      //  1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

      //  2. Go to https://library2.cydeo.com/login.html
        driver.get("https://library2.cydeo.com/login.html");


      //  3. Enter username: “incorrect@email.com”
 WebElement usernameInput = driver.findElement(By.className("form-control"));
//WebElement usernameInput = driver.findElement(By.id("inputEmail"));
usernameInput.sendKeys("incorrect@email.com");

      //  4. Enter password: “incorrect password”
WebElement passwordInput = driver.findElement(By.id("inoutPassWord"));
passwordInput.sendKeys("incorrect password");


//5.Click to sign in button
       WebElement signinButn = driver.findElement(By.tagName("button"));
       signinButn.click();


        //6. Verify: visually “Sorry, Wrong Email or Password”


        //  displayed
    }
}
