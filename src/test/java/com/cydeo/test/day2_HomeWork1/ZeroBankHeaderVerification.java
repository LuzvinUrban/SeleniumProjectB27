package com.cydeo.test.day2_HomeWork1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankHeaderVerification {
    public static void main(String[] args) {


        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to http://zero.webappsecurity.com/login.html
driver.get("http://zero.webappsecurity.com/login.html");


        // 3. Verify header text// Expected: “ Log in to ZeroBank”
String headerText = "Expected";
String actualText = driver.getPageSource();
    }
}