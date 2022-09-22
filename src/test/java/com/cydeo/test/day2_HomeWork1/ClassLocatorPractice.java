package com.cydeo.test.day2_HomeWork1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassLocatorPractice {
    public static void main(String[] args) {
      //  1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       // 2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs ");

       // 3- Click to “Home” link


      //  4- Verify title is as expected:Expected: Practice


       // PS: Locate “Home” link using “className” locator
    }
}
