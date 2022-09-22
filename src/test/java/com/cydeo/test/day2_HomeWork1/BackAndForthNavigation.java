package com.cydeo.test.day2_HomeWork1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForthNavigation {
    public static void main(String[] args) {
     //   1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
     //   2- Go to: https://google.com
        driver.get("https://google.com");
       // 3- Click to Gmail from top right.

       // 4- Verify title contains:/  Expected: Gmail

      //  5- Go back to Google by using the .back();
       // 6- Verify title equals: Expected: Google


    }
}
